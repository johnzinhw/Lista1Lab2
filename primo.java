import java.util.Scanner;

public class primo {

	public static void main(String[] args) {
		int N;
		int cont = 0;
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um n�mero maior do que zero: ");

		do {
			System.out.print("Digite um n�mero v�lido: ");
			N = tec.nextInt();
		} while (N <= 0);

		for (int i = 1; i <= N; i++) {
			cont++;
		}
		if (cont == 2) {
			System.out.println("O numero " + String.valueOf(N) + " � primo");
		}
	}

}
