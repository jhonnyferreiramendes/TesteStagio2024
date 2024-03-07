package br.com.stagio.questao05;
import java.util.Scanner;

public class Questao05 {

    public static String inverterString(String input) {
        char[] caracteres = input.toCharArray();

        // Inverte os caracteres no array
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        // Cria uma nova string a partir do array invertido
        return new String(caracteres);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir uma string
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        // Inverte a string e exibe o resultado
        String resultado = inverterString(input);
        System.out.println("String invertida: " + resultado);
    }

}