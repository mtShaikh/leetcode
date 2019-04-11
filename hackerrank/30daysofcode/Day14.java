// scope written java because go doesnt support classes
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] elems) {
		this.elements = elems;
	}

	void computeDifference() {
		int difference = 0;
		for(int i = 0; i < elements.length; i++) {
			for(int j = i + 1; j < elements.length; j++) {
				difference = Math.abs(elements[i] - elements[j]);
				if (difference > maximumDifference) {
					maximumDifference = difference;
				}
			}
		}
	}
}

public class Day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
