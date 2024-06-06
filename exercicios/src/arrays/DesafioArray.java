package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas o usuário quer informar?");
        int n = entrada.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "º nota: ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média do aluno é: " + media);

        entrada.close();
    }
}
