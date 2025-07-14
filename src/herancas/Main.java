package herancas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos ninjas iram ser digitados? ");
        int qtdNinjas = sc.nextInt();

        Especial[] ninja = new Especial[qtdNinjas];

        sc.nextLine();
        for (int i =0; i < qtdNinjas; i++) {
            System.out.print("Qual o Nome do ninja? ");

            String nome = sc.nextLine();
            System.out.print("Qual a idade do ninja? ");
            int idade = sc.nextInt();

            System.out.print("Qual a missao do ninja? ");
            sc.nextLine();
            String missao = sc.nextLine();

            System.out.print("Qual o rank da missão? ");
            char rankMissao = sc.next().charAt(0);

            System.out.print("Qual o status da missão? ");
            sc.nextLine();
            String statusMissao = sc.nextLine();

            System.out.print("Qual o ataca especial do ninja? ");
            String ataqueEspecial =sc.nextLine();


            System.out.println("NINJA CADASTRADO COM SUCESSO!");
            System.out.println();

            ninja[i] = new Especial(nome,idade,missao,rankMissao,statusMissao, ataqueEspecial);

        }

        for (int i = 0; i<qtdNinjas; i++) {
            System.out.println(ninja[i]);
        }
        sc.close();

    }



}
