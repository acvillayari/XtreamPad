package pe.itland.xtreampad.bd.modelo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import java.util.Date;

@Entity(nameInDb = "Home_Principal")
public class Home_Principal {

    @Id(autoincrement = true)
    @Property(nameInDb = "home_principal_id")
    public  Long home_principal_id;

    @Property(nameInDb = "name")
    public String name;

    @Property(nameInDb = "image_principal")
    public String image_principal;

    @Property(nameInDb = "logo_cliente")
    public String logo_cliente;

    @Property(nameInDb = "logo_proveedor")
    public String logo_proveedor;

    @Property(nameInDb = "deleted")
    public boolean deleted;

    @Property(nameInDb = "insert_date")
    public Date insert_date;

    @Property(nameInDb = "insert_user")
    public int insert_user;

    @Property(nameInDb = "update_date")
    public Date update_date;

    @Property(nameInDb = "update_user")
    public int update_user;

    @Generated(hash = 1073739328)
    public Home_Principal(Long home_principal_id, String name, String image_principal, String logo_cliente, String logo_proveedor,
            boolean deleted, Date insert_date, int insert_user, Date update_date, int update_user) {
        this.home_principal_id = home_principal_id;
        this.name = name;
        this.image_principal = image_principal;
        this.logo_cliente = logo_cliente;
        this.logo_proveedor = logo_proveedor;
        this.deleted = deleted;
        this.insert_date = insert_date;
        this.insert_user = insert_user;
        this.update_date = update_date;
        this.update_user = update_user;
    }

    @Generated(hash = 1662091487)
    public Home_Principal() {
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

    public String getImage_principal() {
        return image_principal;
    }

    public void setImage_principal(String image_principal) {
        this.image_principal = image_principal;
    }

    public String getLogo_cliente() {
        return logo_cliente;
    }

    public void setLogo_cliente(String logo_cliente) {
        this.logo_cliente = logo_cliente;
    }

    public String getLogo_proveedor() {
        return logo_proveedor;
    }

    public void setLogo_proveedor(String logo_proveedor) {
        this.logo_proveedor = logo_proveedor;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(Date insert_date) {
        this.insert_date = insert_date;
    }

    public int getInsert_user() {
        return insert_user;
    }

    public void setInsert_user(int insert_user) {
        this.insert_user = insert_user;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public int getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(int update_user) {
        this.update_user = update_user;
    }

    public boolean getDeleted() {
        return this.deleted;
    }
}
