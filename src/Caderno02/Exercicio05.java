package Caderno02;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double litro, distancia, media;
        int x, viagem;

        x = 1;
        media = 0;

        System.out.print("Quantas viagens foram feitas? ");
        viagem = sc.nextInt();

        while (x <= viagem) {
            System.out.print("Quantos litros foram consumidos? ");
            litro = sc.nextDouble();
            System.out.print("Quantos km foram percorridos? ");
            distancia = sc.nextDouble();

            media = (media + litro) / viagem;

            x = x + 1;
        }

        System.out.println("A média de gasolina gasta foi: " + media);

    }
}
