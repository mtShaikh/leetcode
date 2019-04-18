/*
Write a method that takes in an input String and returns true if all the characters in the String are unique and false if there is even a single repeated character.
The method should return true if the input is null or empty String.

Examples:
areAllCharactersUnique("abcde") -> true


areAllCharactersUnique("aa") -> false


areAllCharactersUnique("") -> true


areAllCharactersUnique(null) -> true
*/

//old solution
public static boolean areAllCharactersUnique(String str){
        if(str == null) {
            return true;
        }
        if (str.isEmpty()) {
            return true;
        }
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (str.indexOf(arr[i]) != str.lastIndexOf(arr[i])) {
               return false;
            }
        }

        return true;

    }

// better solution
public static boolean areAllCharactersUnique(String str){
    if(str == null) return true;
    HashSet<Character> hs = new HashSet<Character>();
    for(int i = 0; i < str.length(); i++) {
        if(!hs.add(str.charAt(i))) {
            return false;
        }
    }
    return true;
}
