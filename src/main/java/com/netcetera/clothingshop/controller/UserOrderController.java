package com.netcetera.clothingshop.controller;

import com.netcetera.clothingshop.domain.Item;
import com.netcetera.clothingshop.domain.UserOrder;
import com.netcetera.clothingshop.dto.ItemDto;
import com.netcetera.clothingshop.dto.UserOrderDto;
import com.netcetera.clothingshop.repository.ItemRepository;
import com.netcetera.clothingshop.repository.OrderRepository;
import com.netcetera.rest.WebServiceUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(path = WebServiceUrl.Order)
@RestController
public class UserOrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/place")
    public ResponseEntity placeOrder(@RequestBody UserOrderDto userOrderDto){
        List<Item> items = userOrderDto.getItems().stream().map(this::findItem).collect(Collectors.toList());
        UserOrder userOrder = UserOrder.builder()
                .firstName(userOrderDto.getFirstName())
                .lastName(userOrderDto.getLastName())
                .street(userOrderDto.getStreet())
                .plz(userOrderDto.getPlz())
                .phoneNumber(userOrderDto.getPhoneNumber())
                .country(userOrderDto.getCountry())
                .items(items)
                .build();
        orderRepository.save(userOrder);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Item findItem(ItemDto itemDto){
        return itemRepository.getOne(itemDto.getId());
    }
}
