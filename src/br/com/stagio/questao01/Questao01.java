package br.com.stagio.questao01;

public class Questao01 {

    public static void result (){
        int soma = 0;
        int k = 0;
        for(int i = 13; i > 0; i-- ){
            k += 1;
            soma += k;
        }
        System.out.println("Valor da soma: " + soma);
    }

    public static void main(String[] args) {
        Questao01.result();

    }
}
