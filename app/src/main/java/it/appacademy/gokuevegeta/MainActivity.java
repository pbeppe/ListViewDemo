package it.appacademy.gokuevegeta;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    // GOKUEVEGETA
    // porca miseria non cambia
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fm = getFragmentManager();


        FragmentTransaction tx = fm.beginTransaction();

        // TODO Aggiungere il FragmentUno
        FragmentUno fragmentUno = new FragmentUno();
        tx.add(R.id.fragment_place, fragmentUno);
        tx.commit();

    }
}
