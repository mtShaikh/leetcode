/*
Write a method duplicate to find the repeated or duplicate elements in an array.
This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).


duplicate({1,3,4,2,1}) --> "[1]"

duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
*/

 public static String duplicate(int[] numbers){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicates  = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!set.add(numbers[i])) {
                duplicates.add(numbers[i]);
            }
        }

        Collections.sort(duplicates);


        return duplicates.toString();
    }
