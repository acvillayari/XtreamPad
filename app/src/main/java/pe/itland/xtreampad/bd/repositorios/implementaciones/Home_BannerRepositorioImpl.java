package pe.itland.xtreampad.bd.repositorios.implementaciones;


import pe.itland.xtreampad.bd.modelo.Home_Banner;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_BannerRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class Home_BannerRepositorioImpl implements Home_BannerRepositorio {

    private DaoSession daoSession;

    public Home_BannerRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public Home_Banner searchById(long id) {
        return this.daoSession.getHome_BannerDao().load(id);
    }

    @Override
    public void save(Home_Banner home_banner) {
        this.daoSession.getHome_BannerDao().save(home_banner);
    }

    @Override
    public void deleteById(long id) {
        this.daoSession.getHome_BannerDao().deleteByKey(id);
    }
}
