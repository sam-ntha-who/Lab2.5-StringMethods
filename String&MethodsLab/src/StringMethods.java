
public class StringMethods {


	public static String capitalizeWord(String word) {

		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		return word;

	}

	public static int wheresWaldo(String phrase) {

		int index = phrase.indexOf("Waldo");
		return index;

	}

	public static String firstThingsFirst(String a, String b) {
		String first; 
		int alphaBeta = a.compareToIgnoreCase(b);
		if (alphaBeta < 0) {
			first = a + " " + b;
		} else if (alphaBeta > 0) {
			first = b + " " + a;
		} else {
			first = "Your words are the same!";
		}
		return first;
	}

	public static String reverse(String s) {

		StringBuilder sReverse = new StringBuilder();
		sReverse.append(s);
		sReverse.reverse();
		String reverse = sReverse.toString();
		return reverse;
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

	public static String afterMath(String phrase) {
		String mathPhrase;
		if (phrase.contains("math")) {
			int mathIndex = phrase.indexOf("math");
			mathPhrase = phrase.substring(mathIndex);
		
		} else if (phrase.contains("Math")) {
			int mathIndex = phrase.indexOf("Math");
			mathPhrase = phrase.substring(mathIndex);
			
		} else {
			mathPhrase = "dud";
		}
		return mathPhrase;
	}

	public static void letterize(String word) {

		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	
	
}
