
/**
 * File full of simple fun text manipulation functions
 * 
 * @author Ian Shull
 *
 */
public class TextFunctions {

	/**
	 * This methods returns the reverse of the String passed to it
	 * 
	 * @param s string to be reversed
	 * @return reversed string
	 */
	public static String reverseString(String s) {
		String input = s; // original String
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			// create a new by traversing input backwards and create a new String with the
			// reverse of input
			reverse += input.charAt(i);
		}
		return reverse;
	}

	/**
	 * This method checks if the given String only contains alphabetical characters.
	 * 
	 * @param s
	 * @return true if the string only contains letters, false otherwise
	 */
	public static boolean isAlpha(String s) {
		if (s == null || s == "") {
			//if s is null or an empty string return false
			return false;
		} else {
			//traverse the String, checking if each charater is alphabeticalS
			for (int i = 0; i < s.length() - 1; i++) {
				//if i has an ASCII code that isn't aplhabetical return false
				if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z') {
					return false;
				}
			}
			//if the whole String has been traversed, return true because all characters were alphabetical
			return true;
		}
	}

	/**
	 *This method returns the pig latin version of a string. It moves the character at position 0
	 *to the end of the String and then adds "ay" to the end, giving us pig latin.
	 * 
	 * @param s string to be turned into pig latin
	 * @return the pig latin version of the original String
	 */
	public static String wordToPigLatin(String s) {
		//if the given string contains non-alphabetical characters, throw exception
		if(! isAlpha(s)) {
			throw new IllegalArgumentException("Can only convert words");
		}else {
			//returns the pig latin version of the string
			return s.substring(1)+ s.charAt(0)+"ay";
		}
		
	}

	
}