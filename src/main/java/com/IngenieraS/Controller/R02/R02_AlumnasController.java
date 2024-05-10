package com.IngenieraS.Controller.R02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.IngenieraS.Model.R02.R02_AlumnasModelo;
import com.IngenieraS.Repository.R02.R02_RepositorioAlumnas;

@Controller
@RequestMapping("/Reporte-conducta") // http:localhost:8080/alumnas
public class R02_AlumnasController {

   private final Logger logg = LoggerFactory.getLogger(R02_AlumnasModelo.class);

   @Autowired
   private R02_RepositorioAlumnas AlumnasRepository;
   private String carpeta = "R02/";

   @GetMapping("")
   public String home(Model model) {

      model.addAttribute("alumnas", AlumnasRepository.findAll());
      return carpeta + "home";
   }

   @GetMapping("/create") // http:localhost:8080/alumnas/create
   public String create() {
      return carpeta + "create";
   }

   @PostMapping("/save") // http:localhost:8080/alumnas/save
   public String save(R02_AlumnasModelo r02_alumnasmodelo) {
      logg.info("Informacion del Reporte", r02_alumnasmodelo);
      AlumnasRepository.save(r02_alumnasmodelo);
      return "redirect:/Reporte-conducta";
   }

   @GetMapping("/edit/{id}")
   public String edit(@PathVariable Integer id, Model model) {
      @SuppressWarnings("deprecation")
      R02_AlumnasModelo a = AlumnasRepository.getOne(id);
      logg.info("Alumna recuperada", a);
      model.addAttribute("alumnas", a);
      return carpeta + "edit";
   }

   @GetMapping("/delete/{id}")
   public String delete(@PathVariable Integer id) {
      @SuppressWarnings("deprecation")
      R02_AlumnasModelo a = AlumnasRepository.getOne(id);
      logg.info("Alumna eliminado", a);
      AlumnasRepository.delete(a);
      return "redirect:/Reporte-conducta";
   }

}
