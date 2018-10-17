package pe.itland.xtreampad.mvp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import javax.inject.Inject;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.mvp.contratos.Home_GastronomyContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;

public class Home_GastronomyFragment extends BaseFragment implements Home_GastronomyContrato.View {

    @Inject
    Home_GastronomyContrato.Presenter presenter;

    private View root;

    //private TextView tvSaludo;

    public Home_GastronomyFragment() {

    }

    public static Home_GastronomyFragment newInstance(){
        Home_GastronomyFragment fragment = new Home_GastronomyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

        XtreampadApp.from(getContext()).getComponent().inject(this);
        presenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_home_gastronomy, container, false);

        Button btnBack = (Button)root.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //irAtras();
                cambiarFragmento(Home_PrincipalFragment.newInstance());
            }
        });

        Button btnHome = (Button)root.findViewById(R.id.btnHome);

        btnHome.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(Home_PrincipalFragment.newInstance());
            }
        });

        configurarControles();
        return root;
    }
    //Aca se llena la data
    private void configurarControles() {
        //tvSaludo = root.findViewById(R.id.tvSaludo);
       /* ImageButton imgVea = (ImageButton)root.findViewById(R.id.imageplazavea);
        ImageButton imgMass = (ImageButton)root.findViewById(R.id.imagemass);
        ImageButton imgvivanda = (ImageButton)root.findViewById(R.id.imagevivanda);
        ImageButton imgoeschsle = (ImageButton)root.findViewById(R.id.imageoeschsle);
        ImageButton imgreal = (ImageButton)root.findViewById(R.id.imagereal);

        imgVea.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(TimeValueFragment.newInstance("imgVea"));
                //sendMessage("imgTime");
            }
        });

        imgMass.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(TimeValueFragment.newInstance("imgMass"));
            }
        });
        imgvivanda.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(TimeValueFragment.newInstance("imgvivanda"));
            }
        });

        imgoeschsle.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(TimeValueFragment.newInstance("imgoeschsle"));
            }
        });
        imgreal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(TimeValueFragment.newInstance("imgreal"));
            }
        });*/

    }

    @Override
    public void onResume() {
        super.onResume();
        //presenter.getById(1);
    }

    @Override
    public void viewDataHomePrincipal(Home_Principal home_principal) {


        //tvSaludo.setText("Ejemplo " + home_principal.name);
    }

    @Override
    public void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }


}
