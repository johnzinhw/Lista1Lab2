import java.util.Scanner;

public class Exerc3 {

	private int[] entrada(String nome) {
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Entre com o numero da posicao " + (i + 1)
					+ " da " + nome + ": ");
			vetor[i] = new Scanner(System.in).nextInt();
		}
		return vetor;
	}

	private int[] calculaMatC(int[] arrA, int[] arrB) {
		int[] matC = new int[10];
		System.out.print("\nMatriz C: ");
		for (int i = 0; i < 10; i++) {
			matC[i] = (arrA[i] * arrB[i]);
			System.out.print("" + matC[i] + " ");
		}
		return matC;

	}

	public void imprimeArray(int[] mat) {
		for (int i = 0; i < 10; i++) {
			System.out.print(mat[i] + " ");
		}
	}

	public void executar() {
		int[] matA = entrada("Matriz A");
		int[] matB = entrada("Matriz B");
		System.out.print("Matriz A: ");
		imprimeArray(matA);

		System.out.print("\nMatriz B: ");
		imprimeArray(matB);
		calculaMatC(matA, matB);
	}
}