package Exercicios;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.



public class ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x;
		
		x = sc.nextInt();

		
		if (x % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
