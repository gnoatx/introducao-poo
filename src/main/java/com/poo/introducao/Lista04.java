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
}
