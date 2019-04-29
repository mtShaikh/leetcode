/*
Given an array of integers, write a method - maxGain -
that returns the maximum gain. Maximum Gain is
defined as the maximum difference between 2 elements in a list
such that the larger element appears after
the smaller element. If no gain is possible, return 0.
*/

public static int maxGain(int[] a) {
	int max = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			int diff = a[j] - a[i];
			if (max < diff) {
				max = diff
			}
		}
	}
	return max;
}

//better
public static int maxGain(int[] a) {
    int min = a[0];
    int gain = 0;
    for (int i = 0; i < a.length; i++) {
        if (min > a[i]) min = a[i];
        if (a[i] - min > gain) gain = a[i] - min;
    }
    return gain;
}
