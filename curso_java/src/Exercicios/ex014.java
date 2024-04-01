package Exercicios;
import java.util.Scanner;
/*
 * Em um país imaginário denominado Lisarb,
 *todos os habitantes ficam felizes em pagar seus impostos, pois sabem
 *que nele não existem políticos corruptos e os recursos arrecadados são
 *utilizados em benefício da população, sem qualquer desvio.
 *A moeda deste país é o Rombus, cujo símbolo é o R$.
 *Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
 *Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
 *segundo a tabela abaixo.
 */



public class ex014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double IR = 0;
		
		
		salario = sc.nextDouble();
		
		
		if (salario > 2000 && salario <= 3000){
			IR = (salario - 2000)* 0.08;
		}else if (salario > 3000 && salario <= 4500) {
			IR = (salario - 3000) * 0.18 + 1000 * 0.08; 
		}else {
			IR = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f", IR);
		}
		
		
		
		sc.close();
	}

}
