package com.examen2.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Models.ClienteModel;
import com.examen2.examen2.Repositories.ClienteRepository;
import com.examen2.examen2.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteModel crear(ClienteModel nuevoCliente){
        return this.clienteRepository.save(nuevoCliente);
    }

    @Override
    public List<ClienteModel> obtener(){
        return this.clienteRepository.findAll();
    }
}
