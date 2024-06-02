package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite um número: ").replace(",", ".");
		String op = JOptionPane.showInputDialog("Digite um operador (+ - / * %): ");
		String num2 = JOptionPane.showInputDialog("Digite um outro número: ").replace(",", ".");
		
		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		
		double resultado = op.equals("+") ? valor1 + valor2 : 0;
		resultado = op.equals("-") ? valor1 - valor2 : resultado;
		resultado = op.equals("/") ? valor1 / valor2 : resultado;
		resultado = op.equals("*") ? valor1 * valor2 : resultado;
		resultado = op.equals("%") ? valor1 % valor2 : resultado;
		
		JOptionPane.showMessageDialog(null, resultado);
	}

}
