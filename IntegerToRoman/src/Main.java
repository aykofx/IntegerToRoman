import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays representing values and their corresponding Roman numerals
		int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to convert: ");
		int userInput = scanner.nextInt(); // Read integer input from user
		
		StringBuilder sb = new StringBuilder(); // To build the Roman numeral string
		
		// Convert integer to Roman numeral
		for (int i = 0; i < numbers.length; i++) {
			while (userInput >= numbers[i]) {
				userInput = userInput - numbers[i];
				sb.append(roman[i]);
			}
		}
		
		scanner.close();
		String output = sb.toString();
		System.out.println(output); // Output the Roman numeral
	}

}
