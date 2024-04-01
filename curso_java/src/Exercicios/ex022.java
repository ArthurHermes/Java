package Exercicios;
import java.util.Scanner;


/*
 * Ler um valor N. 
 * Calcular e escrever seu respectivo fatorial.
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 *
 */


public class ex022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial = 1;
		
		n = sc.nextInt();
		
		for(int i = n; i > 0; i--) {
			fatorial *= n;
			n -= 1;
					
		}
		System.out.println(fatorial);
		sc.close();
	}

}
