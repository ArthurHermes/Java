package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;


public class Area_Retangulo {

	public static void main(String[] args) {
		
		//Change location to use dot, open the scanner to receive enters
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle Widht and Height: ");
		 
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retangulo.Area());
		
		System.out.printf("PERIMETER: %.2f%n", retangulo.Perimeter());
		
		System.out.printf("DIAGONAL: %.2f%n", retangulo.Diagonal());
		
		
		
		
		
		
		sc.close();
	}

}
