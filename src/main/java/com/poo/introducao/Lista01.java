package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {

    public void ex1() {
        Scanner scanner = new Scanner(System.in);

		int x, y, sum;
		
		System.out.print("Digite um número: ");
		x = scanner.nextInt();
		System.out.print("Digite outro número: ");
		y = scanner.nextInt();

		sum = x + y;

		System.out.println("A soma dos números digitados é: " + sum);
    }

    public void ex2() {
        
    }
}
