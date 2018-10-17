package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Home_Principal;


public interface Home_PrincipalRepositorio {

    Home_Principal searchById(long id);

    void save(Home_Principal home_principal);

    void deleteById(long id);
}
