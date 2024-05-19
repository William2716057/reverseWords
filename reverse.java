import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
	//Scanner object to read input from user
	Scanner scanner = new Scanner(System.in);

	//input
	System.out.println("Enter text: ");
	String input = scanner.nextLine();

	//split text into words
	String[] words = input.split("\\s+");

	//Create stringBuilder to store result
	StringBuilder reversedText = new StringBuilder();

	//process each word
	for (String word : words) {

	//Reverse current word
		String reversedWord = new StringBuilder(word).reverse().toString();
		reversedText.append(reversedWord).append(" ");
}

	//Convert StringBuilder to string and trim trailing spaces
	String result = reversedText.toString().trim();

	//Print restult
	System.out.println("result: " + result);

	//Close scanner
	scanner.close();
	}
}
