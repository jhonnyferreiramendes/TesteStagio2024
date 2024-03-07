package br.com.stagio.questao02;
import br.com.stagio.questao01.Questao01;
import java.util.Scanner;

public class Questao02 {

    public static boolean verificaFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

}





