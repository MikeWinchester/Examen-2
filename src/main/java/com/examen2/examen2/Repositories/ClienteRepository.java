package com.examen2.examen2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen2.examen2.Models.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer>{}
