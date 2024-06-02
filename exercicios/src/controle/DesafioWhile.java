package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota = 0, total = 0, alunos = 0; 
        
        while(nota != -1){
            System.out.print("Digite uma nota (0 a 10): ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10){
                total += nota;
                alunos++;
            }
        }

        double media = total / alunos;
        System.out.printf("A média é %.1f", media);

        entrada.close();
    }
}
