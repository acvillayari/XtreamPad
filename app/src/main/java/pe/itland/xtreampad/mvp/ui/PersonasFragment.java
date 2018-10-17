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
import pe.itland.xtreampad.mvp.contratos.PersonasContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonasFragment extends BaseFragment implements PersonasContrato.View {


    @Inject
    PersonasContrato.Presenter presenter;

    private View root;

    private TextView tvSaludo;


    public PersonasFragment() {
        // Required empty public constructor
    }


    public static PersonasFragment newInstance() {
        PersonasFragment fragment = new PersonasFragment();
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

        root = inflater.inflate(R.layout.fragment_personas, container, false);
        configurarControles();
        return root;
    }

    private void configurarControles() {
        tvSaludo = root.findViewById(R.id.tvSaludo);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.obtenerPersonaSaludar();
    }

    @Override
    public void saludar(String nombre) {
        tvSaludo.setText("Hola que tal " + nombre);
    }

    @Override
    public void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

}
