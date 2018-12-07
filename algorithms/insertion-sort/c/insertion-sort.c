#include <stdio.h>
#include <stdlib.h>

void insertionSort(int A[], int n){

	for(int i = 0; i < n; i++){
		int temp = A[ i ];
		int j = i;
		while(  j > 0  && temp > A[ j -1]) {
			A[ j ] = A[ j-1];
			j= j - 1;
		}
		A[j] = temp;
	}
}

int main() {
	int A[] = {2, 5, 10, 3, 4, 1, 9, 6, 7, 8};
	int n = sizeof(A)/sizeof(A[0]);
	insertionSort(A, n);
	for(int i = 0; i < n; i++){
		printf("%d",A[i]);
	}
}
