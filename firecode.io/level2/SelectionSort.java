/*


Selection sort offers improved performance over bubble sort,
especially for arrays with a large number of elements.
 Where bubble sort accumulated the largest elements towards the end of the array,
 selection sort accumulates the smallest elements at the beginning of the array.

Write a method that uses the selection sort algorithm to sort an input array of integers.

Examples:

selectionSortArray({1,5,2}) -> {1,2,5}

selectionSortArray({11}) -> {11}

selectionSortArray({}) -> {}
    {} -> [Empty] Array

*/

public static int[] selectionSortArray(int[] arr){

    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }



    return arr;
}
