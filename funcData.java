import java.util.Calendar;
import java.util.Scanner;

public class funcData {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Dia em que voce nasceu: ");
		int diaNasc = in.nextInt();

		System.out.println("Mes em que voce nasceu: ");
		int mesNasc = in.nextInt();

		System.out.println("Ano em que voce nasceu: ");
		int anoNasc = in.nextInt();

		int x = idade(diaNasc, mesNasc, anoNasc);

		if (x >= 12) {
			System.out.println("acesso permitido!");
		} else {
			System.out.println("acesso não permitido!");
		}
	}

	public static int idade(int diaNasc, int mesNasc, int anoNasc) {
		Calendar cal = Calendar.getInstance();

		int anoAtual = cal.get(Calendar.YEAR);
		int mesAtual = cal.get(Calendar.MONTH) + 1;
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);

		int idade = anoAtual - anoNasc;
		
		if (mesAtual < mesNasc) {
			idade--;
		}else {
			if (mesAtual == mesNasc && diaAtual < diaNasc) {
				idade--;
			}
		}
		
		System.out.println("Idade: "+idade+"anos.");

		return idade;

	}

}
