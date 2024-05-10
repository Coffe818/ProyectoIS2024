package com.IngenieraS.Controller.R04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.IngenieraS.Model.R04.R04_Estudiante;
import com.IngenieraS.Repository.R04.R04_EstudianteRepositorio;


@Controller
@RequestMapping("/Reporte-socioeconomico")
public class R04_SocioeconomicoController {

    @Autowired
    private R04_EstudianteRepositorio repositorio;

    private String carpeta = "R04/";

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("reportes", repositorio.findAll());
        return carpeta+"homeR04";
    }

    @GetMapping("/create") 
    public String create(Model model) {
        model.addAttribute("reportes", repositorio.findAll());
        return carpeta+"crearR04";
    }

    @PostMapping("/save")
    public String save(R04_Estudiante r04_Estudiante) {
        repositorio.save(r04_Estudiante);
        return "redirect:/Reporte-socioeconomico";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        @SuppressWarnings("deprecation")
        R04_Estudiante a = repositorio.getOne(id);
        model.addAttribute("reportes", a);
        return carpeta+"editarR04";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        @SuppressWarnings("deprecation")
        R04_Estudiante a = repositorio.getOne(id);
        repositorio.delete(a);
        return "redirect:/Reporte-socioeconomico";
    }

}
