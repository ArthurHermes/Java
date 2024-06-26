package Exercicios;
import java.util.Scanner;


/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
 * mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 * */
public class ex019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n ,x, in = 0, out = 0;

		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			x = sc.nextInt();
			
			if (x >= 10 && x < 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.printf("%d in %n%d out", in, out);
		
		sc.close();
	}

}
