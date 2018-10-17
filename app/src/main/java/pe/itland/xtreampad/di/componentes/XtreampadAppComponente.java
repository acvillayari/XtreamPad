package pe.itland.xtreampad.di.componentes;


import javax.inject.Singleton;

import dagger.Component;
import pe.itland.xtreampad.di.modulos.GreenDaoModulo;
import pe.itland.xtreampad.di.modulos.XtreampadModulo;
import pe.itland.xtreampad.mvp.ui.FooterFragment;
import pe.itland.xtreampad.mvp.ui.Home_GastronomyFragment;
import pe.itland.xtreampad.mvp.ui.Home_PrincipalFragment;
import pe.itland.xtreampad.mvp.ui.Home_TimeFragment;
import pe.itland.xtreampad.mvp.ui.MascotaFragment;
import pe.itland.xtreampad.mvp.ui.PersonasFragment;
import pe.itland.xtreampad.mvp.ui.TimeValueFragment;

@Singleton
@Component(
        modules = {
                XtreampadModulo.class,
                GreenDaoModulo.class
        }
)
public interface XtreampadAppComponente {

        void inject(PersonasFragment personasFragment);

        void inject(MascotaFragment mascotaFragment);

        void inject(Home_PrincipalFragment home_principalFragment);

        void inject(Home_TimeFragment home_timeFragment);

        void inject(TimeValueFragment timevalueFragment);

        void inject(Home_GastronomyFragment home_gastronomyFragment);

        void inject(FooterFragment footerFragment);
}
