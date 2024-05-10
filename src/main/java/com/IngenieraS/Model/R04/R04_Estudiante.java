package com.IngenieraS.Model.R04;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class R04_Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer numero_de_dependientes;
    private Integer ingresos_familiares;
    private String situación_laboral_de_los_padres;

    public R04_Estudiante() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero_de_dependientes() {
        return numero_de_dependientes;
    }

    public void setNumero_de_dependientes(Integer numero_de_dependientes) {
        this.numero_de_dependientes = numero_de_dependientes;
    }

    public Integer getIngresos_familiares() {
        return ingresos_familiares;
    }

    public void setIngresos_familiares(Integer ingresos_familiares) {
        this.ingresos_familiares = ingresos_familiares;
    }

    public String getSituación_laboral_de_los_padres() {
        return situación_laboral_de_los_padres;
    }

    public void setSituación_laboral_de_los_padres(String situación_laboral_de_los_padres) {
        this.situación_laboral_de_los_padres = situación_laboral_de_los_padres;
    }

    @Override
    public String toString() {
        return "R04_Estudiante [id=" + id + ", numero_de_dependientes=" + numero_de_dependientes
                + ", ingresos_familiares=" + ingresos_familiares + ", situación_laboral_de_los_padres="
                + situación_laboral_de_los_padres + "]";
    }

}