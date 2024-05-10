package com.IngenieraS.Model.R01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "R01_alumnas")
public class R01_Alumnas_Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer R01_id_alumna;
    
    private Integer R01_matricula;
    private String R01_nombre;
    private String R01_apellido;
    private String R01_ciudad;
    private Integer R01_telefono;

    public R01_Alumnas_Modelo() {
    }

    public R01_Alumnas_Modelo(Integer r01_id_alumna, Integer r01_matricula, String r01_nombre, String r01_apellido,
            String r01_ciudad, Integer r01_telefono) {
        R01_id_alumna = r01_id_alumna;
        R01_matricula = r01_matricula;
        R01_nombre = r01_nombre;
        R01_apellido = r01_apellido;
        R01_ciudad = r01_ciudad;
        R01_telefono = r01_telefono;
    }

    public Integer getR01_id_alumna() {
        return R01_id_alumna;
    }

    public void setR01_id_alumna(Integer r01_id_alumna) {
        R01_id_alumna = r01_id_alumna;
    }

    public Integer getR01_matricula() {
        return R01_matricula;
    }

    public void setR01_matricula(Integer r01_matricula) {
        R01_matricula = r01_matricula;
    }

    public String getR01_nombre() {
        return R01_nombre;
    }

    public void setR01_nombre(String r01_nombre) {
        R01_nombre = r01_nombre;
    }

    public String getR01_apellido() {
        return R01_apellido;
    }

    public void setR01_apellido(String r01_apellido) {
        R01_apellido = r01_apellido;
    }

    public String getR01_ciudad() {
        return R01_ciudad;
    }

    public void setR01_ciudad(String r01_ciudad) {
        R01_ciudad = r01_ciudad;
    }

    public Integer getR01_telefono() {
        return R01_telefono;
    }

    public void setR01_telefono(Integer r01_telefono) {
        R01_telefono = r01_telefono;
    }

    @Override
    public String toString() {
        return "R01_Alumnas_Modelo [R01_id_alumna=" + R01_id_alumna + ", R01_matricula=" + R01_matricula
                + ", R01_nombre=" + R01_nombre + ", R01_apellido=" + R01_apellido + ", R01_ciudad=" + R01_ciudad
                + ", R01_telefono=" + R01_telefono + "]";
    }




}
