public class ProdutoImpares {
    public static void main(String[] args) {
        int imparInt = 1;
        float imparFloat = 1;

        // Obtendo valor com o tipo int
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0){
               imparInt *= i;
            }

        }
        // Obtendo valor com o tipo float
        for (int j = 15; j <= 30; j++) {
            if (j % 2 != 0){
                imparFloat *= j;
            }

        }


        System.out.println("o valor do produto quando utilizado o tipo int é " + imparInt);
        System.out.println("o valor do produto quando utilizado o tipo float é " + imparFloat);
    }
}
