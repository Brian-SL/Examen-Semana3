package com.example.ExamenSpring.controller;

import com.example.ExamenSpring.entity.*;
import com.example.ExamenSpring.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SistemaController {

    @Autowired
    private SistemaService sistemaService;

    @PostMapping("/agregarCliente")
    public void addCliente(@RequestBody Cliente cliente){
        sistemaService.addCliente(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return sistemaService.getClientes();
    }

    @DeleteMapping("/deleteCliente/{dni}")
    public void removeCliente(@PathVariable("dni") String dni){
        sistemaService.removeCliente(dni);
    }

    @PutMapping("updateCliente")
    public void updateClientes(@RequestBody Cliente cliente){
        sistemaService.updateCliente(cliente);
    }

    @PostMapping("/agregarLibro")
    public void addIteamLibro(@RequestBody Libro libro){
        sistemaService.addItemLibro(libro);
    }
    @PostMapping("/agregarCD")
    public void addIteamCD(@RequestBody CD cd){
        sistemaService.addItemCD(cd);
    }
    @GetMapping("/items")
    public List<ItemPrestamo> getItems(){
        return sistemaService.getItems();
    }
}
