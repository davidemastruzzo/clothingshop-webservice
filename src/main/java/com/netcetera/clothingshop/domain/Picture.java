package com.netcetera.clothingshop.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Creates a picture.
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "picture")
public class Picture {

    /**
     * Creates the field 'name' on the database.
     */
    @Column(name = "name", nullable = false, unique = false)
    private String name;

    /**
     * Creates the field 'image' on the database.
     */
    @Column(name = "image", nullable = true,unique = false)
    private byte[] image;

    /**
     * Links this picture to a location.
     */
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private Item item;
}
