import java.util.*;

public class Main {

    public static void main(String[] args) {
        String [] m = {"two", "times", "three", "is", "not", "four"};
        String [] n = {"two", "times", "two", "is", "four"};
        System.out.println(checkMagazine(m,n));
    }

    static String checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < magazine.length; i++) {
            map.merge(magazine[i], 1, Integer::sum);
        }
        for (int i = 0; i < note.length; i++) {
           if(!map.containsKey(note[i])) return "No";
           else {
               int counter = map.get(note[i]) - 1;
               if(counter == 0){
                   map.remove(note[i]);
               }else{
                   map.put(note[i], counter);
               }
           }
        }
        return "Yes";
    }
