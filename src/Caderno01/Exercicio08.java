package Caderno01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        C = sc.nextInt();;

        if (A < B && A < C){
            System.out.println("O primeiro valor digitado é o menor valor.");
        } else if (B < A && B < C){
            System.out.println("O segundo valor digitado é o menor valor.");
        } else {
            System.out.println("O terceiro valor digitado é o menor valor.");
        }
    }
}
