/*
You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.

Example:
Input image :
              1 0
              1 0

Modified to :
              0 1
              0 1
*/

public class FlipIt {

	public static void main(String[] args) {
		int [][] matrix= {{1,0,2},{0,1,2}};
		flipItVerticalAxis(matrix);
		for(int i=0;i<matrix.length;i++){
 			for(int j=0;j<matrix[0].length;j++){
   				System.out.print(matrix[i][j]+" ");
 			}
			System.out.println();
		}
	}

	public static void flipItVerticalAxis(int[][] matrix) {
	    for(int i = 0; i < matrix.length; i++) {
	        int len = matrix[i].length - 1;
	        for(int j = 0; j <= len/2; j++) {
	        	int d = len - j;
	            int tmp = matrix[i][j];
	            matrix[i][j] = matrix[i][d];
	            matrix[i][d] = tmp;
	        }
	    }
	}

}
