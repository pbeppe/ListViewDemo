package com.example.pbeppe.incrementaedecrementa;

import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity implements Comunication{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void sendInc() {
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        FragmentShow fragmentshow=(FragmentShow)fm.findFragmentById(R.id.frg_Show);
        fragmentshow.incremental();
    }

    @Override
    public void sendDec() {
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        FragmentShow fragmentshow=(FragmentShow)fm.findFragmentById(R.id.frg_Show);
        fragmentshow.decremental();
    }
}
