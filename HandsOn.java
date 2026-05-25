package com.mycompany.handson;

import java.util.Scanner;

public class HandsOn {

    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.adicionarProduto("Arroz");
        lista.adicionarProduto("Feijão");
        lista.adicionarProduto("Leite");
        lista.adicionarProduto("Pão");
        lista.adicionarProduto("Café");

        lista.mostrarProdutos();
        System.out.println("Total: " + lista.totalProdutos());

        System.out.println("\n------------\n");

        Notas notas = new Notas();
        notas.adicionarNota(7.5);
        notas.adicionarNota(6.0);
        notas.adicionarNota(8.0);
        notas.adicionarNota(9.0);
        notas.mostrarSituacao();

        System.out.println("\n-----------\n");

        NomesAlunos presenca = new NomesAlunos();

        presenca.adicionarAluno("Matheus");
        presenca.adicionarAluno("Isabele");
        presenca.adicionarAluno("Gabriela");
        presenca.adicionarAluno("Sara");

        presenca.mostrarAlunos();
        System.out.println("Total: " + presenca.totalAlunos());

        System.out.println("\n-----------\n");

        CadastroAlunos cadastro = new CadastroAlunos();

        cadastro.adicionarAluno(1, "Matheus");
        cadastro.adicionarAluno(2, "Isabele");

        cadastro.mostrarAlunos();

        System.out.println("\n-----------\n");

        FilaClientes fila = new FilaClientes();

        fila.adicionarCliente("Ana");
        fila.adicionarCliente("Bruno");
        fila.adicionarCliente("Carlos");
        fila.adicionarCliente("Daniel");
        fila.adicionarCliente("Eduardo");

        fila.proximoCliente();

        fila.atenderCliente();
        fila.atenderCliente();

        fila.mostrarFila();

        System.out.println("\n-----------\n");

        SistemaLivros sistema = new SistemaLivros();

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n1-Cadastrar 2-Listar 3-Emprestar 4-Devolver 0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Código: ");
                    int c = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Título: ");
                    String t = sc.nextLine();

                    System.out.print("Autor: ");
                    String a = sc.nextLine();

                    sistema.cadastrar(new Livro(c, t, a));
                    break;

                case 2:
                    sistema.listar();
                    break;

                case 3:
                    System.out.print("Código: ");
                    sistema.emprestar(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Código: ");
                    sistema.devolver(sc.nextInt());
                    break;
            }

        } while (op != 0);

        System.out.println("\n-----------\n");

        SistemaPedidos sp = new SistemaPedidos();

        int ops;

        do {
            System.out.println("\n1-Cadastrar 2-Listar 3-Status 4-Buscar 5-Total 0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Número: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Cliente: ");
                    String cli = sc.nextLine();

                    System.out.print("Item: ");
                    String item = sc.nextLine();

                    System.out.print("Valor: ");
                    double v = sc.nextDouble();

                    sp.cadastrar(new Pedido(n, cli, item, v));
                    break;

                case 2:
                    sp.listar();
                    break;

                case 3:
                    System.out.print("Número: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Status: ");
                    String st = sc.nextLine();

                    sp.atualizarStatus(num, st);
                    break;

                case 4:
                    sp.buscar(sc.nextInt());
                    break;

                case 5:
                    sp.total();
                    break;
            }

        } while (op != 0);
    }
}
