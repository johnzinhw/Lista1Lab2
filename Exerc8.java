import java.util.Scanner;

public class Exerc8 {
	public static void main(String[] agrs) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Tamanho da matriz: ");
		int n = scanner.nextInt();
		int vetor[] = new int[n * n];
		int matriz[][] = new int[n][n];
		int aux = 0;
		boolean igual;

		System.out.println("______________________________________");

		for (int i = 0; i < n * n; i++) {
			igual = false;
			System.out.print("Informe o " + (i + 1) + "º num do vetor: ");
			aux = scanner.nextInt();
			if (i < 1) {
				vetor[i] = aux;
			}
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (vetor[j] == aux) {
						igual = true;
					}
				}
				if (igual == false) {
					vetor[i] = aux;
				}
				if (igual == true) {
					System.out.println("______________________________________");
					System.out.println("Numero repetido, re-insira outro valor!");
					i--;
				}
			}
		}

		aux = 0;

		for (int linha = 0; linha < n; linha++) {
			for (int coluna = 0; coluna < n; coluna++) {
				matriz[linha][coluna] = vetor[aux];
				aux++;
			}
		}
		System.out.println("______________________________________");
		System.out.println("Matriz: ");
		for (int linha = 0; linha < n; linha++) {
			for (int coluna = 0; coluna < n; coluna++) {
				System.out.print(matriz[linha][coluna]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}

		System.out.println("______________________________________");
		System.out.println("Informe um numero para pesquisar na matriz: ");

		aux = scanner.nextInt();
		igual = false;

		for (int i = 0; i < n * n; i++) {
			if (aux == vetor[i]) {
				igual = true;
			}
		}

		if (igual == false) {
			System.out.println("O numero nao exise na matriz.");
		}
		if (igual == true) {
			System.out.println("O numero existe na matriz.");
		}

		scanner.close();

	}
}