import java.util.Scanner;

public class Automovel {
    public static void main(String[] args) {
        int quilometros;
        int quilometrosTotal = 0;
        int litros;
        int litrosTotal = 0;
        int tanques = 0;
        float media;
        float mediaFinal;
        Scanner leitura = new Scanner(System.in);
// Entrada dos dados e acrescimo ao total
        while (true) {
            System.out.println("Digite a quantidade de quilômetros rodados");
            quilometros = leitura.nextInt();
            quilometrosTotal += quilometros;

            System.out.println("Digite a quantidade de litros de gasolina no tanque");
            litros = leitura.nextInt();
            litrosTotal += litros;

            media = (float)quilometros / litros; // cálculo da média de cada um
            tanques++;
            System.out.println("A média de quilômetros/litro dessa vez foi de : " + media + " quilômetros/litro \n");

            System.out.println("Deseja continuar e efetuar um novo registro? Digite 1 para continuar ou digite qualquer outro valor numérico para sair");
            mediaFinal = (float) quilometrosTotal/litrosTotal; // cálculo da média final

            int valor = leitura.nextInt();
            if (valor != 1) {
                break;
            }

        }

        System.out.println("A quilometragem total foi de: " + quilometrosTotal + " quilômetros");
        System.out.println("A quantidade total de litros foi de: "+ litrosTotal + " litros");
        System.out.println("A média total de quilômetros por litro foi de: "+ mediaFinal + " quilômetros/litro em uma quantidade de " + tanques + " tanques");
    }
}
