package com.IngenieraS.Repository.R02;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IngenieraS.Model.R02.R02_AlumnasModelo;



@Repository
public interface R02_RepositorioAlumnas extends JpaRepository<R02_AlumnasModelo, Integer>{
    
}
