import java.util.Scanner;
public class LoteriaEsportivaMatriz {
	public static void main(String[] args) {
		
		String[][] aposta=new String[13][3];
		int opcao,empate=0,a=0,b=0;
		float v,valorPagar;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor da aposta:");
		v=scan.nextFloat();

		for(int i=0;i< aposta.length;i++){
			do{
				System.out.println("Digite a opção da aposta nº"+i+"\n1-Tima A\n2-Empate\n3-Time B");
				opcao=scan.nextInt();
				switch(opcao){
				case 1:
					a++;
					aposta[i][0]="X";
					aposta[i][1]="0";
					aposta[i][2]="0";
					break;

				case 2:
					empate++;
					aposta[i][0]="0";
					aposta[i][1]="X";
					aposta[i][2]="0";
					break;

				case 3:
					b++;
					aposta[i][0]="0";
					aposta[i][1]="0";
					aposta[i][2]="X";
					break;

				default:
					System.out.println("INSIRA UM VALOR VALIDO!");
				}
			}while(opcao!=1&&opcao!=2&&opcao!=3);
		}
		for(int i=0;i<aposta.length;i++){    
			System.out.print(aposta[i][0]+" ");
			System.out.print(aposta[i][1]+" ");
			System.out.print(aposta[i][2]+" ");
			System.out.println();
		}
	}
}