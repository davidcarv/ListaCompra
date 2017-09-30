package com.example.david.listacompras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David on 29/09/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    Context context;
    ArrayList<Item> itens;

    public ItemAdapter(Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.itens = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(context).inflate(R.layout.activity_main2, parent, false);
        TextView quantidade = (TextView) linha.findViewById(R.id.list_txtQuantidade);
        TextView nome = (TextView) linha.findViewById(R.id.list_txtNome);
        TextView tipo = (TextView) linha.findViewById(R.id.list_txtTipo);

        quantidade.setText(this.itens.get(position).getQuantidade());
        nome.setText(this.itens.get(position).getNome());
        tipo.setText(this.itens.get(position).getTipo());

        return linha;
    }
}
