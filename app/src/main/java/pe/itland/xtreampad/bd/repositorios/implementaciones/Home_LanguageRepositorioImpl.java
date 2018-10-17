package pe.itland.xtreampad.bd.repositorios.implementaciones;


import pe.itland.xtreampad.bd.modelo.Home_Language;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_LanguageRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class Home_LanguageRepositorioImpl implements Home_LanguageRepositorio {

    private DaoSession daoSession;

    public Home_LanguageRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public Home_Language searchById(long id) {
        return this.daoSession.getHome_LanguageDao().load(id);
    }

    @Override
    public void save(Home_Language home_language) {
        this.daoSession.getHome_LanguageDao().save(home_language);
    }

    @Override
    public void deleteById(long id) {
        this.daoSession.getHome_LanguageDao().deleteByKey(id);
    }
}
