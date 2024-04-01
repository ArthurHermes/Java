package Exercicios;
import java.util.Scanner;

/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
 * Escreva um algoritmo para ler o tipo de combustível abastecido 
 * (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
 * 
 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
 * deve ser solicitado um novo código (até que seja válido).
 * 
 * O programa será encerrado quando o código informado for o número 4.
 * 
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
 * tipo de combustível.
 */



public class ex017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id, alcool = 0, gasolina = 0, diesel = 0;

		while (true) {
			id = sc.nextInt();

			if (id <= 4 && id > 0) {
				switch (id) {
				case 1:
					System.out.println("Insira a quantidade de alcool: ");
					alcool = sc.nextInt();
					break;
				case 2:
					System.out.println("Insira a quantidade de gasolina: ");
					gasolina = sc.nextInt();
					break;
				case 3:
					System.out.println("Insira a quantidade de diesel: ");
					diesel = sc.nextInt();
					break;
				case 4:
					System.out.printf("Muito obrigado! %nAlcool: %d %nGasolina: %d %nDiesel: %d", alcool, gasolina,
							diesel);
					sc.close();
					break;
				}
			} else {
				System.out.println("Favor insira um valor valido!");
			}

		}

	}

}
