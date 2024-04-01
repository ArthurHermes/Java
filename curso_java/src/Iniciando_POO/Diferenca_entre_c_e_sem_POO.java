package Iniciando_POO;

import java.util.Scanner;

public class Diferenca_entre_c_e_sem_POO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do tringulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		
		System.out.println("Insira as medidas do tringulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		

		double areaY = y.area();

		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		
		System.out.printf("Area do triangulo y: %.4f%n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("Area do tringulo X é maior");
		}else {
			System.out.println("Area do trinagulo Y é maior");
		}
		
		
		sc.close();
	}

}
