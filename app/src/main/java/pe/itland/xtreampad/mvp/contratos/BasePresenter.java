package pe.itland.xtreampad.mvp.contratos;

public interface BasePresenter<V> {

    void attachView(V view);

    void detachView();
}

