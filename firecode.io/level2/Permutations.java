/*
Implement a method that checks if two strings are permutations of each other.


permutation("CAT","ACT") --> true

permutation("hello","aloha") --> false
*/

public static boolean permutation(String str1, String str2) {
 HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str1.length(); i++) {
        char c = str1.charAt(i);
        if (map.get(c) != null) {
            map.put(c, map.get(c) + 1);
        } else  map.put(c, 1);
    }

    for (int i = 0; i < str2.length(); i++) {
        char c = str2.charAt(i);
        if (map.get(c) != null) {
            map.put(c, map.get(c) - 1);
        }  else map.put(c, 1);
    }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() != 0) return false;
    }

    return true;



}
