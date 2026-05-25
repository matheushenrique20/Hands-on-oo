package com.mycompany.handson;

import java.util.ArrayList;

public class SistemaPedidos {

    private ArrayList<Pedido> pedidos;

    public SistemaPedidos() {
        pedidos = new ArrayList<>();
    }

    public void cadastrar(Pedido p) {
        pedidos.add(p);
    }

    public void listar() {
        for (Pedido p : pedidos) {
            System.out.println(p.numero + " - " + p.cliente + " - " +
                    p.item + " - " + p.valor + " - " + p.status);
        }
    }

    public void atualizarStatus(int numero, String status) {
        for (Pedido p : pedidos) {
            if (p.numero == numero) {
                p.status = status;
            }
        }
    }

    public void buscar(int numero) {
        for (Pedido p : pedidos) {
            if (p.numero == numero) {
                System.out.println(p.cliente + " - " + p.item);
            }
        }
    }

    public void total() {
        double soma = 0;
        for (Pedido p : pedidos) {
            soma += p.valor;
        }
        System.out.println("Total: " + soma);
    }
}