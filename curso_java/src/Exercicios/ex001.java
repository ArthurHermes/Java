package Exercicios;
import java.util.Scanner;



/*Faça um programa para ler dois valores inteiros,
 *e depois mostrar na tela a soma desses números 
 *com uma mensagem explicativa, conforme exemplos.
*/

public class ex001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x, y, soma;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		soma = x + y;
		
		System.out.printf("A soma de %.0f + %.0f = %.0f", x, y, soma);
		
		sc.close();
	}

}
