package Exercicios;
import java.util.Scanner;

/*
 * 
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 *começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 *
 */


public class ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int hrInicial, hrFinal, duracao;
		
		System.out.println("Hora inicial: ");
		hrInicial = sc.nextInt();
		
		System.out.println("Hora final: ");
		hrFinal = sc.nextInt();
		
		if (hrFinal > hrInicial) {
			duracao = hrFinal - hrInicial;
		}else {
			duracao = 24 - hrInicial + hrFinal;
		}
		
		System.out.printf("O jogo durou %d Hora(s)", duracao);
		sc.close();
	}

}
