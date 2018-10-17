package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Mascota;

public interface MascotaRepositorio {

    Mascota obtenerPorId(long id);
    void insertarOActualizar(Mascota mascota);
    void eliminarPorId(long id);
}
