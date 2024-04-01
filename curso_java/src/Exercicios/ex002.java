package Exercicios;
import java.util.Locale;
import java.util.Scanner;



/*Faça um programa para ler o valor do raio de um círculo,
 *e depois mostrar o valor da área deste círculo com quatro
 *casas decimais conforme exemplos.
 *
 *Fórmula da área: area = π . raio2
 *
 *Considere o valor de π = 3.14159
 *
 */



public class ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		double raio, area, pi;
		
		pi = 3.14159;
		
		
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A  area total deste circulo é igual a %.4f", area);
		
		sc.close();

	}

}
