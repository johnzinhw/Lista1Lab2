import java.util.Calendar;
import java.util.Scanner;

public class imports {
	
//	public static String nome ="JOHN";
	
	public static void main(String[] Args) {
		saudacao("JOHN","Dr.");
	}

	
	public static void saudacao(String nome, String tipo) {

		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

//		Scanner ler = new Scanner (System.in);
//		System.out.printf("Digite o seu nome: ");
//		String nome = ler.nextLine();

		if (hora >= 6 && hora < 12) {
			System.out.print("Bom dia, "+tipo+ nome);

		} else {
			if (hora >= 12 && hora < 18) {
				System.out.print("Boa Tarde, "+tipo+ nome);
			} else {
				System.out.print("Boa Noite, "+tipo+ nome+"!");
			}
		}
	}

}
