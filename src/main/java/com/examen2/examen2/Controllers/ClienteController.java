package com.examen2.examen2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Models.ClienteModel;
import com.examen2.examen2.Services.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/carwash/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping("/crear")
    public ClienteModel crear(@RequestBody ClienteModel nuevoCliente){
        return this.clienteServiceImpl.crear(nuevoCliente);
    }

    @GetMapping("/obtener")
    public List<ClienteModel> obtener(){
        return this.clienteServiceImpl.obtener();
    }

    
}
