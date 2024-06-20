package com.poo.introducao;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Lista03 {

    void ex1() {
        Scanner sc = new Scanner(System.in);
        int tempo;

        System.out.println("===== Timer =====\n" +
                           "Este programa conta uma quantidade de segundos determinada pelo usuário.\n");
        System.out.print("Digite o tempo desejado em segundos: ");
        tempo = sc.nextInt();

        try {
            while (tempo > 0) {
                System.out.println(tempo);
                tempo--;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException("Unexpected interrupt", e);
        }
        System.out.println("0\n" +
                           "Timer finalizado.");
    }

    void ex2() {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("===== Tabuada =====\n" +
                           "Este programa recebe um número e exibe a tabuada deste.\n");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    void ex3() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, menor, maior;

        System.out.println("===== Números Pares =====\n" +
                           "Este programa recebe dois números inteiros e exibe todos os números pares entre estes.\n");
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        maior = Math.max(num1, num2);
        menor = Math.min(num1, num2);

        System.out.println("\nOs número pares entre " + menor + " e " + maior + " são:");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    void ex4() {
        Scanner sc = new Scanner(System.in);
        int chute, numero = (int)(Math.random() * 101);
        
        System.out.println("===== Jogo de Adivinhação =====\n" +
                           "Este programa um número aleatório de 0 a 100 e pede para o usuário adivinhá-lo.\n");
        System.out.println("Adivinhe um número de 0 a 100!");

        do {
            System.out.print("Chute: ");
            chute = sc.nextInt();
            if (chute == numero) {
                break;
            } else if (Math.abs(chute - numero) <= 10) {
                System.out.println("Está quente!");
            } else if (chute > numero) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Muito baixo!");
            }
        } while (chute != numero);
        System.out.println("Parabéns! O número secreto era " + numero + "!");
    }

    void ex5() {
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        String senha = "1234";
        String userDigitado, senhaDigitada;
        int tentativas = 3;

        System.out.println("===== Login com Tentativas =====\n" +
                           "Este programa recebe username e senha de um usuário para logá-lo com um máximo de 3 tentativas.\n");

        do {
            if (tentativas == 1) {
                System.out.println("Última tentativa! Mais um erro e seu acesso será bloqueado!");
            }
            System.out.print("Username: ");
            userDigitado = sc.nextLine();
            System.out.print("Senha: ");
            senhaDigitada = sc.nextLine();

            if (!(user.equals(userDigitado))) {
                System.out.println("Username incorreto!");
            } else if (!(senha.equals(senhaDigitada))) {
                System.out.println("Senha incorreta!");
            } else {
                break;
            }

            tentativas--;
            if (tentativas > 0) {
                System.out.println("\nTente novamente.");
            } else {
                System.out.println("Tentativas máximas ultrapassadas. Seu acesso foi bloqueado.");
                return;
            }
        } while (!(user.equals(userDigitado)) || !(senha.equals(senhaDigitada)));

        System.out.println("Bem vind@, " + user + "!");
    }
}
