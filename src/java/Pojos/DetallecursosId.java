package Pojos;
// Generated 10-22-2015 07:12:10 PM by Hibernate Tools 4.3.1



/**
 * DetallecursosId generated by hbm2java
 */
public class DetallecursosId  implements java.io.Serializable {


     private String curso;
     private String cliente;

    public DetallecursosId() {
    }

    public DetallecursosId(String curso, String cliente) {
       this.curso = curso;
       this.cliente = cliente;
    }
   
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCliente() {
        return this.cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetallecursosId) ) return false;
		 DetallecursosId castOther = ( DetallecursosId ) other; 
         
		 return ( (this.getCurso()==castOther.getCurso()) || ( this.getCurso()!=null && castOther.getCurso()!=null && this.getCurso().equals(castOther.getCurso()) ) )
 && ( (this.getCliente()==castOther.getCliente()) || ( this.getCliente()!=null && castOther.getCliente()!=null && this.getCliente().equals(castOther.getCliente()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCurso() == null ? 0 : this.getCurso().hashCode() );
         result = 37 * result + ( getCliente() == null ? 0 : this.getCliente().hashCode() );
         return result;
   }   


}


