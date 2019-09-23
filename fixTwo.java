import java.util.ArrayList;
import java.util.Scanner;

public class fixTwo {

	public static void main(String[] args) {
		int n = 3;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> telefones = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			String nome = ler.nextLine();

			System.out.print("Telefone: ");
			String telefone = ler.nextLine();

			telefones.add(nome + "," + telefone);
			System.out.println("Adicionado!");

		}

		System.out.print("Nome: ");
		String nome = ler.nextLine();
		for (int i = 0; i < n; i++) {
			String dados_telefones = telefones.get(i);
			System.out.println(dados_telefones);
			String dados[] = dados_telefones.split(",");
			if (nome == dados[0]) {
				System.out.println(dados[1]);
			}

		}
	}

}
