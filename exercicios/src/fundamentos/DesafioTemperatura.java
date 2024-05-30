// No JDK 9  foi introduzido um interpretador dentro do terminal: jshell.
// O PHP e Ruby tabm tem interpretador dentro do terminal.
package fundamentos;

public class DesafioTemperatura {
    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0; // cuidado! divisão de inteiros resulta em inteiros.
        
        double F = 86.0;
        double C = (F - AJUSTE) * FATOR;
        System.out.println("Temperatura = " + C + "°C.");

        F = 0.0;
        C = (F - AJUSTE) * FATOR;
        System.out.println("Temperatura = " + C + "°C.");
    }

}
