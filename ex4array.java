import java.util.ArrayList;
import java.util.Scanner;

public class ex4array {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			ArrayList<String> nomes = new ArrayList<String>();

			nomes.add("a");
			nomes.add("b");
			nomes.add("c");
			nomes.add("d");
			nomes.add("e");
			
			for (int i = 4; i>=0; i--) {
				System.out.println(nomes.get(i));
		}

	}

}
