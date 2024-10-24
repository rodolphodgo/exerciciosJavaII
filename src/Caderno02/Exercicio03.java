package Caderno02;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero;

        numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();
            System.out.println("O quadrado é: " + Math.pow(numero,2));
        }

    }
}
