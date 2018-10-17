package pe.itland.xtreampad.mvp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.XtreampadApp;
import pe.itland.xtreampad.bd.modelo.Home_Principal;
import pe.itland.xtreampad.mvp.contratos.Home_TimeContrato;
import pe.itland.xtreampad.mvp.ui.bases.BaseFragment;
import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class Home_TimeFragment extends BaseFragment implements Home_TimeContrato.View {

    @Inject
    Home_TimeContrato.Presenter presenter;

    private View root;
    FlipperLayout flipper;
    //private TextView tvSaludo;

    public Home_TimeFragment() {

    }

    public static Home_TimeFragment newInstance(){
        Home_TimeFragment fragment = new Home_TimeFragment();
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

        root = inflater.inflate(R.layout.fragment_home_time, container, false);

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

        flipper = (FlipperLayout)root.findViewById(R.id.flipper);

        configurarControles();
        return root;
    }
    //Aca se llena la data
    private void configurarControles() {
        //tvSaludo = root.findViewById(R.id.tvSaludo);
        ImageButton imgVea = (ImageButton)root.findViewById(R.id.imageplazavea);
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
        });
        String path= root.getContext().getPackageName() + "/";
        //String url[]= new String[]{path+"vea1",path+"banner_principal",path+"banner_principal2",path+"gastronomia_principal"};
        String url[]= new String[]{
                "http://www.limautos.pe/images/blog/SUV_path.jpg",
                "http://www.limautos.pe/images/blog/dia_de_playa_path.jpg",
                "http://www.limautos.pe/images/blog/Auto_Nuevo_path.jpg"};
        for(int i=0;i<url.length;i++){
            FlipperView view = new FlipperView(root.getContext());
            view.setImageUrl(url[i]);
                    //.setDescription("image"+(i+1));
            flipper.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                    Toast.makeText(root.getContext(),""+(flipper.getCurrentPagePosition()+1),Toast.LENGTH_SHORT).show();
                }
            });
        }
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
