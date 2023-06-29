package com.operacao.bdandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText EDITAR;
    private Button botao;
    private MyDatabase MYbD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EDITAR = findViewById(R.id.texto);
        botao = findViewById(R.id.button);

        MYbD = Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"MeuBanco").build();
    }

    public void insertDados(View view){
        String nome=EDITAR.getText().toString();
        Usuario user = new Usuario(0,nome,29,"84991958497");
        MYbD.usuarioDao().inserir(user);
        MYbD.close();
        Toast.makeText(this, "Dados salvos com sucesso ", Toast.LENGTH_SHORT).show();
    }

}