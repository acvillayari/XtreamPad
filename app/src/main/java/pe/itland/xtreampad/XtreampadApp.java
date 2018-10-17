package pe.itland.xtreampad;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import pe.itland.xtreampad.di.componentes.DaggerXtreampadAppComponente;
import pe.itland.xtreampad.di.componentes.XtreampadAppComponente;
import pe.itland.xtreampad.di.modulos.XtreampadModulo;

public class XtreampadApp extends Application {


    private XtreampadAppComponente xtreampadAppComponente;

    @Override
    public void onCreate() {
        super.onCreate();

        xtreampadAppComponente = DaggerXtreampadAppComponente.builder().xtreampadModulo(new XtreampadModulo(this)).build();
    }


    public XtreampadAppComponente getComponent() {
        return xtreampadAppComponente;
    }

    public static XtreampadApp from(@NonNull Context context) {
        return (XtreampadApp) context.getApplicationContext();
    }
}
