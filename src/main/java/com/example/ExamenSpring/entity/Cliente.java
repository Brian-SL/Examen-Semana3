package com.example.ExamenSpring.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Cliente {
    private String name;
    private String dni;
    private String address;
    private List<Prestamo> prestamosList;

    public Cliente(String name, String dni, String address) {
        this.name = name;
        this.dni = dni;
        this.address = address;
    }

    public void addPrestamo(Prestamo prestamo){
        prestamosList.add(prestamo);
    }
}
