public class MergeSort {

    private static void merge(int A[], int l, int m, int r) {
        int nL = m - l + 1;
        int nR = r - m;
        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; ++i)
            L[i] = A[l + i];

        for (int j = 0; j < nR; ++j)
            R[j] = A[m + 1 + j];

        int i = 0;
        int j = 0;
        int k = l;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            A[k] = L[i];
            k++;
            i++;
        }
        while (j < nR) {
            A[k] = R[j];
            k++;
            j++;
        }

    }

    private static void mergeSort(int A[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(A, l, m);
            mergeSort(A, m + 1, r);
            merge(A, l, m, r);
        }
    }

    private static void printArray(int A[]){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 10, 3, 4, 1, 9, 6, 7, 8};
        printArray(A);
        mergeSort(A, 0, A.length - 1);
        System.out.println("after sort: ");
        printArray(A);
    }
}
