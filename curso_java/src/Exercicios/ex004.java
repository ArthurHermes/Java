package Exercicios;
import java.util.Locale;
import java.util.Scanner;



/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 *o valor que recebe por hora e calcula o salário desse funcionário.
 *A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 *
 */

public class ex004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double id, hrsTrab, valorHr, salario;
		
		id = sc.nextDouble();
		hrsTrab = sc.nextDouble();
		valorHr = sc.nextDouble();
		
		salario = hrsTrab * valorHr;
		
		System.out.printf("Numero: %.0f %nSalario: U$ %.2f", id, salario);
		
		
		sc.close();
	}

}
