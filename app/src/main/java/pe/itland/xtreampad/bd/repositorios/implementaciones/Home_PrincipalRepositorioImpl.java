package pe.itland.xtreampad.bd.repositorios.implementaciones;


import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_PrincipalRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class Home_PrincipalRepositorioImpl implements Home_PrincipalRepositorio {

    private DaoSession daoSession;

    public Home_PrincipalRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public Home_Principal searchById(long id) {
        return this.daoSession.getHome_PrincipalDao().load(id);
    }

    @Override
    public void save(Home_Principal home_principal) {
        this.daoSession.getHome_PrincipalDao().save(home_principal);
    }

    @Override
    public void deleteById(long id) {
        this.daoSession.getHome_PrincipalDao().deleteByKey(id);
    }
}
