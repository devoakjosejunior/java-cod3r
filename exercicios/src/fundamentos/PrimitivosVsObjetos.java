package fundamentos;

public class PrimitivosVsObjetos {

	public static void main(String[] args) {
		
		//String s = "texto";
		String s = new String("texto");
		s.toUpperCase();
		
		int a = 123;
//		a. primitivos não tem notação ponto!
		System.out.println(a);
		
		//Wrapper são a versão objeto dos tipos primitivos. POssuem atributos e comportamentos.
		Integer b = 123;
		System.out.println(b.intValue());

	}

}
