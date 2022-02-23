//Calculates the square, sum of squares and difference btw squares of two integers
import java.util.Scanner;
public class DifferenceOfSquares{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first integer: ");
	int int1 = input.nextInt();

	System.out.println("Enter the second integer: ");
	int int2 = input.nextInt();

	int square1 = int1 * int1;

	int square2 = int2 * int2;

	System.out.printf("The square of %d is %d%n", int1, square1);
	System.out.printf("The square of %d is %d%n", int2, square2);

	int sum12 = square1 + square2;

	System.out.printf("The sum of their squares is %d%n", sum12);

	int diff = square1 - square2;

	System.out.printf("The difference of their squares is %d%n", diff);
}
}

	
	