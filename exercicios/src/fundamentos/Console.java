package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite o cargo na empresa: ");
		entrada.nextLine(); //lê o "\n" que o entrada.nextInt() deixa para trás. Limpando o buffer do teclado.
		String cargo = entrada.nextLine();
		
		System.out.print("Digite o salário: ");
		double salario = entrada.nextDouble();
		
		System.out.printf("%s %s tem %d anos e ocupa o cargo de %s e ganha R$ %.2f.%n",
				nome, sobrenome, idade, cargo, salario);
		
		entrada.close();
		
	}

}