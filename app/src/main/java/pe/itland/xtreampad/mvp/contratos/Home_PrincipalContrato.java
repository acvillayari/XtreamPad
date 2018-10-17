package pe.itland.xtreampad.mvp.contratos;

import pe.itland.xtreampad.bd.modelo.Home_Principal;

public interface Home_PrincipalContrato {

    interface View extends BaseView {
        void  viewDataHomePrincipal(Home_Principal home_principal);

    }

    interface Presenter extends BasePresenter<View> {
        void getById(long id);
    }
}
