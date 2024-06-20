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
}
