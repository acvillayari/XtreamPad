package pe.itland.xtreampad.mvp.ui.bases;

import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {


    protected void cambiarFragmento(Fragment fragment) {

        ((BaseActivity) getActivity()).cambiarFragment(fragment);
    }
    protected void irAtras() {
        getActivity().getSupportFragmentManager().popBackStack();

    }

}
