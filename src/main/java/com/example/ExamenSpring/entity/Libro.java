package com.example.ExamenSpring.entity;

public class Libro extends ItemPrestamo{

    public Libro(Integer code, String name) {
        super(code, name);
    }

    @Override
    public void getDiasDevolucion() {

    }
}
