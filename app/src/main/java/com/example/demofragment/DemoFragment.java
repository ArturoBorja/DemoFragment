package com.example.demofragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {

    int contador =0;
    TextView tv;
    Button b;
    DemoFragmentListener activity;
    public DemoFragment(DemoFragmentListener activity) {
        this.activity = activity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_demo, container, false);
        b=v.findViewById(R.id.button);
        tv=v.findViewById(R.id.textView);
        tv.setText(String.valueOf(contador));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aumentar();
                activity.presionoBoton(tv.getText().toString());
            }
        });
        return v;
    }
    public void Aumentar(){
        contador++;
        tv.setText(String.valueOf(contador));
    }
    public interface DemoFragmentListener{
        public void presionoBoton(String mensaje);
    }

}
