import java.util.Random;
import java.util.Scanner;

public class Numrandom {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int l = 10;
		int c = 10;
		int m[][] = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int k = 0; k < c; k++) {
				Random generator = new Random();
				m[i][k] = generator.nextInt(9) + 1;
			}
		}

		// Exibindo Matriz original
		for (int i = 0; i < l; i++) {
			System.out.println();
			for (int k = 0; k < c; k++) {
				System.out.printf("%3d", m[i][k]);
			}
		}

		// Exercícios
		System.out.println();
		System.out.println();
		System.out.printf("\nValores da diagonal principal: ");
		for (int i = 0; i < l; i++) {
			System.out.println();
			for (int k = 0; k < c; k++) {
				if (i == k) {
					System.out.printf("%d", m[i][i]);
				} else {
					System.out.print(" ");
				}
			}
		}

		System.out.println();
		System.out.println();
		System.out.printf("Valores da diagonal secundária: ");
		for (int i = l-1; i>=0 ; i--) {
			System.out.println();
			for (int k = 0; k < c; k++) {
				System.out.printf("  ");
				
			}
			System.out.printf("%d", m[l-i-1][i]);
		}

		System.out.println();

		System.out.printf("Multiplicação");
		System.out.println();
		System.out.printf("Informe o valor a ser multiplicado: ");

		int n = 0;
		n = entrada.nextInt();
		for (int i = 0; i < l; i++) {
			System.out.println();
			for (int k = 0; k < c; k++) {

				System.out.printf("%d", m[k][i] * n);
			}

		}

		System.out.println();
		System.out.println();
		System.out.printf("Valores invertidos");
		for (int i = 0; i < l; i++) {
			System.out.println();
			for (int k = 0; k < c; k++) {
				System.out.printf("%3d", m[k][i]);
			}
		}

		System.out.println();
		System.out.println();
		System.out.printf("Valores acima da diagonal principal");
		for (int i = 0; i < l; i++) {
			System.out.println();
			for (int k = 0; k < c; k++) {
				if (k>i) {
					System.out.printf("%d", m[i][k]);
				} else {
					System.out.print("");
				}
			}
		}

			System.out.println();
			System.out.println();
			System.out.printf("Valores abaixo da diagonal principal");
			for (int i = 0; i < l; i++) {
				System.out.println();
				for (int k = 0; k < c; k++) {
					if (i>k) {
						System.out.printf("%d", m[i][k]);
					} else {
						System.out.print("");
					}
				}
			}
		}
	}
