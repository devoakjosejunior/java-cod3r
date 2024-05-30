package fundamentos;

public class VariaveisEConstantes {

    public static void main(String[] args) {

        // sintaxe variavel: <tipo> <nomeVariavel> = <valor>;
        // O "=" é um simbolo de atribuição. Igualdade é "==".
        double raio = 3.4;

        //sintaxe constante: <final> <tipo> <NOME_CONSTANTE>;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        //Uma vez declarada a variavel não é necessário colocar o tipo.
        raio = 10;
        area = PI * raio * raio;

        // o "+" quando envolver string ele concatena.
        System.out.println("Area = " + area + "m².");
    }
}
