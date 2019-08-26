import java.util.Scanner;

public class Exerc4 {
	
public static void main (String args []){
	Scanner vet = new Scanner (System.in);

     int nums[] = new int[10];  
     for (int i=0; i<10; i++){  
         System.out.printf ("Informe o numero %d:",i);  
         nums[i] = vet.nextInt();  
          
     }  
     
     ordena(nums);
     
     System.out.println("Numeros Ordenados: ");
     for (int numero : nums){
    	 System.out.println(numero);
     }
     
 }  
   
public static void ordena(int nums[]){  
     int cont1, cont2,aux;  
         for(cont1 =0; cont1<10; cont1++){  
             for(cont2 =0; cont2 <9; cont2++){  
                if(nums[cont2]> nums[cont2+1]){  
                     aux = nums[cont2];  
                     nums[cont2] = nums[cont2+1];  
                     nums[cont2+1] = aux;  
                 }  
             }  
         }              
}
}
