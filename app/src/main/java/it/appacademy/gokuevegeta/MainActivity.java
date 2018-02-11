package it.appacademy.gokuevegeta;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    // GOKUEVEGETA
    // porca miseria non cambia
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        Fragment fr;

        // TODO Aggiungere il FragmentUno
        fr = new FragmentUno();
        tx.add(R.id.fragment_place, fr);
        tx.commit();

    }

    public void clickVegeta(View view)
    {
        Fragment fr;
        fr = new FragmentDue();
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.fragment_place, fr);
        tx.commit();
    }

    public void clickGoku(View view)
    {   Fragment fr;
        fr = new FragmentUno();
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.fragment_place, fr);
        tx.commit();}
//Soluzione Finale

    }

