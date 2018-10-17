package pe.itland.xtreampad.bd.repositorios.implementaciones;

import pe.itland.xtreampad.bd.modelo.Persona;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.PersonaRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class PersonaRepositorioImpl implements PersonaRepositorio {

    private DaoSession daoSession;

    public PersonaRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public void insertarOActualizar(Persona persona) {
        daoSession.getPersonaDao().insertOrReplace(persona);
    }

    @Override
    public Persona buscarPorId(long id) {
        return daoSession.getPersonaDao().load(id);
    }

    @Override
    public void eliminar(long id) {
        daoSession.getPersonaDao().deleteByKey(id);
    }
}
