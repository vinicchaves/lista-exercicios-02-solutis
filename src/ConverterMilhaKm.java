//Conversor de milha para quilômetro

import java.util.Scanner;

public class ConverterMilhaKm {
    public static double converter(double valorEmMilha){
        double km = valorEmMilha * 1.609;
        return km;

    }
    public static void main(String[] args) {
        // 1 milha = 1,609km
        Scanner leitura = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um valor em milha para ser convertido para Quilômetro");
            double valorEmMilha = leitura.nextDouble();

            if (valorEmMilha >= 0) {
                double resultado = converter(valorEmMilha);
                System.out.println("O valor convertido para quilômetro é:" + resultado + "km");
                break;

            } else {
                System.out.println("Valor inválido, tente novamente.");

            }

        }
    }
}
