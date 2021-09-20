import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Name: ");
		emp.name = sc.nextLine();

		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();

		System.out.print("Name: ");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.print("Wich percantage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.incraseSalary(percentage);

		System.out.println("Update data: " + emp);

		sc.close();
	}

}
