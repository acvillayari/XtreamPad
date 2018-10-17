package pe.itland.xtreampad.mvp.contratos;

public interface PersonasContrato {

    interface View extends BaseView{

        void saludar(String nombre);
    }

    interface  Presenter extends  BasePresenter<View>{

        void obtenerPersonaSaludar();
    }
}
