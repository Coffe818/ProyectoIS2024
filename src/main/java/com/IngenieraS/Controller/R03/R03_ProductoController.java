package com.IngenieraS.Controller.R03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.IngenieraS.Model.R03.R03_Producto;
import com.IngenieraS.Repository.R03.R03_ProductoRepository;

@Controller
@RequestMapping("/Reprorte-talleres") // Http:localhost:8080/productos
public class R03_ProductoController {

	private final Logger logg = LoggerFactory.getLogger(R03_Producto.class);

	@Autowired
	private R03_ProductoRepository productoRepository;

	private String carpeta = "R03/";

	@GetMapping("")

	public String home(Model model) {

		model.addAttribute("productos", productoRepository.findAll());
		return carpeta + "home";
	}

	@GetMapping("/create") // http:localhost:8080/productos/create
	public String create() {
		return carpeta + "create";
	}

	@PostMapping("/save")
	public String save(R03_Producto producto) {
		logg.info("Informacion del objeto producto, {}", producto);
		productoRepository.save(producto);
		return "redirect:/Reprorte-talleres";

	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		@SuppressWarnings("deprecation")
		R03_Producto p = productoRepository.getOne(id);
		logg.info("Objeto recuperado {}", p);
		model.addAttribute("producto", p);

		return carpeta + "edit";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		@SuppressWarnings("deprecation")
		R03_Producto p = productoRepository.getOne(id);
		logg.info("Objeto eliminado {}", p);
		productoRepository.delete(p);
		return "redirect:/Reprorte-talleres";
	}

}