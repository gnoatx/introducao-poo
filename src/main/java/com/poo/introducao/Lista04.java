package com.poo.introducao;

import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("resource")
public class Lista04 {

    public ArrayList<Double> vendas = new ArrayList<Double>();
    void recebeVendas() {
        Scanner scDouble = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);
        char continua;

        do {
            System.out.print("Digite o valor da venda: ");
            vendas.add(scDouble.nextDouble());

            System.out.print("Adicionar mais um item? (s/n): ");
            continua = scChar.nextLine().charAt(0);
        } while (continua == 's');
    }

    void ex1() {
        double soma = 0;

        System.out.println("===== Fechamento do Dia =====\n" +
                           "Este programa recebe uma lista de valores numa ArrayList e faz a soma desta.\n");

        recebeVendas();
        for (Double d : vendas) {
            soma += d;
        }

        System.out.println("A total de vendas do dia foi de R$ " + String.format("%.2f", soma));
    }

    void ex2() {
        double maior = 0;
        double menor = Double.MAX_VALUE;

        System.out.println("===== Maior e Menor Vendas =====\n" +
                           "Este programa recebe uma lista de valores numa ArrayList e retorna o maior valor e o menor valor desta.\n");

        recebeVendas();
        for (Double d : vendas) {
            maior = (d > maior) ? d : maior;
        }
        for (Double d : vendas) {
            menor = (d < menor) ? d : menor;
        }

        System.out.println("A maior venda do dia foi de R$ " + String.format("%.2f", maior));
        System.out.println("A menor venda do dia foi de R$ " + String.format("%.2f", menor));
    }

    void ex3() {
        double soma = 0, media;

        System.out.println("===== Média do Dia =====\n" +
                           "Este programa recebe uma lista de valores numa ArrayList e retorna a média desta.\n");

        recebeVendas();
        for (Double d : vendas) {
            soma += d;
        }
        media = soma / vendas.size();

        System.out.println("O valor médio das vendas do dia foi de R$ " + String.format("%.2f", media));
    }

    void ex4() {
        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };

        System.out.println("===== Pares num Array =====\n" +
                           "Este programa retorna todos os números pares num array pré-existente.\n");
        
        System.out.println("Os números pares contidos na lista:");
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println("\nSão:");
        for (int i : lista) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static ArrayList<String> listaDeCompras = new ArrayList<String>();
    void menuListaDeCompras() {
        Scanner sc = new Scanner(System.in);
        char opcao;

        System.out.println("===== Lista de Compras =====\n" +
                           "Este programa permite o usuário de criar e manipular uma lista de compras.\n");

        do {
            System.out.println("===== Menu =====\n" +
                               "Número de itens: " + listaDeCompras.size() + "\n");
            System.out.print("1. Inserir item\n" +
                             "2. Ver lista\n" +
                             "0. Sair do programa.\n\n" +
                             "Opção: ");
            opcao = sc.nextLine().charAt(0);

            limpa();
            switch (opcao) {
                case '1':
                    ex5.inserirItem();
                    limpa();
                    break;
                case '2':
                    ex5.verLista();
                    limpa();
                    break;
                case '0':
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != '0');
    }

    class ex5 {
        static void inserirItem() {
            Scanner sc = new Scanner(System.in);
            String input;

            System.out.println("Digite os itens que deseja inserir na lista,\n" +
                               "ou digite '\u001B[36msair\u001B[0m' para voltar ao menu.\n");
            while (listaDeCompras.size() < Integer.MAX_VALUE) {
                input = sc.nextLine();
                if (input.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    listaDeCompras.add(input);
                }
            }
        }

        static void verLista() {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < listaDeCompras.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeCompras.get(i));
            }
            System.out.print("\nPressione \u001B[36mENTER\u001B[0m para voltar para o menu.");
            sc.nextLine();
        }
    }

    static void limpa() {
		try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if(System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
