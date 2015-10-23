package Pojos;
// Generated 10-22-2015 07:12:10 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private String idCliente;
     private String nombre;
     private String apellido;
     private Integer edad;
     private String correo;
     private String nacionalidad;
     private String notas;
     private Set detallecursoses = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public Cliente(String idCliente, String nombre, String apellido, Integer edad, String correo, String nacionalidad, String notas, Set detallecursoses) {
       this.idCliente = idCliente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.correo = correo;
       this.nacionalidad = nacionalidad;
       this.notas = notas;
       this.detallecursoses = detallecursoses;
    }
   
    public String getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
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
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getNotas() {
        return this.notas;
    }
    
    public void setNotas(String notas) {
        this.notas = notas;
    }
    public Set getDetallecursoses() {
        return this.detallecursoses;
    }
    
    public void setDetallecursoses(Set detallecursoses) {
        this.detallecursoses = detallecursoses;
    }




}


