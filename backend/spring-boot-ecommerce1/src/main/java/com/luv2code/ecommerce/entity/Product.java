package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private ProductCategory category;
    private String sku;
    private String name;
    private String description;
    @Column(name= "unit_price" )
    private BigDecimal unitPrice;
    @Column(name= "image_url" )
    private String imageUrl;
    private boolean active;
    @Column(name= "units_in_stock" )
    private int unitsInStock;
    @Column(name= "date_created" )
    @CreationTimestamp
    private Date dateCreated;
    @Column(name= "last_updated" )
    @UpdateTimestamp
    private Date lastUpdated;
}