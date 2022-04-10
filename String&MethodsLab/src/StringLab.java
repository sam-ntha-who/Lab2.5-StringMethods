import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// capitalize the word
		System.out.println("Please enter a word (first letter lowercase please):");
		String word = scnr.nextLine();
		StringMethods.capitalizeWord(word);

		// where's Waldo
		System.out.println("Enter a phrase that includes 'Waldo' please:");
		String phrase = scnr.nextLine();
		StringMethods.wheresWaldo(phrase);

		// alphabetical order
		System.out.println("Enter a word:");
		String firstWord = scnr.nextLine();
		System.out.println("Enter another word:");
		String secondWord = scnr.nextLine();
		StringMethods.firstThingsFirst(firstWord, secondWord);

		// backwards words
		System.out.println("Enter a word you would like to see backwards:");
		String regularDegular = scnr.nextLine();
		StringMethods.reverse(regularDegular);

		// which word is longer?
		System.out.println("Enter a word:");
		String thisWord = scnr.nextLine();
		System.out.println("Enter another word:");
		String thatWord = scnr.nextLine();
		StringMethods.soLong(thisWord, thatWord);

		// after math
		System.out.println("Give us a phrase that includes 'math':");
		String mathPhrase = scnr.nextLine();
		StringMethods.afterMath(mathPhrase);

		// letterize the word in an array
		System.out.println("Enter a word:");
		String letterGetter = scnr.nextLine();
		StringMethods.letterize(letterGetter);

			
		scnr.close();
	}

	
}
