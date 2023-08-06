//Dia da semana correspondente a um número inteiro, de 1 a 7, lido, utilizando array.

import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        String[] diasDaSemana = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para saber o dia correspondente.");
        int dia = leitura.nextInt();

        if (dia >= 1 && dia <=7){

            switch(dia){
                case 1:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 2:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 3:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 4:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 5:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 6:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
                case 7:
                    System.out.println(diasDaSemana[dia-1]);
                    break;
            }
        }
        else {
            System.out.println("O número não corresponde a algum dia da semana.");
        }

    }
}
