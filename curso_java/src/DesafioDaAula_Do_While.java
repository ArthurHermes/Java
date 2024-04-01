import java.util.Scanner;

public class DesafioDaAula_Do_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		char escolha;
		
		Double temp, Form;
		

		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temp = sc.nextDouble();
			
			Form = ((temp * 9) / 5) + 32;
			
			System.out.println("Equivalente em Fahrenheit, " + Form);
			
			System.out.print("Deseja repetir (s/n)? ");
			escolha = sc.next().charAt(0);
			
		}while(escolha == 's');
		
		
		
		sc.close();
	}

}
