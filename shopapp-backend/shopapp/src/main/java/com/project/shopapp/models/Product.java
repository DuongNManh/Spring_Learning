package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 350)
    private String name;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "thumbnail", length = 300)
    private String thumbnail;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id") // or @JoinColumn(name = "category_id") here?
    // The @JoinColumn annotation is used to specify the foreign key column in the owner of the relationship.
    // so that the anotation here should be @JoinColumn(name = "category_id") instead of @JoinColumn(name = "category")
    private Category category;
    // The @ManyToOne annotation is used to define a many-to-one relationship between two entities.

}
