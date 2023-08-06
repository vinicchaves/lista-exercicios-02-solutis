package questao02;//Programa que recebe 2 valores retornando o maior entre eles.
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor numérico.");
        double valor1 = leitura.nextDouble();

        System.out.println("Digite um outro valor numérico.");
        double valor2 = leitura.nextDouble();

        System.out.println("O maior valor é " + Math.max(valor1, valor2));


    }
}
