package Exercicios;
import java.util.Scanner;

/*
 * Escreva um programa para ler as coordenadas (X,Y) 
 * de uma quantidade indeterminada de pontos no sistema cartesiano.
 * Para cada ponto escrever o quadrante a que ele pertence.
 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas
 * for NULA (nesta situação sem escrever mensagem alguma).
 *
 */


public class ex016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		while (true) {

			x = sc.nextInt();
			y = sc.nextInt();

			if (x == 0 || y == 0) {
				break;
			} else {
				if (x > 0 && y > 0) {
					System.out.println("Ponto Pertence ao quadrante 1");
				} else if (x < 0 && y > 0) {
					System.out.println("Ponto Pertence ao quadrante 2");
				} else if (x < 0 && y < 0) {
					System.out.println("Ponto Pertence ao quadrante 3");
				} else {
					System.out.println("Ponto Pertence ao quadrante 4");
				}
			}
		}

		sc.close();
	}

}
