package pe.itland.xtreampad.bd.modelo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "Home_Menu")
public class Home_Menu {

    @Id(autoincrement = true)
    @Property(nameInDb = "home_menu_id")
    public  Long home_menu_id;

    @Property(nameInDb = "home_principal_id")
    public Long home_principal_id;

    @Property(nameInDb = "name")
    public String name;

    @Property(nameInDb = "image_path")
    public String image_path;

    @Property(nameInDb = "deleted")
    public boolean deleted;

    @Generated(hash = 702599134)
    public Home_Menu(Long home_menu_id, Long home_principal_id, String name, String image_path, boolean deleted) {
        this.home_menu_id = home_menu_id;
        this.home_principal_id = home_principal_id;
        this.name = name;
        this.image_path = image_path;
        this.deleted = deleted;
    }

    @Generated(hash = 1632403266)
    public Home_Menu() {
    }

    public Long getHome_menu_id() {
        return home_menu_id;
    }

    public void setHome_menu_id(Long home_menu_id) {
        this.home_menu_id = home_menu_id;
    }

    public Long getHome_principal_id() {
        return home_principal_id;
    }

    public void setHome_principal_id(Long home_principal_id) {
        this.home_principal_id = home_principal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getDeleted() {
        return this.deleted;
    }
}
