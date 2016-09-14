package com.example.danielebrito.vercardapio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ListagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem);
        Intent i = getIntent();
        Lanche l = (Lanche) i.getSerializableExtra("lancheClicado");

        TextView listaIngred = (TextView) findViewById(R.id.tvSetNome);

        TextView precoLanche = (TextView) findViewById(R.id.tvSetDescricao);

        BigDecimal preco = new BigDecimal(l.getPreco());
        preco = preco.setScale(2, RoundingMode.HALF_UP);
        String textoPreco = String.valueOf(preco+"");
        listaIngred.setText(l.getAcompanhamento());
        precoLanche.setText("R$ " + textoPreco);
    }
}
