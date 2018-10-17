package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Home_Menu;


public interface Home_MenuRepositorio {

    Home_Menu searchById(long id);

    void save(Home_Menu home_menu);

    void deleteById(long id);
}
