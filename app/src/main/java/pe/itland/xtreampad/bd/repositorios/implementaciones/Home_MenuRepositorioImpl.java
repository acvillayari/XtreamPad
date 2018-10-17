package pe.itland.xtreampad.bd.repositorios.implementaciones;


import pe.itland.xtreampad.bd.modelo.Home_Menu;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_MenuRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class Home_MenuRepositorioImpl implements Home_MenuRepositorio {

    private DaoSession daoSession;

    public Home_MenuRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public Home_Menu searchById(long id) {
        return this.daoSession.getHome_MenuDao().load(id);
    }

    @Override
    public void save(Home_Menu home_menu) {
        this.daoSession.getHome_MenuDao().save(home_menu);
    }

    @Override
    public void deleteById(long id) {
        this.daoSession.getHome_MenuDao().deleteByKey(id);
    }
}
