package fundamentos;

// A inferência de tipos surgiu no Java 10.
public class InferenciaTipos {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        // O var só funciona dentro de metodo!
        // O var infere pelo valor atribuido.
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);
        c = "Outro texto";
        System.out.println(c);

        // c = 4.5;
        // As variaveis em java são sempre do mesmo tipo. Não é possivel mudar o tipo, uma vez que já foi definido.

        double d; // variavel foi declarada
        d = 123.65; // variável inicializada
        System.out.println(d); // variavel utilizada

        // var e; erro! é preciso declarar e inicializar na mesma linha
        // e = 123.45; 

    }
}
