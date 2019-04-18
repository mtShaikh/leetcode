/*
Write a method that returns a number that appears only once in an array.
Assume the array will surely have a unique value. The array will never be empty.
Examples:

{1,2,3,4,1,2,4,3,5} ==> 5
*/

 public static int singleNumber(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int x = 0;
        for (int key : A) {
            map.merge(key, 1, Integer::sum);
        }
        for (int k : A) {
            int v = map.get(k);
            if (v == 1) x = k;
        }
        return x;
    }
