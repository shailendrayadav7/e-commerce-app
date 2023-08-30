package com.takeo.ecommerce.model;

package com.yourcompany.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    // Getters and setters

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    // Getters and setters
}

