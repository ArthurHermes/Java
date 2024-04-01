/*
 *Fazer um programa para ler o código de uma peça 1,
 *o número de peças 1, o valor unitário de cada peça 1,
 *o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 *Calcule e mostre o valor a ser pago.
 * 
 */
package Exercicios;






import java.util.Scanner;
import java.util.Locale;

public class ex005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int codpeca1, codpeca2;
		
		double quant1, valorUnit1, quant2, valorUnit2, valorTotalPeca1, valorTotalPeca2, valorFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o codigo da primeira peça: ");
		codpeca1 = sc.nextInt();
		
		System.out.println("Insira a quantidade de peças 1: ");
		quant1 = sc.nextDouble();
		
		System.out.println("Insira o  valor unitario: ");
		valorUnit1 = sc.nextDouble();
		
		System.out.println("Insira o codigo da segunda peça: ");
		codpeca2 = sc.nextInt();
		
		System.out.println("Insira a quantidade de peças 2: ");
		quant2 = sc.nextDouble();
		
		System.out.println("Insira o  valor unitario: ");
		valorUnit2 = sc.nextDouble();
		
		
		valorTotalPeca1 = quant1 * valorUnit1;
		valorTotalPeca2 = quant2 * valorUnit2;
		valorFinal = valorTotalPeca1 + valorTotalPeca2;

		
		System.out.printf("Valor a pagar: R$ %.2f%nSendo: %nR$ %.2f da 1° peça com o codigo %d %nR$ %.2f da 2° peça com o codigo %d", valorFinal, valorTotalPeca1, codpeca1, valorTotalPeca2, codpeca2);
		
		sc.close();
	}

}
