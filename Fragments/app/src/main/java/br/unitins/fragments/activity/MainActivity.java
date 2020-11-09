package br.unitins.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.unitins.fragments.R;
import br.unitins.fragments.fragment.PrimeiroFragment;
import br.unitins.fragments.fragment.SegundoFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonInserir, buttonApresenta;
    private PrimeiroFragment primeiroFragment;
    private SegundoFragment segundoFragment;

    private static final String BACK_STACK_ROOT_TAG = " primeirofragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonApresenta = findViewById(R.id.buttonApresenta);
        buttonInserir = findViewById(R.id.buttonInserir);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        primeiroFragment = new PrimeiroFragment();

        //Configurar o objeto para o Fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, primeiroFragment);
        transaction.commit();


        buttonInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                primeiroFragment = new PrimeiroFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, primeiroFragment);
                transaction.commit();
            }
        });

        buttonApresenta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                segundoFragment = new SegundoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,segundoFragment);
                transaction.addToBackStack(null);
                transaction.commit();



            }
        });


    }
}