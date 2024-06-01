package fundamentos;

public class ConversoesDeTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		
//		float b = 1.0F;
		float b = (float)1.123456788888; //conversão explicita (CAST). 
		System.out.println(b);
		
		int c = 128; 
		byte d = (byte)c; // overflow. Gera um efeito roleta.
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int)e; // trunca as casas decimais!
		System.out.println(f);
	}

}
