package com.examen2.examen2.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Models.VehiculoModel;
import com.examen2.examen2.Repositories.VehiculoRepository;
import com.examen2.examen2.Services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{
    
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public VehiculoModel crear(VehiculoModel nuevoVehiculo){
        return vehiculoRepository.save(nuevoVehiculo);
    }

    @Override
    public List<VehiculoModel> obtener(){
        return this.vehiculoRepository.findAll();
    }
}
