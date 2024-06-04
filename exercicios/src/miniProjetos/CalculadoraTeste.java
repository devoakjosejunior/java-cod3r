package miniProjetos;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String valor1 = JOptionPane.showInputDialog("Digite um número:");
        String operador = JOptionPane.showInputDialog("Digite o operador (+, -, *, /, %):");
        String valor2 = JOptionPane.showInputDialog("Digite um número:");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        
        Double resultado = null;

        switch (operador) {
            case "+":
                resultado = Calculadora.somar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "-":
                resultado = Calculadora.subtrair(num1, num2);
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "*":
                resultado = Calculadora.multiplicar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "/":
                resultado = Calculadora.dividir(num1, num2);
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "%":
                resultado = Calculadora.mod(num1, num2);
                JOptionPane.showMessageDialog(null, resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador inválido!");
                break;
        }

        entrada.close();
    }
}
