package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Home_Banner;


public interface Home_BannerRepositorio {

    Home_Banner searchById(long id);

    void save(Home_Banner home_banner);

    void deleteById(long id);
}
