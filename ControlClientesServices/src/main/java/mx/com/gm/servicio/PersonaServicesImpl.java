
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonaServicesImpl  implements PersonaServices{
    
    @Autowired
    private PersonaDao personaDao;
    

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listaPersona() {
        return (List<Persona>) personaDao.findAll(); 
    }

    @Override
    @Transactional
    public Persona guardar(Persona persona) { 
        return personaDao.save(persona);
    }

    @Override
    @Transactional
    public Persona eliminar(long id) {
        Persona p = personaDao.findById(id).orElse(null);
        if(p != null){
            personaDao.delete(p);
        }
        return p;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(long id) {
       return  personaDao.findById(id).orElse(null);
    }

}
