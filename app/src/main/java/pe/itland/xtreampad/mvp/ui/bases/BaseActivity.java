package pe.itland.xtreampad.mvp.ui.bases;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.mvp.ui.TimeValueFragment;

public class BaseActivity extends AppCompatActivity {


    protected void cambiarFragment(Fragment fragment) {

        String backStateName = fragment.getClass().getName();
        String fragmentTag = backStateName;

        FragmentManager manager = getSupportFragmentManager();
        boolean fragmentPopped = manager.popBackStackImmediate(backStateName, 0);

        if (!fragmentPopped && manager.findFragmentByTag(fragmentTag) == null) { //fragment not in back stack, create it.
            FragmentTransaction ft = manager.beginTransaction();
            ft.replace(R.id.main_frame, fragment, fragmentTag);
            ft.addToBackStack(backStateName);
            ft.commit();
        }

    }

}
