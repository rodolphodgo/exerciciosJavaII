package Caderno02;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeslidas, soma, idade;
        double media;

        soma = 0;
        idadeslidas = 0;

        System.out.printf("Idade 1: ");
        idade = sc.nextInt();

        while(idade > 0) {
            soma = soma + idade;
            idadeslidas = idadeslidas + 1;
            System.out.printf("Idade %d: ", idadeslidas+1);
            idade = sc.nextInt();
        }

        media = (double) soma / idadeslidas;
        System.out.printf("Media das idades é %.1f\n", media);

    }
}

