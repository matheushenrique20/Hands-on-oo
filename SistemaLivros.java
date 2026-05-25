package com.mycompany.handson;

import java.util.ArrayList;

public class SistemaLivros {

    private ArrayList<Livro> lista;

    public SistemaLivros() {
        lista = new ArrayList<>();
    }

    public void cadastrar(Livro l) {
        lista.add(l);
    }

    public void listar() {
        for (Livro l : lista) {
            System.out.println(l.codigo + " - " + l.titulo + " - " + l.autor +
                    " - " + (l.disponivel ? "Disponível" : "Emprestado"));
        }
    }

    public void emprestar(int codigo) {
        for (Livro l : lista) {
            if (l.codigo == codigo) {
                if (l.disponivel) {
                    l.disponivel = false;
                    System.out.println("Livro emprestado!");
                } else {
                    System.out.println("Livro já emprestado.");
                }
            }
        }
    }

    public void devolver(int codigo) {
        for (Livro l : lista) {
            if (l.codigo == codigo) {
                l.disponivel = true;
                System.out.println("Livro devolvido!");
            }
        }
    }
}