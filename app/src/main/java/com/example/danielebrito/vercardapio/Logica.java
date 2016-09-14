package com.example.danielebrito.vercardapio;

import java.util.ArrayList;

public class Logica {
    ArrayList<Lanche> listaLanche;
    private int cont=1;
    public Logica(){
        if(listaLanche == null){
            listaLanche = new ArrayList<Lanche>();
        }
    }

    public void adicionarLanche(Lanche l){
        listaLanche.add(l);
    }
    public Lanche listarLanchePorId(int id){
        for (int i = 0; i<listaLanche.size(); i++){
            if(listaLanche.get(i).getCod() == id){
                return listaLanche.get(i);
            }
        }
        return null;
    }
    public void excluirLanche(int id){
        for (int i = 0; i<listaLanche.size(); i++){
            if(listaLanche.get(i).getCod() == id){
                listaLanche.remove(i);
            }
        }
    }
    public ArrayList<Lanche> gerarLanche(){
        Lanche l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
        l = new Lanche();
        l.setCod(cont++);
        l.setNome("X-Tudo");
        l.setAcompanhamento("Pão de hamburger, hamburger, queijo, ovo, bacon, calabresa, milho, batata palha, tomate, alface, catupity, salsicha, maionese e captchup");
        l.setPreco(17.00);

        l1 = new Lanche();
        l1.setCod(cont++);
        l1.setNome("Cachorro-Quente Prensado");
        l1.setAcompanhamento("Pão de leite, queijo, presunto, salsicha com molho e batata palha");
        l1.setPreco(8.00);

        l2 = new Lanche();
        l2.setCod(cont++);
        l2.setNome("X-Egg");
        l2.setAcompanhamento("Pão de hamburger, hamburger, queijo, presunto, ovo, alface, tomate e maionese");
        l2.setPreco(10.50);

        l3 = new Lanche();
        l3.setCod(cont++);
        l3.setNome("X-Bacon");
        l3.setAcompanhamento("Pão de hamburger, hamburger, queijo, presunto, bacon, alface, tomate e maionese");
        l3.setPreco(10.50);

        l4 = new Lanche();
        l4.setCod(cont++);
        l4.setNome("Misto-Quente");
        l4.setAcompanhamento("Pão de forma, maionese, presunto, queijo e tomate");
        l4.setPreco(4.00);

        l5 = new Lanche();
        l5.setCod(cont++);
        l5.setNome("X-Filé");
        l5.setAcompanhamento("Pão de hamburger, filé de contra-filé, hamburger, queijo, presunto, alface, tomate e bacon");
        l5.setPreco(11.50);

        l6 = new Lanche();
        l6.setCod(cont++);
        l6.setNome("X-Mignon");
        l6.setAcompanhamento("Pão de hamburger, filé-mignon, hamburger, queijo, presunto, alface, tomate e bacon");
        l6.setPreco(13.00);

        l7 = new Lanche();
        l7.setCod(cont++);
        l7.setNome("X-Burger");
        l7.setAcompanhamento("Pão de hamburger, hamburger, queijo, presunto, alface e tomate");
        l7.setPreco(8.50);

        l8 = new Lanche();
        l8.setCod(cont++);
        l8.setNome("X-Salada");
        l8.setAcompanhamento("Pão sírio, hamburger de frango, alface, tomate, cebola e pepino");
        l8.setPreco(9.00);

        l9 = new Lanche();
        l9.setCod(cont++);
        l9.setNome("X-Frango");
        l9.setAcompanhamento("Pão de hamburger, filé de peito de frango, hamburger, queijo, presunto, milho, alface, tomate e catupiry");
        l9.setPreco(9.50);

        l10 = new Lanche();
        l10.setCod(cont++);
        l10.setNome("X-BNH");
        l10.setAcompanhamento("Pão de hamburger, contra-filé, frango, milho, bacon, ovo, hamburger, queijo, presunto, alface, tomate, catupiry, calabresa, salsicha, batata palha, catchup, maionese, mostarda e ervilha");
        l10.setPreco(25.00);


        listaLanche.add(l);
        listaLanche.add(l1);
        listaLanche.add(l2);
        listaLanche.add(l3);
        listaLanche.add(l4);
        listaLanche.add(l5);
        listaLanche.add(l6);
        listaLanche.add(l7);
        listaLanche.add(l8);
        listaLanche.add(l9);
        listaLanche.add(l10);
        return listaLanche;
    }
}
