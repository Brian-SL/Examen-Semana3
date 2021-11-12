package com.example.ExamenSpring.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Prestamo {
    private String date;
    private ItemPrestamo itemPrestamo;
    private Date returnDate;
    private String state;

}
