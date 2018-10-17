package pe.itland.xtreampad.di.modulos;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.MascotaRepositorio;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.PersonaRepositorio;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_PrincipalRepositorio;
import pe.itland.xtreampad.mvp.contratos.Home_GastronomyContrato;
import pe.itland.xtreampad.mvp.contratos.MascotaContrato;
import pe.itland.xtreampad.mvp.contratos.PersonasContrato;
import pe.itland.xtreampad.mvp.contratos.Home_PrincipalContrato;
import pe.itland.xtreampad.mvp.contratos.Home_TimeContrato;
import pe.itland.xtreampad.mvp.contratos.TimeValueContrato;
import pe.itland.xtreampad.mvp.presenters.Home_GastronomyPresenter;
import pe.itland.xtreampad.mvp.presenters.MascotaPresenter;
import pe.itland.xtreampad.mvp.presenters.PersonasPresenter;
import pe.itland.xtreampad.mvp.presenters.Home_PrincipalPresenter;
import pe.itland.xtreampad.mvp.presenters.Home_TimePresenter;
import pe.itland.xtreampad.mvp.presenters.TimeValuePresenter;

@Module
public class XtreampadModulo {

    private XtreampadApp application;

    public XtreampadModulo(XtreampadApp application) {

        this.application = application;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return application;
    }


    @Singleton
    @Provides
    public PersonasContrato.Presenter providePersonasContratoPresenter(PersonaRepositorio personaRepositorio){
        return  new PersonasPresenter(personaRepositorio);

    }

    @Singleton
    @Provides
    public MascotaContrato.Presenter provideMascotaContratoPresenter(MascotaRepositorio mascotaRepositorio){
        return  new MascotaPresenter(mascotaRepositorio);
    }

    @Singleton
    @Provides
    public Home_PrincipalContrato.Presenter provideHome_PrincipalContratoPresenter(Home_PrincipalRepositorio home_principalRepositorio){
        return  new Home_PrincipalPresenter(home_principalRepositorio);
    }

    @Singleton
    @Provides
    public Home_TimeContrato.Presenter provideHome_TimeContratoPresenter(Home_PrincipalRepositorio home_principalRepositorio){
        return  new Home_TimePresenter(home_principalRepositorio);
    }

    @Singleton
    @Provides
    public TimeValueContrato.Presenter provideTimeValueContratoPresenter(Home_PrincipalRepositorio home_principalRepositorio){
        return  new TimeValuePresenter(home_principalRepositorio);
    }

    @Singleton
    @Provides
    public Home_GastronomyContrato.Presenter provideHome_GastronomyContratoPresenter(Home_PrincipalRepositorio home_principalRepositorio){
        return  new Home_GastronomyPresenter(home_principalRepositorio);
    }
}
