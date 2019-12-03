 import javax.swing.JOptionPane;
 
 public class prova_quatro 
 {
 	public static void main (String[]args)
 	{
 		String nome, n1, n2, nsub;
 		double nota1, nota2, sub, media;
 		
 		
 		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
 
 
 		 		
 		n1 = JOptionPane.showInputDialog("Digite a primeira nota");
 		
 		nota1 = Double.parseDouble(n1);
 		
 		n2 = JOptionPane.showInputDialog("Digite a segunda nota");
 		nota2 = Double.parseDouble(n2);
 		
 		media = (nota1+nota2)/2;
 		
 		if (media>=6)
 		{
 			JOptionPane.showMessageDialog(null,"Aluno " +nome+"\n"+"A média do aluno é "+media,
						"Aluno Aprovado",JOptionPane.INFORMATION_MESSAGE);
 		}
 		else  
 			{
 				JOptionPane.showMessageDialog(null,"Aluno" +nome+"\n"+"A media do aluno é "+nsub,
						"Reprovado", JOptionPane.WARNING_MESSAGE);
 			}
 		} 	
 		
 	}
 }