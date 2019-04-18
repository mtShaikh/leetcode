/*
Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.


findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
*/

public static int findMissingNumber(int[] arr) {
    int sum = Arrays.stream(arr).sum();
    int actualSum = 55;
    int diff = actualSum - sum;
    return diff;
}
