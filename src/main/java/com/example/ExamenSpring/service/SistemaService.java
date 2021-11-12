package com.example.ExamenSpring.service;

import com.example.ExamenSpring.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SistemaService {
    private List<Prestamo> prestamosList = new ArrayList<>();
    private List<Cliente> clientesList = new ArrayList<>();
    private List<ItemPrestamo> itemsList = new ArrayList<>();

    public void addCliente(Cliente cliente){
        clientesList.add(cliente);
    }

    public List<Cliente> getClientes(){
        return clientesList;
    }

    public Cliente buscarCliente(String dni){
        return clientesList.stream().filter(cliente -> cliente.getDni().equalsIgnoreCase(dni)).findFirst().get();
    }

    public void removeCliente(String dni){
        Optional<Cliente> optionalCliente = Optional.ofNullable(buscarCliente(dni));

        if (optionalCliente.isPresent()){
            clientesList.remove(optionalCliente.get());
        }
    }

    public void updateCliente(Cliente cliente){
        removeCliente(cliente.getDni());
        clientesList.add(cliente);
    }

    public void addItemLibro(Libro libro){
        itemsList.add(libro);
    }
    public void addItemCD(CD cd){
        itemsList.add(cd);
    }
    public List<ItemPrestamo> getItems(){
        return itemsList;
    }
}
