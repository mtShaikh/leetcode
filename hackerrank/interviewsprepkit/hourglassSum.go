func hourglassSum(arr [][]int32) int32 {
     sum := int32(0)
        maxSum := int32(-1000000)
        for i := 0; i < 6; i++ {
            for j := 0; j < 6; j++ {
                if (i + 1) < 6 && (i + 2) < 6 {
                    if (j + 1) < 6 && (j + 2) < 6 {
                        sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
                    }
                }
                if sum > maxSum {
                    maxSum = sum
                }
            }
        }
    return maxSum;
}
