package Classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        
        AreaCirc a2 = new AreaCirc(5);

        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);

        System.out.println(AreaCirc.area(100));
    }
}
