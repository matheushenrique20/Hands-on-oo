package com.mycompany.handson;

import java.util.ArrayList;

public class Notas {

    private ArrayList<Double> notas;

    public Notas() {
        notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        double soma = 0;

        for (double n : notas) {
            soma += n;
        }

        return soma / notas.size();
    }

    public void mostrarSituacao() {
        double media = calcularMedia();

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}