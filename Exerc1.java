import java.util.Scanner;

public class Exerc1 {
	public static void main (String[] args) {
		Scanner vet = new Scanner(System.in);
		
		int n= 20;
		int v[] = new int [n];
		int i,p;
		int aux =0;
		
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = vet.nextInt();
		}
		
		p =n;
		for (i=0; i<n/2; i++) {
			aux = v[i];
			v[i] = v[p-1];
			v[p-1] = aux;
			p--;
		}
		
		for (i=0;i<n; i++) {
			System.out.println("Valor na posição: "+v[i]);
		}
		
	}
}




