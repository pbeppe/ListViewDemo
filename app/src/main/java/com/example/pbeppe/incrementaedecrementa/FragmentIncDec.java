package com.example.pbeppe.incrementaedecrementa;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentIncDec extends Fragment {

Button btnInc;
Button btnDec;
Comunication Com;

    public FragmentIncDec() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inc_dec, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Com=(Comunication)getActivity();

        btnInc=(Button) getActivity().findViewById(R.id.btn_Inc);
        btnDec=(Button )getActivity().findViewById(R.id.btn_Dec);
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO : Invia Incremento
                Log.d("OnClick","Incrementa");
                Com.sendInc();
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO : Invia Decremento
                Log.d("OnClick","Decrementa");
                Com.sendDec();

            }
        });



    }
}
