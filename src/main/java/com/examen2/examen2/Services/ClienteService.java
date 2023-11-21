package com.examen2.examen2.Services;

import java.util.List;

import com.examen2.examen2.Models.ClienteModel;

public interface ClienteService {

    public ClienteModel crear(ClienteModel nuevoCliente);

    public List<ClienteModel> obtener();
}
