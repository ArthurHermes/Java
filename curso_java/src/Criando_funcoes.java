import java.util.Scanner;

public class Criando_funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Insira tres numeros: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		
		if(a > b && a > c) {
			aux = a;
		}
		else if( b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}
	
	public static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}
}
