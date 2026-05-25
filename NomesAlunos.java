package com.mycompany.handson;

import java.util.HashSet;

public class NomesAlunos {

    private HashSet<String> alunos;

    public NomesAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome) {
        alunos.add(nome);
    }

    public void mostrarAlunos() {
        System.out.println("Alunos presentes:");

        for (String nome : alunos) {
            System.out.println("- " + nome);
        }
    }

    public int totalAlunos() {
        return alunos.size();
    }
}