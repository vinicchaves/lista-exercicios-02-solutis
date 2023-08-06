//Calculo da área de um círculo através do raio

import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        float r;
        double areaNormal;
        double areaMath;
        double pi = 3.1459;


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo para calcular a área");
        r = leitura.nextFloat();

// Cálculo da área
        areaNormal = pi * (r * r);

// Cálculo da área utilizando Math
        areaMath = Math.PI * (Math.pow(r,2));


        System.out.println(String.format("O valor, arredondado, calculado da área, foi de: %.2f",areaNormal));
        System.out.println(String.format("O valor, arredondado, calculado da área, utilizando o Math, foi de: %.2f",areaMath));
    }
}
/* O arredondamento é possível, também, utilizando o Math.round(), optei por utilizar apenas o arredondamento em casas decimais. */