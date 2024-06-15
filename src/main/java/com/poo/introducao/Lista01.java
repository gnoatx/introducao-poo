package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    void ex1() {
        Scanner scanner = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Digite um número inteiro: ");
        x = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
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

    void ex3() {
        Scanner scanner = new Scanner(System.in);

        double real, dolar;

        System.out.print("Digite um valor em reais: R$ ");
        real = scanner.nextDouble();

        dolar = real * 5.25;

        System.out.println("O valor convertido para dólares é: US$ " + dolar);
        scanner.close();
    }

    void ex4() {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro: ");
        num = scanner.nextInt();

        num--;
        System.out.println("O número antecessor é " + num);
        num = num + 2;
        System.out.println("O número sucessor é " + num);
        scanner.close();
    }


    void ex5() {
        Scanner scanner = new Scanner(System.in);

        double valorM2, valorCalculado, largura, comprimento;
        
        System.out.print("Digite o valor do metro quadrado: R$ ");
        valorM2 = scanner.nextDouble();

        System.out.print("Digite a largura do terreno em metros: ");
        largura = scanner.nextDouble();
        System.out.print("Digite o comprimento do terreno em metros: ");
        comprimento = scanner.nextDouble();

        valorCalculado = valorM2 * comprimento * largura;
        System.out.println("O valor total do terreno é R$ " + valorCalculado);
    }
}
