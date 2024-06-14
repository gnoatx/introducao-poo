package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		//System.out.println("Hello world");

		Scanner scanner = new Scanner(System.in); //Cria o scanner pra utilizar nos exercícios

		int x, y, sum;
		
		System.out.print("Digite um número: ");
		x = scanner.nextInt();
		System.out.print("Digite outro número: ");
		y = scanner.nextInt();

		sum = x + y;

		System.out.println("A soma dos números digitados é: " + sum);


	}

}
