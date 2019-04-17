/*
Write a method to replace all spaces in a string with a given replacement string.

replace("This is a test","/") --> "This/is/a/test"
*/

public static String replace(String a, String b) {
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < a.length(); i++) {
		if (a.charAt(i) == ' ') {
			sb.append(b);
		} else {
			sb.append(a.charAt(i));
		}
	}
	return sb.toString();
}
