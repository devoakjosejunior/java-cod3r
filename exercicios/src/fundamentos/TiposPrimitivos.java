// Literais inteiros são int e literais de ponto flutuante são double.
package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
//		long pontosAcumulados = 1_234_845_223; cabendo dentro de inteiros não precisa do sufixo "L"
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // or true
		
		//Tipo caractere
		char status = 'A'; // ou '\u0010';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
	
}
