import java.util.Scanner;

public class MatrizProfessor {
	public static void main ( String[] args) {
		
		Scanner ler = new Scanner ( System.in);
		
		int l =10; //numero de linhas
		int c = 10; //numero de colunas
		
		int a[][] = new int [l][c]; // declaracao da matriz a
		int b[][] = new int [l][c]; // declaracao da matriz b
		int i,j, mult;
		
		//entrando valores da matriz
		for (i=0; i<l; i++) {
			for (j=0; j<c; j++) {
				a[i][j] = ler.nextInt();
				b[i][j] = ler.nextInt();
			}
		}
		
		//entrada de valores na matriz
		for (i=0; i<l; i++) {
			for (j=0; j<c; j++) {
				mult = a[i][j]* b[i][j];
				System.out.println(mult);
				
			}
		}
	}

}
