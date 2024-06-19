package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    void ex1() {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("===== Par ou Ímpar =====\n" +
                           "Este programa recebe um número e retorna se este é par, ímpar ou zero.\n");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();

        if (num == 0) {
            System.out.println("O número digitado é zero.");
        } else if (num % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }

    void ex2() {
        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.println("===== Maior ou Menor =====\n" +
                           "Este programa recebe dois números e retorna qual é maior e qual é menor.\n");
        System.out.print("Digite o primeiro número: ");
        x = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        y = sc.nextFloat();
        sc.close();

        if (x == y) {
            System.out.println("Os números " + x + " e " + y + " são iguais.");
        } else if (x > y) {
            System.out.println("O primeiro número " + x + " é maior que o segundo número " + y + ".");
        } else {
            System.out.println("O primeiro número " + x + " é menor que o segundo número " + y + ".");
        }
    }

    void ex3() {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);

        String nome;
        int idade;
        char pcd, gestante;
        String mensagemPreferencial = ", você tem direito a ir para a fila preferencial.";

        System.out.println("===== Fila de Espera =====\n" +
                           "Este programa fará 3 perguntas para decidir se você vai para a fila comum ou preferencial.\n");
        System.out.print("Digite seu nome: ");
        nome = scString.nextLine();
        scString.close();

        System.out.print("Qual é a sua idade?: ");
        idade = scInt.nextInt();
        scInt.close();
        if (idade >= 65) {
            System.out.println(nome + mensagemPreferencial);
            scChar.close();
            return;
        }

        System.out.print("Você é PCD? (s/n): ");
        pcd = scChar.next().charAt(0);
        if (pcd == 's') {
            System.out.println(nome + mensagemPreferencial);
            scChar.close();
            return;
        }

        System.out.print("Você é gestante? (s/n): ");
        gestante = scChar.next().charAt(0);
        scChar.close();
        if (gestante == 's') {
            System.out.println(nome + mensagemPreferencial);
            return;
        }

        System.out.println(nome + ", você não tem direito à fila preferencial. Direcione-se para a fila comum.");
    }

    void ex4() {

    }
}
