package Caderno01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;

        System.out.print("Digite o valor a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor c: ");
        c = sc.nextDouble();

        delta = (b*b) - (4*a*c);

        if (delta < 0){
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0) {
            System.out.println("A equação possui duas raízes reais.");
        } else {
            System.out.println("A equação possui uma única raíz real.");
        }
        System.out.println(delta);
    }
}