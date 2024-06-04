package miniProjetos;

public class Calculadora {
    //Atributos
    double num1;
    double num2;

    //Construtores
    Calculadora(){

    }

    //Métodos
    static double somar(double num1, double num2){
        return num1 + num2;
    }
    static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    static double dividir(double num1, double num2){
        return num1 / num2;
    }
    static double mod(double num1, double num2){
        return num1 % num2;
    }
}
