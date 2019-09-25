import java.util.ArrayList;
import java.util.Scanner;

public class ex5array {
	public static void main(String[] args) {
		int a;
		Scanner ler = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Lucas Alvarenga");
		nomes.add("Carla Fragoso");
		nomes.add("João Sttifert");
		nomes.add("Yun Haito");
		nomes.add("Felicia Brum");

		System.out.println("Qual deseja deletar?");
		System.out.println();
		System.out.println("1" + nomes.get(0));
		System.out.println("2" + nomes.get(1));
		System.out.println("3" + nomes.get(2));
		System.out.println("4" + nomes.get(3));
		System.out.println("5" + nomes.get(4));
		
		a = ler.nextInt();
		nomes.remove(a-1);

		System.out.println(nomes);

	}

}
