//Leitura de um número inteiro e impressão dos números primos menores que o mesmo

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner numeroInteiro = new Scanner(System.in);

        System.out.println("Digite um número inteiro.");
        int numero = numeroInteiro.nextInt();

        for(int i = 2; i < numero; i++) {
            boolean numeroPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    numeroPrimo = false;
                }
            }

            if(numeroPrimo) {
                System.out.println(i);
            }
        }
    }
}
