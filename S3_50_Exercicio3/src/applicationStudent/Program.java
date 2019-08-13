package applicationStudent;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Insert student's name, grade 1, grade 2 and grade 3: ");
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE= %.2f\n", student.FinalGrade());
	;
		if (student.FinalGrade()<=60) {
			System.out.println("FAIL");
			System.out.println("MISSING: " + student.missing());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
