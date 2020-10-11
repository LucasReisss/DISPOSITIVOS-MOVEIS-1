package br.unitins.app2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText edNome;
    private TextInputEditText edIdade;
    private TextInputEditText edEmail;
    private TextInputEditText edTelefone;
    private TextInputEditText edCpf;
    private TextView textoResultado;

    private String nome;
    private String idade;
    private String email;
    private String telefone;
    private String cpf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = findViewById(R.id.editNome);
        edIdade = findViewById(R.id.editIdade);
        edEmail = findViewById(R.id.editEmail);
        edTelefone = findViewById(R.id.editTelefone);
        edCpf = findViewById(R.id.editCpf);
        textoResultado = findViewById(R.id.textResultado);

        if (savedInstanceState != null){
            nome = savedInstanceState.getString("sNome");
            idade = savedInstanceState.getString("sIdade");
            email = savedInstanceState.getString("sEmail");
            telefone = savedInstanceState.getString("sTelefone");
            cpf = savedInstanceState.getString("sCpf");
            textoResultado.setText("nome: " + nome + "\n idade: " + idade + "\n email: " + email +"\n telefone: " + telefone +  "\n cpf: " + cpf);
        }


    }


    public void enviar(View view){
        nome = edNome.getText().toString();
        idade = edIdade.getText().toString();
        email = edEmail.getText().toString();
        telefone = edTelefone.getText().toString();
        cpf = edCpf.getText().toString();
        textoResultado.setText("nome: " + nome + "\n idade: " + idade + "\n email: " + email +"\n telefone: " + telefone +  "\n cpf: " + cpf);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("sNome", nome);
        outState.putString("sIdade", idade);
        outState.putString("sEmail", email);
        outState.putString("sTelefone", telefone);
        outState.putString("sCpf", cpf);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        nome = savedInstanceState.getString("sNome");
        idade = savedInstanceState.getString("sIdade");
        email = savedInstanceState.getString("sEmail");
        telefone = savedInstanceState.getString("sTelefone");
        cpf = savedInstanceState.getString("sCpf");
    }
}