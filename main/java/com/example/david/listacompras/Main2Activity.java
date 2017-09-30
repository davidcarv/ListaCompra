package com.example.david.listacompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private TextView titulo;
    private Spinner spinner;

    private EditText nome;
    private EditText quant;
    private Button button;
    private CheckBox checkBox;

    ArrayList<Item> itens = new ArrayList<>();
    ListView lista;
    String[] categories = { "Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        titulo = (TextView) findViewById(R.id.txtTitulo);


        Bundle params = getIntent().getExtras();
        titulo.setText(params.getString("nomeLista"));

        lista = (ListView) findViewById(R.id.lstItens);
        final ArrayAdapter adapter = new ItemAdapter(this, R.layout.activity_main3, itens);
        lista.setAdapter(adapter);

        // Adicionar categorias ao spinner
        spinner = (Spinner) findViewById(R.id.spnItem);
        ArrayAdapter<String> adapterCategories = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categories);
        adapterCategories.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapterCategories);

        nome = (EditText) findViewById(R.id.txtNomeItem);
        quant = (EditText) findViewById(R.id.txtQuantidade);
        checkBox = (CheckBox) findViewById(R.id.chbPerecivel);
        button = (Button) findViewById(R.id.btnAdicionar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Item item = new Item(quant.getText().toString(), nome.getText().toString(), spinner.getSelectedItem().toString());
                itens.add(item);
                lista.setAdapter(adapter);
            }
        });
    }
}
