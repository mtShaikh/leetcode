package main

import (
"fmt"
)

// Complete the sherlockAndAnagrams function below.
func sherlockAndAnagrams(s string) int32 {
	runes := []rune(s)
	var c int32 = 0
	for end := 1; end < len(runes); end++ {
		for start := 0; start <= len(runes) - end; start++ {
			substring := string(runes[start:start+end])
			for j := start + 1; j < len(runes) - end + 1; j++ {
				substring2 := string(runes[j:j+end])
				if (checkAna(substring, substring2, len(substring))) {
					c++
				}
			}
		}
	}
	return c

}

func checkAna(s1 string, s2 string, n int) bool {
	var f [26]int
	var s [26]int
	for _,c := range s1 {
		f[c - 'a']++
	}

	for _,c := range s2 {
		s[c - 'a']++
	}

	for i:=0; i < 26; i++ {
		if(f[i] != s[i]) {
			return false
		}
	}

	return true
}

func main() {
	fmt.Println(sherlockAndAnagrams("cdcd"))
}
