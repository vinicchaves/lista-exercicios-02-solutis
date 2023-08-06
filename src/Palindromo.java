//Verificação de Palíndromo

import java.util.Scanner;

public class Palindromo
{
    public static void main(String[] args) {
        Scanner leitorDaPalavra = new Scanner(System.in);

        System.out.println("Digite uma palavra para analisar se ela é um palíndromo!");
        String palavra = leitorDaPalavra.nextLine();

        //Aplicando todas as letras como minúscula

        palavra = palavra.toLowerCase();

        //invertendo a palavra utilizando StringBuffer
        StringBuffer sb = new StringBuffer(palavra);
        String palavraInvertida = sb.reverse().toString();


        // Verificando se é um palíndromo
        if (palavra.equals(palavraInvertida)){
            System.out.println("""
                    A palavra pode ser lida da direita para esquerda ou da esquerda para direta.
                    Ou seja, essa palavra é um palíndromo.
                    """);

        }
        else {
            System.out.println("Essa palavra não é um palíndromo.");
        }
    }
}
