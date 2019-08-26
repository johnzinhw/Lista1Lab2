import java.util.Scanner;
import java.util.Vector;

public class LoteriaEsportiva {
	

	Vector<Integer> cartelaGabarito = new Vector<Integer>();
	Vector<Integer> cartelaAposta = new Vector<Integer>();
	int aposta;
	int acertos = 0;
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new LoteriaEsportiva();
	}

	public LoteriaEsportiva(){		
		System.out.println("** - Gagarito da Loteria Esportiva - **");

		populaVetor(cartelaGabarito);		

		System.out.println("Informe o numero da aposta: ");
		aposta = input.nextInt();

		populaVetor(cartelaAposta);

		for (int i = 0; i < 13; i++) {
			if(cartelaGabarito.contains(cartelaAposta.get(i))){
				acertos++;
			}
		}

		if (acertos == 13)
			System.out.println(" Parabéns - " + aposta + " - você Ganhou, acertou os 13 números");
		else
			System.out.println("O Apostador - " + aposta + " - acertou = " + acertos + " Números!");
	}

	private void populaVetor(Vector<Integer> Vetor) {
		for (int i = 0; i < 13; i++) {
			System.out.printf("Informe numero: " + (i+1) + "/13: ");
			Vetor.add(input.nextInt());
		}
	}
	}
