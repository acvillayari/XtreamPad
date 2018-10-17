package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Persona;

public interface PersonaRepositorio {

    void insertarOActualizar(Persona persona);

    Persona buscarPorId(long id);

    void eliminar(long id);
}
