package com.examen2.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Models.TipoVehiculoModel;
import com.examen2.examen2.Repositories.TipoVehiculoRepository;
import com.examen2.examen2.Services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{
    
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculoModel crear(TipoVehiculoModel nuevoTipoVehiculo){
        return this.tipoVehiculoRepository.save(nuevoTipoVehiculo);
    }
}
