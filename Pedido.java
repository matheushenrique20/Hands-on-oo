package com.mycompany.handson;

public class Pedido {

    int numero;
    String cliente;
    String item;
    double valor;
    String status;

    public Pedido(int numero, String cliente, String item, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.item = item;
        this.valor = valor;
        this.status = "PENDENTE";
    }
}