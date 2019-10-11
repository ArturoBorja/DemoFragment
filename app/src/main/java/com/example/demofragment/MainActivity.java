package com.example.demofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn_enviar;
    Button btn_eliminar;
    DemoFragment fragment;
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Constructor();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CrearFragment();
            }
        });
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment.Aumentar();
            }
        });
        btn_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EliminarFragment();
            }
        });


    }
    void Constructor(){
        btn=findViewById(R.id.button2);
        btn_enviar=findViewById(R.id.button3);
        btn_eliminar=findViewById(R.id.button4);
    }
    void CrearFragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new DemoFragment();
        fragmentTransaction.add(R.id.fragment_conteiner,fragment);
        fragmentTransaction.commit();
    }
    void EliminarFragment(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
    }
}
