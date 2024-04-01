package Exercicios;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número N.
 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 * 
 * 
 */


public class ex021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Insira abaixo a quantidade de divisões que deseja realizar:");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double num1, num2;
		
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			
				if(num2 != 0) {
				double result = num1 / num2;
				System.out.println(result);
				}else{
				System.out.println("Divisão impossivel");
				}
		
		}
		sc.close();
	}
}