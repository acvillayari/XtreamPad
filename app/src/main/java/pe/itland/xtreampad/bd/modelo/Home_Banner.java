package pe.itland.xtreampad.bd.modelo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

@Entity(nameInDb = "Home_Banner")
public class Home_Banner {

    @Id(autoincrement = true)
    @Property(nameInDb = "home_banner_id")
    public  Long home_banner_id;

    @Property(nameInDb = "home_principal_id")
    public Long home_principal_id;

    @Property(nameInDb = "name")
    public String name;

    @Property(nameInDb = "image_path")
    public String image_path;

    @Property(nameInDb = "deleted")
    public boolean deleted;

    @Generated(hash = 933221508)
    public Home_Banner(Long home_banner_id, Long home_principal_id, String name, String image_path, boolean deleted) {
        this.home_banner_id = home_banner_id;
        this.home_principal_id = home_principal_id;
        this.name = name;
        this.image_path = image_path;
        this.deleted = deleted;
    }
    @Generated(hash = 1913845171)
    public Home_Banner() {
    }
    public Long getHome_banner_id() {
        return home_banner_id;
    }

    public void setHome_banner_id(Long home_banner_id) {
        this.home_banner_id = home_banner_id;
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
