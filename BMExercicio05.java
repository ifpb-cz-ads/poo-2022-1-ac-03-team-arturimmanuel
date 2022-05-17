import java.util.Scanner;

public class BMExercicio05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        do {
            System.out.print("Insira um número entre 1 e 7: ");
            numero = sc.nextInt();
        }while (numero < 1 || numero > 7);

        numero--;

        System.out.println(dias[numero]);

        sc.close();
    }
}