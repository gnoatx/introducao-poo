package com.poo.introducao;

import java.util.Scanner;

@SuppressWarnings("resource")
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
        //scanner.close();
    }

    void ex2() {
        Scanner scanner = new Scanner(System.in);

        String nome, sobrenome;

        System.out.print("Digite seu primeiro nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Bem vindo, " + nome + " " + sobrenome + ".");
        //scanner.close();
    }

    void ex3() {
        Scanner scanner = new Scanner(System.in);

        double real, dolar;
        double valorDolar = 5.25d;

        System.out.print("Digite um valor em reais: R$ ");
        real = scanner.nextDouble();

        dolar = real * valorDolar;

        System.out.println("O valor convertido para dólares é: US$ " + String.format("%.2f", dolar) );
        //scanner.close();
    }

    void ex4() {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro: ");
        num = scanner.nextInt();

        num--;
        System.out.println("O número antecessor é " + num);
        num += 2;
        System.out.println("O número sucessor é " + num);
        //scanner.close();
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
        System.out.println("O valor total do terreno é R$ " + String.format("%.2f", valorCalculado) );
        //scanner.close();
    }

    void ex6() {
        Scanner scanner = new Scanner(System.in);

        float distancia, combustivel, consumoMedio;

        System.out.print("Digite a distância percorrida pelo veículo, em kilômetros: ");
        distancia = scanner.nextFloat();
        System.out.print("Digite o total de combustível gasto, em litros: ");
        combustivel = scanner.nextFloat();

        consumoMedio = distancia / combustivel;
        System.out.println("O consumo médio durante esse percurso foi de " + consumoMedio + " km/L");
        //scanner.close();
    }

    void ex7() {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("Digite suas notas:");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média de suas notas foi " + String.format("%.2f", media) );
        //scanner.close();
    }

    void ex8() {
        Scanner scanner = new Scanner(System.in);

        float grauF, grauC;

        System.out.print("Digite uma temperatura em graus Fahrenheit: ");
        grauF = scanner.nextFloat();

        grauC = (grauF - 32) * 5 / 9;
        System.out.println("A temperatura convertida para graus Celsius é " + String.format("%.1f", grauC) + " °C");
        //scanner.close();
    }
}
