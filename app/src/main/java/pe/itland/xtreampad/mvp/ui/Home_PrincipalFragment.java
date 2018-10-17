package pe.itland.xtreampad.mvp.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import javax.inject.Inject;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.mvp.contratos.Home_PrincipalContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;

public class Home_PrincipalFragment extends BaseFragment implements Home_PrincipalContrato.View {

    @Inject
    Home_PrincipalContrato.Presenter presenter;

    private View root;

    private TextView tvSaludo;

    public Home_PrincipalFragment() {

    }

    public static Home_PrincipalFragment newInstance(){
        Home_PrincipalFragment fragment = new Home_PrincipalFragment();
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

        root = inflater.inflate(R.layout.fragment_home_principal, container, false);
        ImageButton imgTime = (ImageButton)root.findViewById(R.id.imagetiempo);
        imgTime.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(Home_TimeFragment.newInstance());
            }
        });
        ImageButton imgGastronomy = (ImageButton)root.findViewById(R.id.imagegastronomia);
        imgGastronomy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(Home_GastronomyFragment.newInstance());
            }
        });



        configurarControles();
        return root;
    }
    //Aca se llena la data
    private void configurarControles() {
        //tvSaludo = root.findViewById(R.id.tvSaludo);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getById(1);
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
