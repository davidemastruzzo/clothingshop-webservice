package com.netcetera.clothingshop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Creates a Item.
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
public class Item {

    /**
     * Creates the Field 'name' on the database.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Creates the Field 'price' on the database.
     */
    @Column(name = "price", nullable = false)
    private int price;

    /**
     * Maps all linking pictures to a item.
     */
    @Column(name = "pictures")
    @OneToMany
    private List<Picture> pictures;

    /**
     * Links this Item to a Category.
     */
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private Category category;
}
