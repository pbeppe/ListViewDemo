package com.example.pbeppe.incrementaedecrementa;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentShow extends Fragment {
    TextView tvRisultato;
    int risultato;

    public FragmentShow() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvRisultato=(TextView)getActivity().findViewById(R.id.idNum);
    }

    public  void incremental() {

        String strRisultato=tvRisultato.getText().toString();
        risultato=Integer.parseInt(strRisultato);
        risultato++;
        tvRisultato.setText(String.valueOf(risultato));
    }

    public void decremental() {
        String strRisultato=tvRisultato.getText().toString();
        risultato=Integer.parseInt(strRisultato);
        risultato--;
        tvRisultato.setText(String.valueOf(risultato));
    }
}
