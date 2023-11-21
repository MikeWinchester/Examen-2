package com.examen2.examen2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.Models.VehiculoModel;
import com.examen2.examen2.Services.Impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/carwash/vehiculos")
public class VehiculoController {
    
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear")
    public VehiculoModel crear(@RequestBody VehiculoModel nuevoVehiculo){
        return this.vehiculoServiceImpl.crear(nuevoVehiculo);
    }

    @GetMapping("/obtener")
    public List<VehiculoModel> obtener(){
        return this.vehiculoServiceImpl.obtener();
    }
}
