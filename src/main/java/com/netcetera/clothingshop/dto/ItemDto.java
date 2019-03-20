package com.netcetera.clothingshop.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ItemDto {
    private long id;
    private String name;
    private int price;
    private String category;
    private List<PictureDto> pictures;
}
