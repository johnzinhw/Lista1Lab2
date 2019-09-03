import java.util.Scanner;

public class SorteioSeis {

    static int NUMERO_DEZENAS = 6;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] sorteio = sorteaSena();
        int[] aposta = new int[NUMERO_DEZENAS];

        //trecho processa a aposta
        System.out.println("Fa�a sua aposta: ");
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
            int nroAposta;
            boolean repetido = false;

            do {
		System.out.print("Informe a dezena "+(i+1)+": ");
                nroAposta = teclado.nextInt();
                if (nroAposta <= 0) {
                    System.out.println("N�mero inv�lido, aposta cancelada!");
                    return;
                }
                repetido = existeNumero(aposta, nroAposta);
                if (repetido) {
                    System.out.println("Ops, n�mero repetido!");
                }
            } while(repetido); // evita repeti��o de n�mero

            aposta[i] = nroAposta;
        }

	System.out.println("\nConfira sua aposta: ");
        for (int i = 0; i < aposta.length; i++) {
             System.out.print(aposta[i] + " ");
        }

        System.out.println("\nResultado do sorteio: ");
        for (int i = 0; i < sorteio.length; i++) {
             System.out.print(sorteio[i] + " ");
        }

        int nroAcertos = contaAcertos(sorteio, aposta);
        System.out.println("\nN�mero de acertos: "+nroAcertos);

        switch (nroAcertos) {
            case 4: System.out.println("Parab�ns. Voc� acertou a quadra!"); break;
            case 5: System.out.println("Parab�ns. Voc� acertou a quina!"); break;
            case 6: System.out.println("Parab�ns. Voc� � campe�o da MegaSena!"); break;
            default: System.out.println("N�o foi dessa vez. Tente novamente!"); break;
        }
    }

    /*
     * Fun��o retorna uma array com 6 n�meros gerados randomicamente (API do Java),
     * sem duplicidade, representando o sorteio da megasena.
     */
    static int[] sorteaSena() {
        int[] resultado = new int[NUMERO_DEZENAS];
        
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
            int sorteado;
            boolean repetido = false;

            do {
                sorteado = (int) (Math.random()*60)+1; //nro aleatorio de 1 a 60
                repetido = existeNumero(resultado, sorteado);
            } while(repetido); // evita repeti��o de n�mero

            resultado[i] = sorteado;
        }
        return resultado;
    }

    /*
     * Fun��o comparada cada n�mero apostado, com os n�meros sorteados.
     * Por fim retorna a quantidade de acertos.
     */
    static int contaAcertos(int[] sorteio, int[] aposta) {
        int acertos = 0;
        for (int i = 0; i < NUMERO_DEZENAS; i++) {
            int nroAposta = aposta[i];

            //compara cada nro apostado com os sorteados
            if (existeNumero(sorteio, nroAposta)) {
                acertos++;
            }
        }
        return acertos;
    }

    /*
     * Fun��o indica se o n existe no array numeros.
     * �til para validar duplicadade de dados.
     */
    static boolean existeNumero(int[] numeros, int n) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                return true;
            }
        }
        return false;
    }

}