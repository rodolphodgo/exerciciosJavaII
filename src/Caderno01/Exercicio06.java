package Caderno01;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        C = sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        D = sc.nextInt();

        if (A % 2 == 0 || A % 3 == 0){
            System.out.println("O primeiro valor é divisível por 2 ou por 3.");
        }
        if (B % 2 == 0 || B % 3 == 0){
            System.out.println("O segundo valor é divisível por 2 ou por 3.");
        }
        if (C % 2 == 0 || C % 3 == 0){
            System.out.println("O terceiro valor é divisível por 2 ou por 3.");
        }
        if (D % 2 == 0 || D % 3 == 0){
            System.out.println("O quarto valor é divisível por 2 ou por 3.");
        }
    }
}
