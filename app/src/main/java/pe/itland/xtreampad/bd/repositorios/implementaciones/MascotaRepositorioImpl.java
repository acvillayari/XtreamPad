package pe.itland.xtreampad.bd.repositorios.implementaciones;

import pe.itland.xtreampad.bd.modelo.Mascota;
import pe.itland.xtreampad.bd.repositorios.Abstracciones.MascotaRepositorio;
import pe.itland.xtreampad.bd.repositorios.DaoSession;

public class MascotaRepositorioImpl implements MascotaRepositorio {

    private DaoSession daoSession;

    public MascotaRepositorioImpl(DaoSession daoSession) {
        this.daoSession = daoSession;
    }

    @Override
    public Mascota obtenerPorId(long id) {
        return this.daoSession.getMascotaDao().load(id);
    }

    @Override
    public void insertarOActualizar(Mascota mascota) {
        this.daoSession.getMascotaDao().insertOrReplace(mascota);
    }

    @Override
    public void eliminarPorId(long id) {
        this.daoSession.getMascotaDao().deleteByKey(id);
    }
}
