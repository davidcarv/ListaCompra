package com.example.david.listacompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText NomeLista;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NomeLista = (EditText) findViewById(R.id.txtNomeLista);
        button = (Button) findViewById(R.id.btnInserir);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (NomeLista.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite um nome para a lista.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    Bundle params = new Bundle();
                    params.putString("NomeLista", NomeLista.getText().toString());
                    intent.putExtras(params);
                    startActivity(intent);
                }
            }
        });
    }
}
