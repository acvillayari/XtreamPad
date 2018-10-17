package pe.itland.xtreampad.bd.repositorios.Abstracciones;

import pe.itland.xtreampad.bd.modelo.Home_Language;


public interface Home_LanguageRepositorio {

    Home_Language searchById(long id);

    void save(Home_Language home_language);

    void deleteById(long id);
}
