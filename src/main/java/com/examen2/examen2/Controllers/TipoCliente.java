package com.examen2.examen2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Models.TipoClienteModel;
import com.examen2.examen2.Services.Impl.TipoClienteImpl;

@RestController
@RequestMapping("/carwash/tipos-cliente")
public class TipoCliente {

    @Autowired
    private TipoClienteImpl tipoClienteImpl;
    
    @PostMapping("/crear")
    public TipoClienteModel crear(@RequestBody TipoClienteModel nuevoTipoCliente){
        return this.tipoClienteImpl.crear(nuevoTipoCliente);
    }
}
