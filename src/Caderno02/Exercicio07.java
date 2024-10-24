package Caderno02;

public class Exercicio07 {
    public static void main(String[] args) {
        int numero;

        numero = 15;

        while (numero >= 15 && numero <= 200) {
            System.out.println("O quadrado de " + numero + " é: " + Math.pow(numero,2));
            numero = numero + 1;
        }
    }
}
