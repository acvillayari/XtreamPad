package pe.itland.xtreampad.di.modulos;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.MascotaRepositorio;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.PersonaRepositorio;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_PrincipalRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoMaster;
import pe.itland.xtreampad.bd.repositorios.DaoSession;
import pe.itland.xtreampad.bd.repositorios.implementaciones.MascotaRepositorioImpl;
import pe.itland.xtreampad.bd.repositorios.implementaciones.PersonaRepositorioImpl;
import pe.itland.xtreampad.bd.repositorios.implementaciones.Home_PrincipalRepositorioImpl;

@Module
public class GreenDaoModulo {

    public static final String NOMBRE_BD = "xtreampad";

    @Singleton
    @Provides
    DaoSession daoSession(Context context) {
        return new DaoMaster(new DaoMaster.DevOpenHelper(context, NOMBRE_BD).getWritableDb()).newSession();
    }

    @Singleton
    @Provides
    PersonaRepositorio personaRepositorio(DaoSession daoSession) {
        return new PersonaRepositorioImpl(daoSession);
    }

    @Singleton
    @Provides
    MascotaRepositorio mascotaRepositorio(DaoSession daoSession){
        return  new MascotaRepositorioImpl(daoSession);
    }

    @Singleton
    @Provides
    Home_PrincipalRepositorio home_principalRepositorio(DaoSession daoSession){
        return  new Home_PrincipalRepositorioImpl(daoSession);
    }
}
