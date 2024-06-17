package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);
		//System.out.println("Hello world");
        limpa();

		Lista01 lista01 = new Lista01();
        //lista01.ex1();
        int opcao;

        do {
            Scanner scannerOpcao = new Scanner(System.in);

            System.out.println("Opções:\n\n" +
                               "1 - 8. Executar exercício de número correspondente\n" +
                               "0. Sair do programa");
            opcao = scannerOpcao.nextInt();
            scannerOpcao.close();

            limpa();
            switch(opcao) {
                case 0:
                    break;
                case 1:
                    lista01.ex1();
                    break;
                case 2:
                    lista01.ex2();
                    break;
                case 3:
                    lista01.ex3();
                    break;
                case 4:
                    lista01.ex4();
                    break;
                case 5:
                    lista01.ex5();
                    break;
                case 6:
                    lista01.ex6();
                    break;
                case 7:
                    lista01.ex7();
                    break;
                case 8:
                    lista01.ex8();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        System.out.println("Obrigado por utilizar meu programa.");
	}

	static void limpa_mac_linux() {
		try {
            if (System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Linux ou Mac.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	static void limpa_windows() {
		try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Windows.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    static void limpa() {
		try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if(System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	static void finaliza() {
		System.out.println("\n\n\n\n");
	}
}
