package Pojos;
// Generated 10-22-2015 07:12:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Docente generated by hbm2java
 */
public class Docente  implements java.io.Serializable {


     private String idDocente;
     private String nombre;
     private String apellido;
     private String correo;
     //private Set cursos = new HashSet(0);

    public Docente() {
    }

	
    public Docente(String idDocente) {
        this.idDocente = idDocente;
    }
    public Docente(String idDocente, String nombre, String apellido, String correo/*, Set cursos*/) {
       this.idDocente = idDocente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correo = correo;
       //this.cursos = cursos;
    }
   
    public String getIdDocente() {
        return this.idDocente;
    }
    
    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
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
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /*public Set getCursos() {
        return this.cursos;
    }
    
    public void setCursos(Set cursos) {
        this.cursos = cursos;
    }*/




}


