package main

import (
    "fmt"
)


func rotLeft(a []int32, d int32) []int32 {

    for ;d > 0; d-- {
        s := a[1:len(a)]
        s = append(s,a[0])
        a = s

    }
    return a
}


func rotLeft2(a []int32, d int32) []int32 {
	var arr []int32
	arr = make([]int32, len(a))
    for i:= 0;i < len(a); i++ {
        arr[(i - int(d) + len(a))%len(a)] = a[i]
    }
    return arr
}



func main() {
	s := []int32{1, 2, 3, 4, 5}
	fmt.Println(rotLeft(s, 4))
	fmt.Println(rotLeft2(s, 4))
}
