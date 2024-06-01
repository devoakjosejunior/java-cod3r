package fundamentos;

import java.util.Locale;
import java.util.Scanner;


// A partir do Scanner, pegar 3 strings usando nextLine()
// essas strings são os ultimos 3 salarios
// pode separar com virgula ou com ponto
// calcular a média
public class DesafioConversao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os últimos três salários:");
		String valor1 = entrada.nextLine().replace(",", ".");
		String valor2 = entrada.nextLine().replace(",", ".");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3.0;
		System.out.printf("A média salarial é $ %.2f", media);
		
		
		
		entrada.close();
	}

}
