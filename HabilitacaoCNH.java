package FACENS;
import java.util.Scanner;

public class HabilitacaoCNH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//vari�veis
		int psico, legis, dir;

		//Perguntando e recebendo 
		System.out.println("A seguir faremos um teste para saber se voc� pode obter uma habilita��o\n");
		System.out.print("Voc� foi aprovado no exame psicot�cnico? \n (1)- sim\n (2)- n�o\n Resposta:");
		psico = sc.nextInt();

		System.out.print("Voc� foi aprovado no exame de legisla��o? \n (1)- sim\n (2)- n�o\n Resposta:");
		legis = sc.nextInt();

		System.out.print("Voc� foi aprovado no exame de dire��o? \n (1)- sim\n (2)- n�o\n Resposta:");
		dir = sc.nextInt();
		
		//se todas as respostas forem true, ele poder� obter a CNH
		if( psico == 1 && legis == 1 && dir == 1) {
			System.out.print("\nVoc� pode obter uma habilita��o!\n");
		}else{
			//se uma das alternativas ou todas forem false, n�o poder� obter!
			System.out.print("\nVoc� n�o pode obter uma habilita��o!\n");
		}
		System.out.println(); //quebra de linha
		
		sc.close();
		
	}

}