package Exercicios;
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 *A seguir, calcule e mostre o valor da conta a pagar.
 */



public class ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		double quant, valorTotal = 0;
		
		
		id = sc.nextInt();
		quant = sc.nextDouble();
		
		switch (id) {
		case 1:
			valorTotal = quant  * 4.00;
			break;
		case 2:
			valorTotal = quant  * 4.50;
			break;
		case 3:
			valorTotal = quant  * 5.00;
			break;
		case 4:
			valorTotal = quant  * 2.00;
			break;
		case 5:
			valorTotal = quant  * 1.50;
			break;
		}
		
			
		
		System.out.printf("Total: R$ %.2f", valorTotal);
		
		
		
		
		
		
		sc.close();
	}

}
