package com.IngenieraS.Model.R02;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
   name = "Alumnas"
)
public class R02_AlumnasModelo {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Integer id;
   private String nombre;
   private String apellido;
   private String reprote;

   public R02_AlumnasModelo() {
   }

   public R02_AlumnasModelo(Integer id, String nombre, String apellido, String reprote) {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
      this.reprote = reprote;
   }

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return this.apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getReprote() {
      return this.reprote;
   }

   public void setReprote(String reprote) {
      this.reprote = reprote;
   }

   public String toString() {
      String var10000 = String.valueOf(this.id);
      return "R02_AlumnasController [id=" + var10000 + ", nombre=" + this.nombre + ", apellido=" + this.apellido + ", reprote=" + this.reprote + "]";
   }
}
