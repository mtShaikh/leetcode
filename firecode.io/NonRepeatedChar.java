/*
Find the first non-duplicate character in a string. Return null if no unique character is found.

firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
firstNonRepeatedCharacter( "cbcd" ) --> 'b'
firstNonRepeatedCharacter( "cdcd" ) --> null
*/
 public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            map.merge(str.charAt(i), 1, Integer::sum);
        }
        for(int i = 0; i < str.length(); i++) {
            int v = map.get(str.charAt(i));
            if (v == 1) return str.charAt(i);
        }
        return null;

    }


// better solution because map is unreliable
public static Character firstNonRepeatedCharacter(String str) {

    int[] chars = new int[256];

    for (char c : str.toCharArray()){
        chars[c] = ++chars[c];
    }


    for (char c : str.toCharArray()){
        if (chars[c] == 1) {
            return c;
        }
    }

    return null;

}
