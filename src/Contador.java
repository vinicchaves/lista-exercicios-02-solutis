import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int vogais = 0, consoantes = 0, espacos = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma frase.");
        String frase = leitura.nextLine();
        frase = frase.toLowerCase();


//Analisando a frase completa caractere por caractere
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            //verificando a quantidade de vogais, consoantes e espaços em branco
                    if(caractere >='a' && caractere <= 'z'){
                        if(caractere == 'a' || caractere =='e'|| caractere =='i'|| caractere =='o'|| caractere =='u'){
                            vogais++;
                        }
                        else{
                            consoantes++;
                        }

                    }
                    else if (caractere == ' '){
                        espacos++;
            }

        }
        System.out.println("O número de vogais dessa frase foi de: "+ vogais);
        System.out.println("O número de consoantes dessa frase foi de: "+ consoantes);
        System.out.println("O número de espaços em branco dessa frase foi de: "+ espacos);
    }
}
