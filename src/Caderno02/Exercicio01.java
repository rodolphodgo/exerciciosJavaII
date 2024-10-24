package Caderno02;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero, x, soma;

        x = 0;
        soma = 0;

        while (x < 10) {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();
            soma = soma + numero;
            x = x + 1;
        }

        System.out.println("A soma dos números digitados é " + soma);
    }
}
