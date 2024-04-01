package Exercicios;
import java.util.Scanner;

/*
 *Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
 *Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
 *Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
 *e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 * 
 */

public class ex015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha, senhacerta;

		senhacerta = 2002;
				
		System.out.println("Insira a senha a baixo: ");
		
		

		
		while (true) {
			
			senha = sc.nextInt();
			if (senha != senhacerta) {
				System.out.printf("Senha Invalida %nInsira a senha novamente: %n");
			}else {
				System.out.println("Acesso Permitido");
				break;
			}
		}
		sc.close();	
	}

}
