package entidades;
// Generated 24-may-2019 12:46:31 by Hibernate Tools 4.3.1



/**
 * Mascota generated by hbm2java
 */
public class Mascota  implements java.io.Serializable {


     private int idMascota;
     private String nombremascota;
     private String nonbrecliente;
     private String raza;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombremascota, String nonbrecliente, String raza) {
       this.idMascota = idMascota;
       this.nombremascota = nombremascota;
       this.nonbrecliente = nonbrecliente;
       this.raza = raza;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public String getNombremascota() {
        return this.nombremascota;
    }
    
    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }
    public String getNonbrecliente() {
        return this.nonbrecliente;
    }
    
    public void setNonbrecliente(String nonbrecliente) {
        this.nonbrecliente = nonbrecliente;
    }
    public String getRaza() {
        return this.raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }

  
    

}

