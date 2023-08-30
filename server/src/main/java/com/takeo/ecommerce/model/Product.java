package com.takeo.ecommerce.model;

package com.yourcompany.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int stockQuantity;

    // Getters and setters

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItems;

    @OneToMany(mappedBy = "product")
    private List<WishlistItem> wishlistItems;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;

    // Getters and setters
}

