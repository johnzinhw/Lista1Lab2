import java.util.Scanner;

public class MegaSena {

	public static void main(String[] args) {
	    
        Scanner teclado = new Scanner(System.in);
        int dezenas = 6;
        int[] aposta = new int[dezenas];

        /*
         * Preparando um array com 6 n�meros informados pelo apostador,
         * sem duplicidade, representando o bilhete da loteria.
         */
        System.out.println("Fa�a sua aposta: ");
        for (int i = 0; i < dezenas; i++) {
            int nroAposta;
            boolean repetido;
            do {
            	repetido = false;
            	System.out.print("Informe a dezena "+(i+1)+": ");
                nroAposta = teclado.nextInt();
                if (nroAposta < 1 || nroAposta > 60) {
                    System.out.println("N�mero inv�lido, aposta cancelada!");
                    return;
                }
        
                for (int j = 0; j < aposta.length; j++) {
                    if (aposta[j] == nroAposta) {
                    	repetido = true;
                    }
                }
                if (repetido) {
                    System.out.println("Ops, n�mero repetido!");
                }
            } while(repetido); // impede a repeti��o de n�mero

            aposta[i] = nroAposta;
        }
        
        
        
        /*
         * Preparando um array com 6 n�meros gerados randomicamente,
         * sem duplicidade, representando o sorteio da loteria.
         */
        
        int[] sorteio = new int[dezenas];
        
        for (int i = 0; i < dezenas; i++) {
            int sorteado;
            boolean repetido;

            do {
		repetido = false;
                sorteado = (int) (Math.random()*60)+1; //nro aleatorio de 1 a 60
                
                for (int j = 0; j < sorteio.length; j++) {
                    if (sorteio[j] == sorteado) {
                    	repetido = true;
                    }
                }
            } while(repetido); // evita repeti��o de n�meros
            if(!repetido){
            	sorteio[i] = sorteado;
            }
        }

        
        /*
         * Exibindo o array com 6 n�meros informados pelo apostador
         */
        System.out.println("\nConfira sua aposta: ");
        for (int i = 0; i < aposta.length; i++) {
             System.out.printf("%3d", aposta[i]);
        }

        /*
         * Exibindo o array com 6 n�meros gerados randomicamente
         */
        System.out.println("\nResultado do sorteio: ");
        for (int i = 0; i < sorteio.length; i++) {
             System.out.printf("%3d", sorteio[i]);
        }

        /*
         * Verificando o n�mero de acertos
         */
        int acertos = 0;
        for (int i = 0; i < dezenas; i++) {
            //compara cada nro apostado com os sorteados
            for (int j = 0; j < aposta.length; j++) {
                if (aposta[j] == sorteio[i]) {
                	acertos++;
                }
            }
        }
        
        System.out.println("\nN�mero de acertos: "+acertos);

        
        /*
         * Exibindo o resultado final da aposta
         */
        switch (acertos) {
            case 4: System.out.println("Parab�ns. Voc� acertou a quadra!"); break;
            case 5: System.out.println("Parab�ns. Voc� acertou a quina!"); break;
            case 6: System.out.println("Parab�ns. Voc� � campe�o da loteria!"); break;
            default: System.out.println("N�o foi dessa vez. Tente novamente!"); break;
        }
    }
}