// package(pacote) é analogo a pastas, para agrupar classes relacionadas.
package fundamentos;

// classe é analogo a arquivo
public class PrimeiroPrograma {

	// main + ctrl + espaço
	// metódo main é o ponto de entrada de um programa Java
	public static void main(String[] args) {

		// syso + ctrl + espaço
		// imprime uma linha na saída padrão(console)
		System.out.println("Primeiro programa!!!");

		// Um livro é organizado: titulo -> capitulos -> seções -> paragrafos -> frase(sentenças).
		// O Java é organizado em blocos{} de códigos e sentenças de código.
		// Uma sentença de código termina com ponto e vírgula.
		// uma sentença pode ocupar multiplas linhas.
		System.out.println("Primeiro programa part 02");

		// Esta é um código valido embora não faça nada:
		;
		;

		// Um par de chaves delimita um bloco de código, agrupando sentenças
		// relacionadas
		{
			{
				// Esse espaçamento entre um bloco e outro é identação, para dar um ar hierarquico.
				// Auto identação: ctrl + shift + F.
				System.out.println("Primeiro programa part 03");
				System.out.println("Primeiro programa part 04");
			}
		}
	}

}
