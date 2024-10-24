package Caderno01;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double L1, L2 , L3;

        System.out.print("Digite o primeiro lado: ");
        L1 = sc.nextDouble();
        System.out.print("Digite o segundo lado: ");
        L2 = sc.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        L3 = sc.nextDouble();

        if (L1 + L2 <= L3 || L1 + L3 <= L2 || L2 + L3 <= L1){
            System.out.println("Os lados não podem formar um triângulo.");
        } else {
            System.out.println("Os lados podem formar um triângulo.");
        }
    }
}
