package HW10.StringsTask2;

//Enter a sentence that contains the words between more than one space.
//Convert all spaces, consecutive, one.
//For example, if we introduce the sentence
//"I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

public class MainSpaces {
	public static void main(String[] args) {
		System.out.println("I        am     learning    Java  Core");
		String str = "I        am         learning  Java  Core";
		while (str.contains("  ")) {
			str = str.replace("  ", " ");
		}
		System.out.println("Phrase without spaces: "+ str);
		System.out.println("");
//		String strFormat = str.replaceAll("  ", " ");
		System.out.println(str + "  ---only one space not two");
		String shortStr = str.replaceAll(" am", "'m");
		System.out.println(shortStr + " ---new format I'm ");

	}
}