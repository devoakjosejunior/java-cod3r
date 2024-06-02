package fundamentos;

import java.util.Locale;
import java.util.Scanner;


public class Revisao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        
       System.out.print("Digite seu salario: ");
       double salario = scan.nextDouble();
       System.out.printf("Salario: R$ %.2f",salario);
        

        scan.close();
    }
}
