import java.util.ArrayList;
import java.util.Scanner;

public class fixTwo {

	public static void main(String[] args) {
		ArrayList<String> infoP = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Nome: ");
			String dados = new Scanner(System.in).nextLine();
			infoP.add(dados);
			System.out.println("Adicionado!");

			System.out.println(dados);
		}

	}
}