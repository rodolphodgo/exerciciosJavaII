package Caderno01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, diferenca;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2){
            diferenca = n1 - n2;
            System.out.println("O primeiro valor digitado é maior que o segundo. Diferença: " + diferenca);
        } else if (n2 > n1) {
            diferenca = n2 - n1;
            System.out.println("O segundo valor digitado é maior que o primeiro. Diferença: " + diferenca);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
