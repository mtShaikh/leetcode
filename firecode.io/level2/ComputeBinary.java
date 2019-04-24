/*
Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s.

computeBinary(6) ==> "110"
computeBinary(5) ==> "101"

Note: Use the minimum number of binary digits needed for the representation (Truncate unnecessary trailing 0s).
computeBinary(5) ==> "0101" (incorrect)
computeBinary(5) ==> "101" (correct)

*/

public static String computeBinary(int val) {
 if (val == 0) return "0";
        StringBuilder res = new StringBuilder();
        while (val != 0) {
            int i = val%2;
            res.append(i);
            val = val/2;
        }
        return res.reverse().toString();
}

//other solution
public static String computeBinary(int val) {

    if (val == 0) { return "0"; }
    if (val == 1) { return "1"; }

    return computeBinary(val / 2) + computeBinary(val % 2);
}
