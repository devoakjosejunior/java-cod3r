package fundamentos;

// atalho para importar ctrl + shoft + o.
import java.util.Date;

//import javax.swing.JButton;

public class Import {

	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!";
		java.lang.System.out.println(b);
		
		// o pacote java.lang já é disponivel por padrão, não precisando importar.
		String s = "Bom dia!";
		System.out.println(s);
		
		
		Date d = new Date();
		System.out.println(d);
		
//		JButton botao = new JButton();

	}

}
