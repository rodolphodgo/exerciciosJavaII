package Caderno01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.print("Digite qualquer valor: ");
        n1 = sc.nextInt();

        if (n1 >= 1 && n1 <= 9){
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}
