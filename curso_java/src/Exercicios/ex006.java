package Exercicios;

import java.util.Locale;
import java.util.Scanner;


/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
 * A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura. OK
 * b) a área do círculo de raio C. (pi = 3.14159) OK
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 *
 */

public class ex006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, pi,  areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Insira a baixo os valores de A, B, C: ");
		
		A = sc.nextDouble();
		
		B = sc.nextDouble();
		
		C = sc.nextDouble();
		
		pi = 3.14159;

		areaTriangulo = (A * C) / 2;
		
		areaCirculo = pi * Math.pow(C, 2);
		
		areaTrapezio = ((A + B) * C) / 2;
		
		areaQuadrado = Math.pow(B, 2);
		
		areaRetangulo = A * B;
		
		System.out.printf("Triangulo: %.3f %nCirculo: %.3f"
				+ "%nTrapezio: %.3f %nQuadrado:%.3f"
				+ "%nRetangulo: %.3f",
				areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

		sc.close();
	}

}
