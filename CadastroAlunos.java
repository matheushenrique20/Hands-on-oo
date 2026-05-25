package com.mycompany.handson;

import java.util.HashMap;

public class CadastroAlunos {

    private HashMap<Integer, String> alunos;

    public CadastroAlunos() {
        alunos = new HashMap<>();
    }

    public void adicionarAluno(int matricula, String nome) {
        alunos.put(matricula, nome);
    }

    public void buscarAluno(int matricula) {
        if (alunos.containsKey(matricula)) {
            System.out.println("Aluno: " + alunos.get(matricula));
        } else {
            System.out.println("Matrícula não encontrada.");
        }
    }

    public void removerAluno(int matricula) {
        if (alunos.containsKey(matricula)) {
            alunos.remove(matricula);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Matrícula não encontrada.");
        }
    }

    public void mostrarAlunos() {
        System.out.println("Lista de alunos:");

        for (Integer mat : alunos.keySet()) {
            System.out.println(mat + " - " + alunos.get(mat));
        }
    }
}