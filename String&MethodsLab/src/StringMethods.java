
public class StringMethods {


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
