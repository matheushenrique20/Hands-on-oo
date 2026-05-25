package com.mycompany.handson;

public class Livro {

    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}
