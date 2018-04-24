import java.util.Scanner;

public class Marvel {

	public static void main(String[] args) {

		// Enter Scanner
		Scanner input = new Scanner(System.in);

		// Getting User input in Length
		System.out.print("Please Enter Length:");
		double length = input.nextDouble();

		// Getting User input in Width
		System.out.print("Please Enter Width:");
		double width = input.nextDouble();

		// The formulas for getting A & P
		double area = length * width;
		double perimeter = length * 2 + width * 2;

		// The A & P of the room based off of the users input
		System.out.println(area + " Area");
		System.out.println(perimeter + " Perimeter");

		// Asking user if they would like to continue
		System.out.println("Continue? y/n:");

	}

}
