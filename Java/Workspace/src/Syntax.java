import java.util.ArrayList;
import java.util.List;

public class Syntax {
	public static void main(String[] args) {
		
		// String
		var str = "test";
		int len = str.length();
		char c = str.charAt(0);
		var substr = str.substring(1, 3);	// ending excluded
		var substr2 = str.substring(4);
		String[] tokens = str.split(",");
		int index1 = str.indexOf('t');
		int index2 = str.indexOf("es");
		int index3 = str.lastIndexOf("c");
		char [] chars = str.toCharArray();
		
		String newStr = str.replace("t", "abc");  // replaces all substrings		
		String newStr2 = str.replaceFirst("t", "abc"); // replace only first substring
		
		
		
		
		
		
	}
}
