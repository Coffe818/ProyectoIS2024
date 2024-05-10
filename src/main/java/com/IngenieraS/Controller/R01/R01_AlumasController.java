package com.IngenieraS.Controller.R01;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.IngenieraS.Model.R01.R01_Alumnas_Modelo;
import com.IngenieraS.Repository.R01.R01_RepositorioAlumnas;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Reprorte-registrar-alumas")
public class R01_AlumasController {

    private final org.slf4j.Logger logg = LoggerFactory.getLogger(R01_Alumnas_Modelo.class);
    private String carpeta = "R01/";

    @Autowired
    private R01_RepositorioAlumnas R01_repositorioAlumnas;

    @GetMapping("")
    public String homeR01(Model model) {
        model.addAttribute("alumnas", R01_repositorioAlumnas.findAll());
        return carpeta + "homeR01";
    }

    @GetMapping("/crear_R01")
    public String crear() {
        return carpeta + "crearR01";
    }

    @PostMapping("/save_R01")
    public String save(R01_Alumnas_Modelo R01) {
        logg.info("alumna {}", R01);
        R01_repositorioAlumnas.save(R01);
        return "redirect:/Reprorte-registrar-alumas";
    }

    @GetMapping("/editar_R01/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        @SuppressWarnings("deprecation")
        R01_Alumnas_Modelo r = R01_repositorioAlumnas.getOne(id);
        logg.info("objeto recuperado {}", r);
        model.addAttribute("alumna", r);
        return carpeta + "editarR01";
    }

    @GetMapping("/borrar_R01/{id}")
    public String borrar(@PathVariable Integer id) {
        @SuppressWarnings("deprecation")
        R01_Alumnas_Modelo r = R01_repositorioAlumnas.getOne(id);
        logg.info("objeto recuperado {}", r);
        R01_repositorioAlumnas.delete(r);
        return "redirect:/Reprorte-registrar-alumas";
    }
}
