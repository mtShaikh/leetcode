/*
You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.

Example:

Input image :
              1 1
              0 0
Modified to :
              0 0
              1 1
*/

public static void flipHorizontalAxis(int[][] matrix) {
    int len = matrix.length - 1;
    for(int i = 0; i < matrix.length/2; i++) {
	        for(int j = 0; j < matrix[i].length; j++) {
	        	int d = len - i;
	            int tmp = matrix[i][j];
	            matrix[i][j] = matrix[d][j];
	            matrix[d][j] = tmp;
	        }
	    }
}
