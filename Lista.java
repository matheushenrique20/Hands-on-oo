package com.mycompany.handson;

import java.util.ArrayList;

public class Lista {

    private ArrayList<String> produtos;

    public Lista() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (String p : produtos) {
            System.out.println(p);
        }
    }

    public int totalProdutos() {
        return produtos.size();
    }
}