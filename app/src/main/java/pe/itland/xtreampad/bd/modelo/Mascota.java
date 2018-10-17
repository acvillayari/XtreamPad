package pe.itland.xtreampad.bd.modelo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "mascota")
public class Mascota {

    @Id(autoincrement = true)
    public  Long idMascota;

    @Property(nameInDb = "apodo")
    public String apodo;

    @Property(nameInDb = "edad")
    public int edad;

    @Generated(hash = 1454458176)
    public Mascota(Long idMascota, String apodo, int edad) {
        this.idMascota = idMascota;
        this.apodo = apodo;
        this.edad = edad;
    }

    @Generated(hash = 448102134)
    public Mascota() {
    }

    public Long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Long idMascota) {
        this.idMascota = idMascota;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
