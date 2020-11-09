package br.unitins.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.unitins.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {

    private EditText textinsere;

    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        Button enviar = view.findViewById(R.id.btn_enviar);
        Button limpar = view.findViewById(R.id.btn_limpar);

        textinsere = view.findViewById(R.id.edt_texto);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textinsere.getText().toString().isEmpty()) {
                    Toast.makeText(getActivity(), "Digite algo", Toast.LENGTH_LONG).show();
                } else {
                    /**
                     // faz a conexao com o fragment 2, salva o contexto da string armazenando em uma bundle chaveada
                     e faz a troca dos fragments da tela principal com o replace
                    */
                    SegundoFragment dois = new SegundoFragment();
                    Bundle bundle = new Bundle();
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    bundle.putString("texto", textinsere.getText().toString());
                    dois.setArguments(bundle);
                    ft.replace(R.id.frameConteudo, dois);
                    ft.addToBackStack(null);
                    ft.commit();
                }
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinsere.setText("");
            }
        });

        return view;
    }
}