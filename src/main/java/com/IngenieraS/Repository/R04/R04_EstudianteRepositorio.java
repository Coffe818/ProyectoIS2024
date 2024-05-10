package com.IngenieraS.Repository.R04;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IngenieraS.Model.R04.R04_Estudiante;

@Repository
public interface R04_EstudianteRepositorio extends JpaRepository<R04_Estudiante, Integer>{

}
