package br.unitins.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.unitins.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragment extends Fragment {

    TextView apresentar;

    public SegundoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_segundo, container, false);

        apresentar = view.findViewById(R.id.txt_apresentar);

        // verifica e recupera o valor da string através da chave e seta no texto
        Bundle bundle = new Bundle();
        bundle = getArguments();
        if (bundle != null) {
            String texto = bundle.getString("texto");
            apresentar.setText(texto);
        }

        return view;
    }
}