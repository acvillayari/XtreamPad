package pe.itland.xtreampad.mvp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import javax.inject.Inject;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.mvp.contratos.Home_TimeContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;

public class TimeValueFragment extends BaseFragment implements Home_TimeContrato.View {
    private static final String ARG_PARAM1 = "imgTime";
    private String mParam1;
    @Inject
    Home_TimeContrato.Presenter presenter;

    private View root;

    private String url="";

    public TimeValueFragment() {

    }

    public static TimeValueFragment newInstance(){
        TimeValueFragment fragment = new TimeValueFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    public static TimeValueFragment newInstance(String param1){
        TimeValueFragment fragment = new TimeValueFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }

        XtreampadApp.from(getContext()).getComponent().inject(this);
        presenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_time_value, container, false);

        Button btnBack = (Button)root.findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                cambiarFragmento(Home_TimeFragment.newInstance());
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

        switch (mParam1){
            case "imgVea":
                this.url = "https://www.plazavea.com.pe/";
                break;
            case "imgMass":
                this.url = "http://www.tiendasmass.com/";
                break;
            case "imgvivanda":
                this.url = "https://www.vivanda.com.pe/";
                break;
            case "imgoeschsle":
                this.url = "https://www.oechsle.pe/";
                break;
            case "imgreal":
                this.url = "https://realplaza.pe/";
                break;
            default:
                this.url = "http://www.plazavea.com.pe/";
                break;

        }
        //this.url = "https://www.plazavea.com.pe/";
        WebView web = (WebView) root.findViewById(R.id.vwPortal);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(this.url);
    }

    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void ReciveData(String msg){
        switch (msg){
            case "imgTime":
                this.url = "https://www.plazavea.com.pe/";
                break;
            default:
                this.url = "http://www.tiendasmass.com/";
                break;

        }

        WebView web = (WebView) root.findViewById(R.id.vwPortal);
        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(this.url);
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
