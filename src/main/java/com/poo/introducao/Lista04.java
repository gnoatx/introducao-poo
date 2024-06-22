package com.poo.introducao;

import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("resource")
public class Lista04 {

    void ex1() {
        Scanner scDouble = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);
        ArrayList<Double> vendas = new ArrayList<Double>();
        char continua;
        double soma = 0;

        System.out.println("===== Fechamento do Dia =====\n" +
                           "Este programa recebe uma lista de valores numa ArrayList e faz a soma desta.\n");

        do {
            System.out.print("Digite o valor da venda: ");
            vendas.add(scDouble.nextDouble());

            System.out.print("Adicionar mais um item? (s/n): ");
            continua = scChar.nextLine().charAt(0);
        } while (continua == 's');

        for (Double d : vendas) {
            soma += d;
        }

        System.out.println("A total de vendas do dia foi de R$ " + String.format("%.2f", soma));
    }
}