package Caderno01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, aumento, novosalario;

        System.out.print("Qual é o salário: ");
        salario = sc.nextDouble();

        if ( salario < 5000){
            aumento = salario/100*30;
            novosalario = salario + aumento;
            System.out.println("O salário atual de " + salario + " terá um aumento de " + aumento + ", se tornando " + novosalario + ".");
        } else {
            System.out.println("O funcionário não terá aumento.");
        }
    }
}
