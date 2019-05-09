package main

import (
"fmt"
)

func freqQuery(queries [][]int32) []int32 {
	var m map[int32] int32
	m = make(map[int32] int32)
	var m2 map[int32] int32
	m2 = make(map[int32] int32)
	var res []int32
	for i := 0; i < len(queries); i++ {
		// fmt.Println(m, m2, res, queries[i][0], queries[i][1])
		switch queries[i][0] {
			case 1:
				m2[m[queries[i][1]]] -= 1
				m[queries[i][1]] += 1
				m2[m[queries[i][1]]] += 1
		 	case 2:
	 			if m[queries[i][1]] <= 1 {
	 				m2[m[queries[i][1]]] -= 1
	 				delete(m, queries[i][1])
	 			} else {
	 				m2[m[queries[i][1]]] -= 1
					m[queries[i][1]] -= 1
					m2[m[queries[i][1]]] += 1
	 			}
		 	case 3:
		 		if m2[queries[i][1]] > 0 {
		 			res = append(res, 1)
		 		} else {
		 			res = append(res, 0)
		 		}
		}
	}
	return res
}

func main() {
	a := [][]int32{
		{1, 3},
		{2, 3},
		{3, 2},
		{1, 4},
		{1, 5},
		{1, 5},
		{1, 4},
		{3, 2},
		{2, 4},
		{3, 2},
	}
	fmt.Println(freqQuery(a))
}
