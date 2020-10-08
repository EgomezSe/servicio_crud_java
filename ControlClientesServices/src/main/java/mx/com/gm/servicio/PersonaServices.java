
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;


public interface PersonaServices {
    
    public List<Persona> listaPersona();
    
    public Persona guardar(Persona persona);
    
    public Persona eliminar(long id);
    
    public Persona encontrarPersona(long id);
    

}
