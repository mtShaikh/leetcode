package main

import (
    "fmt"
)

func minimumSwaps(arr []int32) int32 {
    var c int32 = 0
    for i := 0; i < len(arr); i++ {
    	for ;arr[i] != int32(i+1); {
    		arr[arr[i]-1], arr[i] = arr[i], arr[arr[i]-1]
    		c++
    	}
    }
    return c
}

func main() {
	s := []int32{4, 3, 1, 2}
	fmt.Println(minimumSwaps(s))
	// fmt.Println(rotLeft2(s, 4))
}
