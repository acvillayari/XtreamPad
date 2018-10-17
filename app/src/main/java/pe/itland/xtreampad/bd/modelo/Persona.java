package pe.itland.xtreampad.bd.modelo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "persona")
public class Persona {

    @Id(autoincrement = true)
    private Long idPersona;

    @Property(nameInDb = "nombres")
    private String nombres;

    @Property(nameInDb = "edad")
    private  int edad;


    @Generated(hash = 1687422654)
    public Persona(Long idPersona, String nombres, int edad) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.edad = edad;
    }

    @Generated(hash = 1270265349)
    public Persona() {
    }
    

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
