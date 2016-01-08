import java.util.Scanner;
public class SalaryCalculation {
    public static void main (String[] args) {

		double hours, wage, tax, salary, amount_of_tax, salary_after_tax;
		Scanner reader = new Scanner(System.in);

		System.out.print("Type in the amount of work hours: ");
		hours = reader.nextFloat();

    System.out.print("Type in the salary per hour: ");
		wage = reader.nextFloat();

    System.out.print("Type in the tax percent: ");
		tax = reader.nextFloat();

    salary = wage * hours;
    amount_of_tax = salary * tax / 100;
    salary_after_tax = salary - amount_of_tax;

		System.out.println("Salary before taxes: " + (hours * wage));
		System.out.println("Amount of tax: " + amount_of_tax);
		System.out.println("Salary after taxes: " + salary_after_tax);
    }
}
