package com.IngenieraS.Repository.R03;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IngenieraS.Model.R03.R03_Producto;



@Repository


public interface R03_ProductoRepository extends JpaRepository<R03_Producto, Integer>{
	
	

}