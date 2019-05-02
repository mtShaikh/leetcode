package main

import (
    "fmt"
    "math"
)


func minimumBribes(q []int32) {
    total := 0
    for i:=0; i < len(q); i++ {
        diff := int(q[i]) - (i+1)
        if diff > 2 {
            fmt.Println("Too chaotic")
            return
        }
       for j := int(math.Max(0, float64(q[i] - 2))); j < i; j++ {

            if (q[j] > q[i]) {
                total++
            }
       }
    }
    fmt.Println(total)
}

func main() {
    s := []int32{1, 2, 5, 3, 7, 8, 6, 4}
    minimumBribes(s)
    // fmt.Println(rotLeft2(s, 4))
}
