package com.IngenieraS.Model.R03;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class R03_Producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

private String nombreAlumno;
private String Carrera;
private Integer Semestre;



public R03_Producto() {
	super();
}
public R03_Producto(Integer id, String nombreAlumno, String Carrera, Integer Semestre) {
	super();
	this.id = id;
	this.nombreAlumno = nombreAlumno;
	this.Carrera = Carrera;
	this.Semestre = Semestre;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombre() {
	return nombreAlumno;
}
public void setNombre(String nombre) {
	this.nombreAlumno = nombre;
}
public String getDescripcion() {
	return Carrera;
}
public void setDescripcion(String descripcion) {
	this.Carrera = descripcion;
}
public Integer getPrecio() {
	return Semestre;
}
public void setPrecio(Integer precio) {
	this.Semestre = precio;
}
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombreAlumno + ", descripcion=" + Carrera + ", precio=" + Semestre + "]";
}


}
