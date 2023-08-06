//Resultado da divisão por 2 de todos os múltiplos de 3 entre 1 e 100
public class DivisaoDeMultiplos
{
    public static void main(String[] args) {
        // obtendo os múltiplos de 3 e dividindo por 2, utilizando o int
        System.out.println("Resultados utilizando int: \n");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0){
                int resultadosInt = i/2;
                System.out.println(resultadosInt);

            }

        }
        // obtendo os múltiplos de 3 e dividindo por 2, utilizando o double
        System.out.println("\nResultados utilizando double: \n");
        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0){
                double resultadosDouble = (double) j/2;
                System.out.println(resultadosDouble);
            }

        }
    }
}
