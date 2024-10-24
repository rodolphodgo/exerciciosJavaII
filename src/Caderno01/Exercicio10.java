package Caderno01;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lab, ava, exa, mediaponderada;

        System.out.print("Nota do trabalho de laboratório: ");
        lab = sc.nextDouble();
        System.out.print("Nota da avaliação semestral: ");
        ava = sc.nextDouble();
        System.out.print("Nota do exame final: ");
        exa = sc.nextDouble();

        mediaponderada = (2*lab+3*ava+5*exa)/(2+3+5);

        if (mediaponderada >= 8 && mediaponderada <= 10){
            System.out.println("Conceito A");
        } else if (mediaponderada >= 7 && mediaponderada <8) {
            System.out.println("Conceito B");
        } else if (mediaponderada >= 6 && mediaponderada <7) {
            System.out.println("Conceito C");
        } else if (mediaponderada >= 5 && mediaponderada < 6) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
    }
}
