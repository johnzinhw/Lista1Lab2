
public class naorecursivo {
	
	public static void main (String[] args) {
		int fat = fatorial(3);
		System.out.println(fat);
	}
	
	public static int fatorial (int x) {
		int fat = 1;
		for (int i=x; i>=1; i--) {
			fat = fat * i;
		}
		
		return fat;
	}

}
