package com.example.back.domain.DTO;


import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class ProductDTO {

    @NotNull()
    private String name;

    @NotNull()
    private String brand;

    private String description;
}
