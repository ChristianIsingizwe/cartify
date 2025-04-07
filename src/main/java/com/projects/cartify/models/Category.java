package com.projects.cartify.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    @SequenceGenerator(name = "category_seq", sequenceName = "CATEGORY_SEQ", allocationSize = 40)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category (String name){
        this.name = name;
    }
}
