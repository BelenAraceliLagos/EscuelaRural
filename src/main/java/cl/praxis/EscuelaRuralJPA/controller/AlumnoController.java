package cl.praxis.EscuelaRuralJPA.controller;

import cl.praxis.EscuelaRuralJPA.model.entities.Alumno;
import cl.praxis.EscuelaRuralJPA.model.service.AlumnoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("Alumnos")
public class AlumnoController {

    private final AlumnoService service;

    public AlumnoController(AlumnoService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("alumnos", service.findAll());
        return "alumnosList";
    }

    @GetMapping("/{rut}")
    public String findOne(@PathVariable("rut") String rut, Model model){
        model.addAttribute("alumno", service.findOne(rut));
        return "alumnoEdit";
    }

    @PostMapping
    public String update(@ModelAttribute Alumno alumno){
        boolean result = service.update(alumno);
        return "redirect:/alumnos";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Alumno alumno){
        boolean result = service.create(alumno);

        return "redirect:/alumnos";
    }
    @GetMapping("/{rut}/del")
    public String delete(@PathVariable("rut") String rut){
        boolean result = service.delete(rut);

        return "redirect:/alumnos";
    }
}
