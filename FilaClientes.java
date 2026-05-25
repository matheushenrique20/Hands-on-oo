package com.mycompany.handson;

import java.util.LinkedList;
import java.util.Queue;

public class FilaClientes {

    private Queue<String> fila;

    public FilaClientes() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(String nome) {
        fila.add(nome);
    }

    public void proximoCliente() {
        System.out.println("Próximo: " + fila.peek());
    }

    public void atenderCliente() {
        System.out.println("Atendido: " + fila.poll());
    }

    public void mostrarFila() {
        System.out.println("Fila atual: " + fila);
    }
}