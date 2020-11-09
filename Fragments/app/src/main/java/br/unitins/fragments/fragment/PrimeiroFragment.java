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
public class PrimeiroFragment extends Fragment {

    private TextView textinsere;

    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        textinsere = view.findViewById(R.id.textinsere);
        textinsere.setText("Inserir");

        return view;
    }
}