package mx.com.gm.web;

import java.util.List;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class ControladorInicio {

    @Autowired
    private PersonaServices personaService;

   @GetMapping
    public List<Persona>listar(){
        return personaService.listaPersona();
    }
    
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return personaService.guardar(p);
    }
    
    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id") long id){
        return personaService.encontrarPersona(id);
    }

    @PutMapping(path = {"/{id}"})
    public Persona editar(@RequestBody Persona p, @PathVariable("id") long id){
        p.setIdPersona(id);
        return personaService.guardar(p);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Persona Delete(@PathVariable("id") long id){
        return personaService.eliminar(id);
    }
}