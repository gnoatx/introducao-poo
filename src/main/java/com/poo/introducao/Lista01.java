package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    void ex1() {
        Scanner scanner = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Digite um número: ");
        x = scanner.nextInt();
        System.out.print("Digite outro número: ");
        y = scanner.nextInt();

        sum = x + y;

        System.out.println("A soma dos números digitados é: " + sum);
        scanner.close();
    }

    void ex2() {
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome;

        System.out.print("Digite seu primeiro nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome");
        sobrenome = scanner.nextLine();

        System.out.println("Bem vindo, " + nome + " " + sobrenome);
        scanner.close();
    }
}
