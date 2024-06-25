package com.poo.introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

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
        for (double d : vendas) {
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
        for (double d : vendas) {
            maior = (d > maior) ? d : maior;
        }
        for (double d : vendas) {
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
        for (double d : vendas) {
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

    public static ArrayList<String> listaDeCompras = new ArrayList<>(Arrays.asList("Manteiga", "Requeijão", "Alface", "Pão de Queijo", "Polvo"));
    public static ArrayList<Double> precosListaDeCompras = new ArrayList<>(Arrays.asList(7.50, 4.25, 2.00, 12.99, 55.50));
    void menuListaDeCompras() {
        Scanner sc = new Scanner(System.in);
        char opcao;

        System.out.println("===== Lista de Compras =====\n" +
                           "Este programa permite o usuário de criar e manipular uma lista de compras.\n");

        do {
            System.out.println("===== Menu =====\n" +
                               "Número de itens: " + listaDeCompras.size() + "\n");
            System.out.print("1. Inserir itens\n" +
                             "2. Ver lista\n" +
                             "3. Remover itens\n" +
                             "4. Reordenar lista por preço (ordem crescente)\n" +
                             "0. Sair do programa.\n\n" +
                             "Opção: ");
            opcao = sc.nextLine().charAt(0);

            limpa();
            switch (opcao) {
                case '1':
                    ex5.inserirItem();
                    break;
                case '2':
                    ex5.verLista(listaDeCompras, precosListaDeCompras);
                    System.out.print("\nPressione \u001B[36mENTER\u001B[0m para voltar para o menu.");
                    sc.nextLine();
                    limpa();
                    break;
                case '3':
                    if (listaDeCompras.size() > 0) {
                        ex6.removerItem();
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                    break;
                case '4':
                    if (listaDeCompras.size() > 0) {
                        ex8.ordenarPreco();
                    } else {
                        System.out.println("A lista está vazia.");
                    }
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
                System.out.print((listaDeCompras.size() + 1) + ". ");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("sair")) {
                    break;
                } else {
                    listaDeCompras.add(input);
                    ex7.adicionarPreco(listaDeCompras.size() - 1);
                }
            }
            limpa();
        }

        static void verLista(ArrayList<String> itens, ArrayList<Double> valores) {
            int espacos = 0;

            for (int i = 0; i < itens.size(); i++) {
                if (itens.get(i).length() > espacos) {
                    espacos = itens.get(i).length();
                }
            }
            for (int i = 0; i < itens.size(); i++) {
                System.out.print((i + 1) + ". " + itens.get(i));
                for (int j = espacos - itens.get(i).length(); j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.println("   R$ " + String.format("%.2f", valores.get(i)));
            }
        }
    }

    class ex6 {
        static void removerItem() {
            Scanner scInt = new Scanner(System.in);
            Scanner scChar = new Scanner(System.in);
            int input;
            char confirma;

            while (listaDeCompras.size() > 0) {
                ex5.verLista(listaDeCompras, precosListaDeCompras);
                System.out.println("\nDigite o índice do item a ser removido,\n" +
                                   "ou digite '\u001B[36m0\u001B[0m' para voltar ao menu.\n");
                System.out.print("Opção: ");
                input = scInt.nextInt();

                limpa();
                if (input == 0) {
                    break;
                } else if (input < listaDeCompras.size()) {
                    System.out.print("Tem certeza que deseja remover o item:\n" +
                                     input + ". " + listaDeCompras.get(input - 1) +
                                     "\n\nConfirma? (\u001B[36ms\u001B[0m/\u001B[36mn\u001B[0m): ");
                    confirma = scChar.nextLine().charAt(0);
                    if (Character.toLowerCase(confirma) == 's') {
                        listaDeCompras.remove(input - 1);
                        precosListaDeCompras.remove(input - 1);
                        System.out.println("Item removido com sucesso.\n");
                    } else {
                        System.out.println("Ação cancelada.\n");
                    }
                } else {
                    System.out.println("Opção inválida.\n");
                }
            }
            listaDeCompras.trimToSize();
            precosListaDeCompras.trimToSize();
        }
    }

    class ex7 {
        static void adicionarPreco(int item) {
            Scanner sc = new Scanner(System.in);

            for (int i = String.valueOf(item).length() + 2; i > 0; i--) {
                System.out.print(" ");
            }
            System.out.print("R$ ");
            precosListaDeCompras.add(item, sc.nextDouble());
        }
    }

    class ex8 {
        static void ordenarPreco() {
            Scanner sc = new Scanner(System.in);
            char confirma;
            int tamanho = listaDeCompras.size();
            ArrayList<Double> copiaPrecos = new ArrayList<Double>();
            ArrayList<String> copiaLista = new ArrayList<String>();
            copiaPrecos.addAll(precosListaDeCompras);
            copiaLista.addAll(listaDeCompras);

            System.out.println("Reordenando a lista por preço em ordem crescente...");
            for (int i = 0; i < tamanho; i++) {
                int posicao = 0;
                double tempPreco = copiaPrecos.get(i);
                String tempOrdem = copiaLista.get(i);

                for (int j = i; j < tamanho; j++) {
                    if (copiaPrecos.get(j) <= copiaPrecos.get(i)) {
                        posicao = j;
                    }
                }
                copiaLista.set(i, copiaLista.get(posicao));
                copiaLista.set(posicao, tempOrdem);
                copiaPrecos.set(i, copiaPrecos.get(posicao));
                copiaPrecos.set(posicao, tempPreco);
            }
            
            ex5.verLista(copiaLista, copiaPrecos);
            System.out.print("\nDeseja mesmo sobrescrever a lista nesta ordem?\n" +
                             "Este processo não pode ser desfeito.\n" +
                             "Confirma? (\u001B[36ms\u001B[0m/\u001B[36mn\u001B[0m): ");
            confirma = sc.nextLine().charAt(0);

            limpa();
            if (Character.toLowerCase(confirma) == 's') {
                listaDeCompras.clear();
                listaDeCompras.addAll(copiaLista);
                precosListaDeCompras.clear();
                precosListaDeCompras.addAll(copiaPrecos);
                System.out.println("Lista reordenada com sucesso!");
            } else {
                System.out.println("Reordenação cancelada.");
            }
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
