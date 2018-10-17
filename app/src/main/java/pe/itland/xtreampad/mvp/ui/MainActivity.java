package pe.itland.xtreampad.mvp.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import pe.itland.xtreampad.R;
import pe.itland.xtreampad.mvp.contratos.BaseView;
import pe.itland.xtreampad.mvp.ui.bases.BaseActivity;

public class MainActivity extends BaseActivity  implements BaseView{
    private VideoView video_bannerHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        //rootHome = inflater.inflate(R.layout.activity_main, container, false);
        //video_bannerHome = rootHome.findViewById(R.id.video_bannerHome);
        video_bannerHome = findViewById(R.id.video_bannerHome);
        String videopath ="android.resource://" + getPackageName() + "/" + R.raw.videococacola;
        Uri uri =Uri.parse(videopath);
        video_bannerHome.setVideoURI(uri);

        MediaController mediacontroller = new MediaController(this);
        video_bannerHome.setMediaController(mediacontroller);
        mediacontroller.setAnchorView(video_bannerHome);
        video_bannerHome.start();
        cambiarFragment(Home_PrincipalFragment.newInstance());

    }

}
