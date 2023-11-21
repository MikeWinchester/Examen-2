package com.examen2.examen2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Models.TipoVehiculoModel;
import com.examen2.examen2.Services.Impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/carwash/tipos-vehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculoModel crear(@RequestBody TipoVehiculoModel nuevoTipoVehiculo){
        return this.tipoVehiculoServiceImpl.crear(nuevoTipoVehiculo);
    }
}
