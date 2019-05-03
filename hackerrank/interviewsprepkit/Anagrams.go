package main

import (
"fmt"
"strings"
)

// Complete the sherlockAndAnagrams function below.
func sherlockAndAnagrams(s string) {
	runes := []rune(s)
	// var m map[int] []string
	c := 0
	// m = make(map[int] []string)
	for length := 1; length < len(runes); length++ {
		for start := 0; start <= len(runes) - length; start++ {
			substring := string(runes[start:start+length])
			if strings.Index(s, substring) != strings.LastIndex(s, substring) {
				c++
			}
           /* if x, ok := m[len(substring)]; !ok {
            	a := make([]string, 1)
            	a = append(a, substring)
            	m[len(substring)] = a
            } else {
        		x = append(x, substring)
        		m[len(substring)] = x
   			}*/
		}
	}

	fmt.Println(c)

}

func main() {
	sherlockAndAnagrams("ifailuhkqq")
}
