package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {

    void ex1() {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("===== Par ou Ímpar =====\n" +
                           "Este programa recebe um número e retorna se este é par, ímpar ou zero.\n");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        //sc.close();

        if (num == 0) {
            System.out.println("O número digitado é zero.");
        } else if (num % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }

    void ex2() {
        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.println("===== Maior ou Menor =====\n" +
                           "Este programa recebe dois números e retorna qual é maior e qual é menor.\n");
        System.out.print("Digite o primeiro número: ");
        x = sc.nextFloat();
        System.out.print("Digite o segundo número: ");
        y = sc.nextFloat();
        //sc.close();

        if (x == y) {
            System.out.println("Os números " + x + " e " + y + " são iguais.");
        } else if (x > y) {
            System.out.println("O primeiro número " + x + " é maior que o segundo número " + y + ".");
        } else {
            System.out.println("O primeiro número " + x + " é menor que o segundo número " + y + ".");
        }
    }

    void ex3() {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Scanner scChar = new Scanner(System.in);

        String nome;
        int idade;
        char pcd, gestante;
        final String MENSAGEM_PREFERENCIAL = ", você tem direito a ir para a fila preferencial.";

        System.out.println("===== Fila de Espera =====\n" +
                           "Este programa fará 3 perguntas para decidir se você vai para a fila comum ou preferencial.\n");
        System.out.print("Digite seu nome: ");
        nome = scString.nextLine();
        //scString.close();

        System.out.print("Qual é a sua idade?: ");
        idade = scInt.nextInt();
        //scInt.close();
        if (idade >= 65) {
            System.out.println(nome + MENSAGEM_PREFERENCIAL);
            //scChar.close();
            return;
        }

        System.out.print("Você é PCD? (s/n): ");
        pcd = scChar.next().charAt(0);
        if (pcd == 's') {
            System.out.println(nome + MENSAGEM_PREFERENCIAL);
            //scChar.close();
            return;
        }

        System.out.print("Você é gestante? (s/n): ");
        gestante = scChar.next().charAt(0);
        //scChar.close();
        if (gestante == 's') {
            System.out.println(nome + MENSAGEM_PREFERENCIAL);
            return;
        }

        System.out.println(nome + ", você não tem direito à fila preferencial. Direcione-se para a fila comum.");
    }

    void ex4() {
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("===== Idade de Entrada =====\n" +
                           "Este programa recebe a idade de um cliente e retorna se este pode ou não entrar num evento.\n");
        System.out.print("Digite seu nome: ");
        nome = scString.nextLine();
        //scString.close();
        System.out.println("Digite sua idade: ");
        idade = scInt.nextInt();
        //scInt.close();

        if (idade < 16) {
            System.out.println(nome + ", você não pode participar neste evento.");
        } else if (idade < 18) {
            System.out.println(nome + ", você apenas poderá participar neste evento com acompanhamento de responsáveis.");
        } else {
            System.out.println(nome + ", você pode participar neste evento!");
        }
    }

    void ex5() {
        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String senha = "1234";
        String userDigitado, senhaDigitada;

        System.out.println("===== Login =====\n" +
                           "Este programa recebe username e senha do usuário e retorna se estão corretos ou não.\n");
        System.out.print("Digite seu username: ");
        userDigitado = sc.nextLine();
        System.out.print("Digite sua senha: ");
        senhaDigitada = sc.nextLine();
        //sc.close();

        if (!(user.equals(userDigitado)) && !(senha.equals(senhaDigitada))) {
            System.out.println("Username e senha incorretos.\nO login falhou.");
        } else if (!(user.equals(userDigitado))) {
            System.out.println("Username incorreto.\nO login falhou.");
        } else if (!(senha.equals(senhaDigitada))) {
            System.out.println("Senha incorreta.\nO login falhou.");
        } else {
            System.out.println("Bem vind@, " + user + ".");
        }
    }

    void ex6() {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, maiorNota, notaRec, media;

        System.out.println("===== Passou ou Reprovou =====\n" +
                           "Este programa recebe as notas de um aluno e retorna se este passou ou reprovou.\n");
        System.out.print("Digite sua nota da primeira prova: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite sua nota da segunda prova: ");
        nota2 = sc.nextFloat();
        maiorNota = (nota1 >= nota2) ? nota1 : nota2;
        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Parabéns! Você está aprovad@!");
            //sc.close();
            return;
        } else if (maiorNota < 2) {
            System.out.println("Você reprovou...");
            //sc.close();
            return;
        }

        System.out.print("Você está de recuperação.\n" +
                         "Digite sua nota de recuperação: ");
        notaRec = sc.nextFloat();
        //sc.close();
        media = (maiorNota + notaRec) / 2;

        if (media >= 6) {
            System.out.println("Parabéns! Você está aprovad@!");
        } else {
            System.out.println("Você reprovou...");
        }
    }

    void ex7() {
        Scanner sc = new Scanner(System.in);
        int numero, divisor;
        System.out.println("===== Divisibilidade =====\n" +
                           "Este programa recebe dois números e retorna se o primeiro é divisível pelo segundo.\n");
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        System.out.print("Digite um número inteiro para ser seu divisor: ");
        divisor = sc.nextInt();
        //sc.close();

        if (numero % divisor == 0) {
            System.out.println("O número " + numero + " é divisível por " + divisor + ".");
        } else {
            System.out.println("O número " + numero + " NÃO é divisível por " + divisor + ".");
        }
    }

    public int vidas = 3;
    void ex8() {
        String mensagem = "Erros máximos excedidos. Você perdeu!";

        System.out.println("===== Hora do Quiz =====\n" +
                           "Este programa é um jogo de perguntas e respostas.\n");
        System.out.print("Como é o nome do país Holanda em holandês?\n" +
                         "1. Neverland           2. Nederland\n" +
                         "3. Holland             4. Netherlands\n\n" +
                         "Resposta: ");
        confereResposta(2);

        System.out.print("Qual destes NÃO é o nome de um personagem da série Super Mario?\n" +
                         "1. Daisy               2. Kamek\n" +
                         "3. Birdo               4. Kinsley\n\n" +
                         "Resposta: ");
        confereResposta(4);

        System.out.print("Qual destes prefixos do Sistema Internacional de unidades significa 10^12?\n" +
                         "1. Tera                2. Mega\n" +
                         "3. Zetta               4. Hecto\n\n" +
                         "Resposta: ");
        confereResposta(1);

        if (vidas == 0) {
            System.out.println(mensagem);
            return;
        }

        System.out.print("O nome da empresa de brinquedos Lego vem da frase dinamarquesa \"leg godt\", que significa:\n" +
                         "1. Encaixar bem        2. Brincar bem\n" +
                         "3. Bem caro            4. Construir bem alto\n\n" +
                         "Resposta: ");
        confereResposta(2);

        if (vidas == 0) {
            System.out.println(mensagem);
            return;
        }

        System.out.print("Quais dessas comidas é, apesar do nome, uma invenção brasileira?\n" +
                         "1. Filé a parmegiana  2. Pão francês\n" +
                         "3. Limonada suíça     4. Todas as anteriores\n\n" +
                         "Resposta: ");
        confereResposta(4);

        if (vidas == 0) {
            System.out.println(mensagem);
            return;
        }

        System.out.println("Parabéns! Você ganhou um trilhão de dólares!\n" +
                           "Número total de acertos: " + (2 + vidas));
    }

    public void confereResposta(int opcaoCorreta) {
        Scanner sc = new Scanner(System.in);
        int resposta = sc.nextInt();
        //sc.close();
        if (resposta != opcaoCorreta) {
            vidas--;
            System.out.println("Resposta errada!\n" +
                               "Número de vidas restantes: " + vidas +
                               "\nA resposta correta é " + opcaoCorreta + "\n");
        } else {
            System.out.println("Resposta correta!\n");
        }
    }
}
