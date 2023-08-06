package questao11;

import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        String palavra1, palavra2;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma palavra para comparar.");
        palavra1 = leitura.nextLine();

        System.out.println("Digite uma segunda palavra para comparar.");
        palavra2 = leitura.nextLine();

        // Removendo possíveis espaços em branco durante a digitação das palavras
        palavra1 = palavra1.replace(" ", "");
        palavra2 = palavra2.replace(" ","");

        // Comparando as 2 palavras para saber a ordem alfabética ignorando a letra maiúscula
        int resultado = palavra1.compareToIgnoreCase(palavra2);


        if( resultado < 0 ){
            System.out.println(String.format("Em ordem alfabética: %s , %s", palavra1, palavra2));
        }
        else if ( resultado > 0){
            System.out.println(String.format("Em ordem alfabética: %s , %s", palavra2, palavra1));
        }
        else{
            System.out.println("As palavras são iguais a ordem não importa");
        }

        // Comparando o tamanho das 2 palavras

        int tamanhoPalavra1 = palavra1.length();
        int tamanhoPalavra2 = palavra2.length();


        if(tamanhoPalavra1 > tamanhoPalavra2){
            System.out.println(String.format("A palavra %s é a maior e possui %d caracteres", palavra1, tamanhoPalavra1));
        }
        else if( tamanhoPalavra2 > tamanhoPalavra1){
            System.out.println(String.format("A palavra %s é a maior e possui %d caracteres", palavra2, tamanhoPalavra2));
        }
        else{
            System.out.println("As duas palavras possuem a mesma quantidade de caracteres.");
        }


    }
}
