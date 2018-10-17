package pe.itland.xtreampad.mvp.presenters;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.Home_PrincipalRepositorio;
import pe.itland.xtreampad.mvp.contratos.TimeValueContrato;

public class TimeValuePresenter implements TimeValueContrato.Presenter {

    private WeakReference<TimeValueContrato.View> view;


    private  Home_PrincipalRepositorio home_principalrepositorio;

    @Inject
    public TimeValuePresenter(Home_PrincipalRepositorio home_PrincipalRepositorio) {
        this.home_principalrepositorio = home_PrincipalRepositorio;
    }

    @Override
    public void getById(long home_principal_id) {

        Home_Principal home_principal = this.home_principalrepositorio.searchById(home_principal_id);
        if(home_principal== null){
            home_principal = new Home_Principal();
            home_principal.setImage_principal("1111");
            home_principal.setLogo_cliente("1111");
            home_principal.setLogo_proveedor("2222");
            home_principal.setName("home principal");
            home_principal.setDeleted(false);

            //this.mascotaRepositorio.insertarOActualizar(mascota);
        }

        this.view.get().viewDataHomePrincipal(home_principal);

    }

    @Override
    public void attachView(TimeValueContrato.View view) {
        this.view = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        this.view.clear();
    }
}
