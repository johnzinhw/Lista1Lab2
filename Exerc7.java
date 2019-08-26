import java.util.Scanner;

public class Exerc7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tamanho da matriz: ");
		int n = scanner.nextInt();
		int A[][] = new int[n][n];
		int aux = 0;

		System.out.println("______________________________");
		System.out.println("Informe os valores da matriz: ");

		for (int linha = 0; linha < n; linha++) {
			for (int coluna = 0; coluna < n; coluna++) {
				System.out.print((aux + 1) + "º valor: ");
				A[linha][coluna] = scanner.nextInt();
				aux++;
			}
		}

		System.out.println("______________________________");
		aux = 0;

		for (int coluna = 0; coluna < n; coluna++) {
			System.out.println((aux + 1) + "ª coluna: ");
			for (int linha = 0; linha < n; linha++) {
				if (coluna == linha) {
					System.out.println("Num. Diagonal principal.");
				} else {
					System.out.println(A[linha][coluna]);
				}
			}
			aux++;
			System.out.println(" ");
		}

		scanner.close();
	}
}