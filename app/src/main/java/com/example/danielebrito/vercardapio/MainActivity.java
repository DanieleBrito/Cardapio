package com.example.danielebrito.vercardapio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<Lanche> lanches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView listView = (ListView) findViewById(R.id.listView);
        lanches = new Logica().gerarLanche();
       final ListarItem lai = new ListarItem(this, lanches);
       
        listView.setAdapter(lai);
       
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Lanche lanche = lai.getItem(position);
                
                Intent i = new Intent(MainActivity.this, ListagemActivity.class);
                i.putExtra("lancheClicado", lanche);
                startActivity(i);
            }
        });
    }

    public String[] nomes(ArrayList<Lanche> lanches){
        String[] nomeLanche = new String[lanches.size()];
        for (int i = 0; i<lanches.size(); i++){
            nomeLanche[i]=(lanches.get(i).getNome());
        }
        return nomeLanche;
    }
}
