package it.appacademy.gokuevegeta;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    android.app.FragmentManager fm = getFragmentManager();
    FragmentTransaction tx = fm.beginTransaction();

    // GOKUEVEGETA
    // porca miseria non cambia
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // TODO Aggiungere il FragmentUno
      /*  FragmentUno fragmentUno = new FragmentUno();
        tx.add(R.id.fragment_place, fragmentUno);
        tx.commit();*/

    }

    public void clickVegeta(View view) {
        FragmentDue fragmentDue = new FragmentDue();
       if (tx.isEmpty())
       {

         tx.add(R.id.fragment_place, fragmentDue);
         tx.commit();
       }
        {
            tx.replace(R.id.fragment_place, fragmentDue);
            tx.commit();
        }



    }

    public void clickGoku(View view)
    {
        FragmentUno fragmentUno = new FragmentUno();
        if (tx.isEmpty()){

            tx.add(R.id.fragment_place, fragmentUno);
            tx.commit();}
            else
        {
            tx.add(R.id.fragment_place, fragmentUno);
            tx.commit();}
        }

    }

