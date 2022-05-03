package FACENS;
import java.util.Scanner;

public class HabilitacaoCNH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//variáveis
		int psico, legis, dir;

		//Perguntando e recebendo 
		System.out.println("A seguir faremos um teste para saber se você pode obter uma habilitação\n");
		System.out.print("Você foi aprovado no exame psicotécnico? \n (1)- sim\n (2)- não\n Resposta:");
		psico = sc.nextInt();

		System.out.print("Você foi aprovado no exame de legislação? \n (1)- sim\n (2)- não\n Resposta:");
		legis = sc.nextInt();

		System.out.print("Você foi aprovado no exame de direção? \n (1)- sim\n (2)- não\n Resposta:");
		dir = sc.nextInt();
		
		//se todas as respostas forem true, ele poderá obter a CNH
		if( psico == 1 && legis == 1 && dir == 1) {
			System.out.print("\nVocê pode obter uma habilitação!\n");
		}else{
			//se uma das alternativas ou todas forem false, não poderá obter!
			System.out.print("\nVocê não pode obter uma habilitação!\n");
		}
		System.out.println(); //quebra de linha
		
		sc.close();
		
	}

}