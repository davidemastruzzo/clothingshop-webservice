package com.netcetera.clothingshop.converter;

import com.netcetera.clothingshop.domain.Category;
import com.netcetera.clothingshop.domain.Item;
import com.netcetera.clothingshop.dto.CategoryDto;
import com.netcetera.clothingshop.dto.ItemDto;
import lombok.NonNull;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class CategoryConverter {

    private CategoryConverter() {
        //no instances needed
    }

    static CategoryDto convert(@NonNull Category category) {
        return CategoryDto.builder()
                .name(category.getName())
                .build();
    }
}
