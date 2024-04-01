// Concluido sem ajuda


import java.util.Locale;

public class desafioDaAula {
	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Computador de mesa";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, o qual o preço é $ %.2f %n", produto1, preco1);
		System.out.printf("%s, o qual o preco é $ %.2f %n", produto2, preco2);
		
		System.out.printf("%n");
		
		System.out.printf("Registro: %d anos de idade, codigo - %d e genero: %s %n", idade, codigo, genero);
		
		System.out.println("");
		
		System.out.printf("Medida com 8 casas decimais: %.8f %n", measure);
		System.out.printf("Arredondado(Tres casas decimais): %.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Numero com pontuação Norte Americana %.3f %n", measure);
		
	}
}
