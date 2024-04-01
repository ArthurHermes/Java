package application;

import entities.Empregados;
import java.util.Scanner;
import java.util.Locale;


public class Salario_empregados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregados empregado = new Empregados();
		
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		
		empregado.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + empregado.name + ", $ " + empregado.NetSalary());
		
		System.out.print("Wich porcentage to increase salary? ");
		
		
		double porcentage = sc.nextDouble();
		
		empregado.IncreaseSalary(porcentage);
		
		System.out.println("Updated data: " + empregado);
		
		sc.close();
	}

}
