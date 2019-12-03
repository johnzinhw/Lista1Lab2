
public class prova_cinco {
	public static void main (String [] args) {
		fatorial(12,1);
		
	}
	
	public static void fatorial (int x, int y ) {
		y=y*x;
		x=x-1;
		if(x>=1) {
			fatorial (x,y);
		}
		else {
			System.out.println(y);
		}
	}

}