package com.examen2.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Models.TipoClienteModel;
import com.examen2.examen2.Repositories.TipoClienteRepository;
import com.examen2.examen2.Services.TipoClienteService;

@Service
public class TipoClienteImpl implements TipoClienteService {
    
    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoClienteModel crear(TipoClienteModel nuevoTipoClienteModel){
        return tipoClienteRepository.save(nuevoTipoClienteModel);
    }
}
