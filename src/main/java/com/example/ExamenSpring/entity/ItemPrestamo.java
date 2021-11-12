package com.example.ExamenSpring.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class ItemPrestamo {
    private Integer code;
    private String name;

    public ItemPrestamo(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public abstract void getDiasDevolucion();
}
