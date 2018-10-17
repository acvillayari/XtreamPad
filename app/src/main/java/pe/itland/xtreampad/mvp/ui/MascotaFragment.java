package pe.itland.xtreampad.mvp.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.mvp.contratos.MascotaContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;


public class MascotaFragment extends BaseFragment implements MascotaContrato.View {

    @Inject
    MascotaContrato.Presenter presenter;

    private View root;
    private TextView tvSaludo;

    public MascotaFragment() {
        // Required empty public constructor
    }


    public static MascotaFragment newInstance() {
        MascotaFragment fragment = new MascotaFragment();
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
        // Inflate the layout for this fragment

        root = inflater.inflate(R.layout.fragment_mascota, container, false);
        configurarControles();
        return root;

    }

    private void configurarControles() {
        tvSaludo = root.findViewById(R.id.tvSaludo);
    }

    @Override
    public void onResume() {
        super.onResume();

        presenter.saludarMascota(1);
    }

    @Override
    public void mostrarSaludo(String apodo) {
        tvSaludo.setText("Hola mascota " + apodo);
    }

    @Override
    public void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }


}
