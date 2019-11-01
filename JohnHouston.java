import java.util.ArrayList;
import java.util.Scanner;

public class JohnHouston {
	public static void main (String[] args) {
		int n = 10;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> notas = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			System.out.print("Alunos: ");
			String nome = ler.nextLine();
			
			System.out.print("Nota1: ");
			String nota1 = ler.nextLine();
			
			System.out.print("Nota2: ");
			String nota2 = ler.nextLine();
			
			notas.add(nome + "," + nota1+ ","+nota2);
			System.out.println("Adicionado!");
			
		}
	}

}
