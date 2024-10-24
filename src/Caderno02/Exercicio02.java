package Caderno02;

public class Exercicio02 {
    public static void main(String[] args) {

        int x, soma, media, quadrado;

        x = 1;
        soma = 0;
        quadrado = 0;

        while ( x <= 10) {
            soma = soma + x;
            quadrado = quadrado + x*x;
            x = x + 1;
        }

        media = soma / 10;

        System.out.println("A soma dos 10 primeiros números inteiros positivos é: " + soma);
        System.out.println("A soma dos quadrados é: " + quadrado);
        System.out.println("A sua média é: " + media);
    }
}
