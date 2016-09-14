package com.example.danielebrito.vercardapio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class ListarItem extends ArrayAdapter<Lanche> {
    private Context context;
    private ArrayList<Lanche> lanches;
    public ListarItem(Context context, ArrayList<Lanche> lanches) {
        super(context, 0, lanches);
        this.context = context;
        this.lanches = lanches;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Lanche lPosition = this.lanches.get(position);
       
        if(convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.listagem, null);
        TextView listView = (TextView) convertView.findViewById(R.id.tvSetNome);
        listView.setText(lPosition.getNome());
        TextView listView2 = (TextView) convertView.findViewById(R.id.tvSetDescricao);
        BigDecimal n = new BigDecimal(lPosition.getPreco());
        n = n.setScale(2, RoundingMode.HALF_UP);
        listView2.setText("R$ "+n);
        return convertView;
    }
}
