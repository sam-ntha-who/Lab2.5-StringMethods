import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// capitalize the word
		System.out.println("Please enter a word (first letter lowercase please):");
		String word = scnr.nextLine();
		capitalizeWord(word);

		// where's Waldo
		System.out.println("Enter a phrase that includes 'Waldo' please:");
		String phrase = scnr.nextLine();
		wheresWaldo(phrase);

		// alphabetical order
		System.out.println("Enter a word:");
		String firstWord = scnr.nextLine();
		System.out.println("Enter another word:");
		String secondWord = scnr.nextLine();
		firstThingsFirst(firstWord, secondWord);

		// backwords words
		System.out.println("Enter a word you would like to see backwards:");
		String regularDegular = scnr.nextLine();
		reverse(regularDegular);

		// which word is longer?
		System.out.println("Enter a word:");
		String thisWord = scnr.nextLine();
		System.out.println("Enter another word:");
		String thatWord = scnr.nextLine();
		soLong(thisWord, thatWord);

		// after math
		System.out.println("Give us a phrase that includes 'math':");
		String mathPhrase = scnr.nextLine();
		afterMath(mathPhrase);

		// letterize the word in an array
		System.out.println("Enter a word:");
		String letterGetter = scnr.nextLine();
		letterize(letterGetter);

		scnr.close();
	}

	public static void capitalizeWord(String word) {

		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println(word);

	}

	public static void wheresWaldo(String phrase) {

		int index = phrase.indexOf("Waldo");
		System.out.println("Waldo appears at character number " + index);

	}

	public static void firstThingsFirst(String a, String b) {

		int alphaBeta = a.compareToIgnoreCase(b);
		if (alphaBeta < 0) {
			System.out.println(a + " " + b);
		} else if (alphaBeta > 0) {
			System.out.println(b + " " + a);
		} else {
			System.out.println("Your words are the same!");
		}

	}

	public static void reverse(String s) {

		StringBuilder sReverse = new StringBuilder();
		sReverse.append(s);
		sReverse.reverse();
		System.out.println(sReverse);
	}

	public static void soLong(String a, String b) {

		int s1 = a.length();
		int s2 = b.length();
		if (s1 > s2) {
			System.out.println("The word " + a + " is longer.");
		} else if (s2 > s1) {
			System.out.println("The word " + b + " is longer.");
		} else {
			System.out.println("The words " + a + " & " + b + " are the same length.");
		}
	}

	public static void afterMath(String phrase) {

		if (phrase.contains("math")) {
			int mathIndex = phrase.indexOf("math");
			String mathPhrase = phrase.substring(mathIndex);
			System.out.println(mathPhrase);
		} else if (phrase.contains("Math")) {
			int mathIndex = phrase.indexOf("Math");
			String mathPhrase = phrase.substring(mathIndex);
			System.out.println(mathPhrase);
		} else {
			System.out.println("dud");
		}
	}

	public static void letterize(String word) {

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

}
