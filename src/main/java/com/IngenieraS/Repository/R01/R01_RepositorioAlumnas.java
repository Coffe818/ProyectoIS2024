package com.IngenieraS.Repository.R01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IngenieraS.Model.R01.R01_Alumnas_Modelo;

@Repository
public interface R01_RepositorioAlumnas extends JpaRepository<R01_Alumnas_Modelo, Integer> {

} 
