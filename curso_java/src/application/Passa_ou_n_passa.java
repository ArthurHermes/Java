package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Passa_ou_n_passa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("Student name: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Insert below the three grades");
		System.out.println("Grade 1: ");
		aluno.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		aluno.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		aluno.grade3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(aluno);
		sc.close();
	}

}
