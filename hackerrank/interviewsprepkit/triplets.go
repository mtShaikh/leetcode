package main

import (
"fmt"
)

// Complete the countTriplets function below.
func countTriplets(arr []int64, r int64) int64 {
	var c int64 = 0
	var m1 map[int64] int64
	m1 = make(map[int64] int64)
	var m2 map[int64] int64
	m2= make(map[int64] int64)
	for _, v := range arr {
		c += m2[v]
		m2[v*r] += m1[v]
		m1[v*r] += 1
		fmt.Println(m1,m2)
	}
	return c
}

func main() {
	a := []int64{1, 2, 2, 4}
	fmt.Println(countTriplets(a, int64(2)))
}
