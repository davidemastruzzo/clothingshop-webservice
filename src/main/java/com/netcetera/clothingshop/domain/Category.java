package com.netcetera.clothingshop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;


/**
 * Creates a Category.
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "category")
public class Category extends BaseEntity {

    /**
     * Creates the Field 'name' on the database.
     */
    @Column(name = "name")
    private String name;

    /**
     * Maps all linking items to a category.
     */
    @Column(name = "items")
    @OneToMany(mappedBy = "category")
    private List<Item> items;
}
