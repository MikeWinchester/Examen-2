package com.examen2.examen2.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TipoVehiculoModel {

    @Id
    @Column(name = "idtipovehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoVehiculo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precioxhora")
    private double precioXHora;

}
