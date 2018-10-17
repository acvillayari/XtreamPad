package pe.itland.xtreampad.mvp.presenters;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import pe.itland.xtreampad.bd.modelo.Persona;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.PersonaRepositorio;
import pe.itland.xtreampad.mvp.contratos.PersonasContrato;

public class PersonasPresenter implements PersonasContrato.Presenter {

    private WeakReference<PersonasContrato.View> view;

    private  PersonaRepositorio personaRepositorio;


    @Inject
    public  PersonasPresenter(PersonaRepositorio personaRepositorio){
        this.personaRepositorio = personaRepositorio;
    }

    @Override
    public void obtenerPersonaSaludar() {
        guardarPersonaSiNoExista();
        Persona persona = this.personaRepositorio.buscarPorId(1);



        this.view.get().saludar(persona.getNombres());
    }


    private void guardarPersonaSiNoExista(){
        Persona persona = this.personaRepositorio.buscarPorId(1);

        if(persona == null){
            persona = new Persona();
            persona.setEdad(10);
            persona.setNombres("Daniel");

        }

        this.personaRepositorio.insertarOActualizar(persona);
    }

    @Override
    public void attachView(PersonasContrato.View view) {
        this.view = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        this.view.clear();
    }
}
