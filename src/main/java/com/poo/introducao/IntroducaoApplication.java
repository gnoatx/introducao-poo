package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);
        limpa();

		Lista01 lista01 = new Lista01();
        Lista02 lista02 = new Lista02();
        Lista03 lista03 = new Lista03();
        Scanner scannerOpcao = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("\n\n===== Menu =====\n\n" +
                             "1 - 3. Abrir lista de número correspondente\n" +
                             "0. Sair do programa\n" +
                             "Opção: ");
            opcao = scannerOpcao.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.print("===== Menu =====\n\n" +
                                     "1 - 8. Executar exercício de número correspondente\n" +
                                     "0. Sair do programa\n" +
                                     "Opção: ");
                    opcao = scannerOpcao.nextInt();
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
                    break;
                case 2:
                    System.out.print("===== Menu =====\n\n" +
                                     "1 - 8. Executar exercício de número correspondente\n" +
                                     "0. Sair do programa\n" +
                                     "Opção: ");
                    opcao = scannerOpcao.nextInt();
                    limpa();
                    switch(opcao) {
                        case 0:
                            break;
                        case 1:
                            lista02.ex1();
                            break;
                        case 2:
                            lista02.ex2();
                            break;
                        case 3:
                            lista02.ex3();
                            break;
                        case 4:
                            lista02.ex4();
                            break;
                        case 5:
                            lista02.ex5();
                            break;
                        case 6:
                            lista02.ex6();
                            break;
                        case 7:
                            lista02.ex7();
                            break;
                        case 8:
                            lista02.ex8();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.print("===== Menu =====\n\n" +
                                     "1 - 7. Executar exercício de número correspondente\n" +
                                     "0. Sair do programa\n" +
                                     "Opção: ");
                    opcao = scannerOpcao.nextInt();
                    limpa();
                    switch(opcao) {
                        case 0:
                            break;
                        case 1:
                            lista03.ex1();
                            break;
                        case 2:
                            // lista03.ex2();
                            break;
                        case 3:
                            // lista03.ex3();
                            break;
                        case 4:
                            // lista03.ex4();
                            break;
                        case 5:
                            // lista03.ex5();
                            break;
                        case 6:
                            // lista03.ex6();
                            break;
                        case 7:
                            // lista03.ex7();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
        scannerOpcao.close();
        System.out.println("Obrigado por utilizar meu programa.");
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
}
