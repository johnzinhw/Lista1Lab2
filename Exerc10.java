import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Numero de linhas: ");
		int n1 = scanner.nextInt();
		int n2 = 5;
		String matriz[][] = new String[n1][n2];
		
		for(int linha = 0; linha < 1; linha++) {
			for(int coluna = 0; coluna < n2; coluna++) {
				if(coluna == 0) {
					matriz[linha][coluna] = "NOME";
				}
				if(coluna == 1) {
					matriz[linha][coluna] = "ENDERECO";
				}
				if(coluna == 2) {
					matriz[linha][coluna] = "CEP";
				}
				if(coluna == 3) {
					matriz[linha][coluna] = "BAIRRO";
				}
				if(coluna == 4) {
					matriz[linha][coluna] = "TELEFONE";
				}
			}
		}
		
		scanner.nextLine();
		
		for(int linha = 1; linha < n1; linha++) {
			for(int coluna = 0; coluna < n2; coluna++) {
				if(coluna == 0) {
					System.out.println("Informe o " + matriz[0][coluna]);
					matriz[linha][coluna] = scanner.nextLine();
				}
				if(coluna == 1) {
					System.out.println("Informe o " + matriz[0][coluna]);
					matriz[linha][coluna] = scanner.nextLine();
				}
				if(coluna == 2) {
					System.out.println("Informe o " + matriz[0][coluna]);
					matriz[linha][coluna] = scanner.nextLine();
				}
				if(coluna == 3) {
					System.out.println("Informe o " + matriz[0][coluna]);
					matriz[linha][coluna] = scanner.nextLine();
				}
				if(coluna == 4) {
					System.out.println("Informe o " + matriz[0][coluna]);
					matriz[linha][coluna] = scanner.nextLine();
				}
			}
		}
		
		System.out.println("______________________________________");
		System.out.println("Matriz: ");
		for (int linha = 0; linha < n1; linha++) {
			for (int coluna = 0; coluna < n2; coluna++) {
				System.out.print(matriz[linha][coluna]);
				System.out.print(" | ");
			}
			System.out.println(" ");
		}

		
		System.out.println("______________________________________");
		System.out.println("Matriz invertida: ");
		for (int linha = n1; linha == 0; linha--) {
			for (int coluna = n2; coluna == 0; coluna--) {
				System.out.print(matriz[linha][coluna]);
				System.out.print(" | ");
			}
			System.out.println(" ");
		}
		
		scanner.close();
		
	}
}