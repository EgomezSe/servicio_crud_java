package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Persona {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String email;
    @NotEmpty
    private String telefono;
    
    private String personaToString(){
        return "idPersona:"+getIdPersona().toString()+";nombre:"+getNombre()+";apellido:"+getApellido()+";email:"+getEmail()+";telefono:"+getTelefono();
    }

    public String getTelefono() {
        return  this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public String getApellido() {
        return  this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Object getIdPersona() {
        return  this.idPersona;
    }

    public void setIdPersona(long id) {
        this.idPersona  = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
