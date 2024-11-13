package com.example.back.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "marca", nullable = false, length = 100)
    private String brand;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String description;
}
