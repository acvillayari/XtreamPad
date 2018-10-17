package pe.itland.xtreampad.mvp.presenters;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import pe.itland.xtreampad.bd.modelo.Mascota;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.MascotaRepositorio;
import pe.itland.xtreampad.mvp.contratos.MascotaContrato;

public class MascotaPresenter implements MascotaContrato.Presenter {

    private WeakReference<MascotaContrato.View> view;

    private MascotaRepositorio mascotaRepositorio;

    @Inject
    public MascotaPresenter(MascotaRepositorio mascotaRepositorio) {
        this.mascotaRepositorio = mascotaRepositorio;
    }

    @Override
    public void saludarMascota(long idMascota) {

        Mascota mascota = this.mascotaRepositorio.obtenerPorId(idMascota);
        if(mascota== null){
            mascota = new Mascota();
            mascota.setApodo("Gatazo");
            mascota.setEdad(20);

            this.mascotaRepositorio.insertarOActualizar(mascota);
        }

        this.view.get().mostrarSaludo(mascota.getApodo());

    }

    @Override
    public void attachView(MascotaContrato.View view) {
        this.view = new WeakReference<>(view);
    }

    @Override
    public void detachView() {

        this.view.clear();
    }
}
