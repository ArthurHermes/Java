package Exercicios;
import java.util.Scanner;



//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.



public class ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x;
		System.out.println("Insira o valor a baixo:");
		x = sc.nextInt();
		
		
		if (x > 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
