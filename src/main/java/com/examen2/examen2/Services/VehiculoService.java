package com.examen2.examen2.Services;

import java.util.List;

import com.examen2.examen2.Models.VehiculoModel;

public interface VehiculoService {
    
    public VehiculoModel crear(VehiculoModel nuevoVehiculo);

    public List<VehiculoModel> obtener();
}
