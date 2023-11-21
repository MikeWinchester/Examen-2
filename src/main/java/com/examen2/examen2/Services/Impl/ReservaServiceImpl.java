package com.examen2.examen2.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.examen2.Repositories.ReservaRepository;
import com.examen2.examen2.Services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{
    
    @Autowired
    private ReservaRepository reservaRepository;
}
