import java.util.Scanner;

public class Exerc1 {
	public static void main (String[] args) {
		Scanner vet = new Scanner(System.in);
		
		int n= 20;
		int v[] = new int [n];
		int i;
		int aux =0;
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = vet.nextInt();
		}
		
		for (i=19; i>10;i--) {
			aux=v[i];
			v[i] = v[19-i];
			v[19-i] = aux;
		}
		
		for (i=0;i<n; i++) {
			System.out.println("Valor na posição: "+v[i]);
		}
		
	}
}




