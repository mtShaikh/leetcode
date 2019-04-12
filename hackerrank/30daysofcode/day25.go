//running time and complexity
package main
import (
"fmt"
"math"
)

func main() {
	var T int

	fmt.Scan(&T)

	for i := 0; i < T; i++ {
		var in int
		fmt.Scan(&in)
		isPrime := isPrime(in)
		if(isPrime) {
			fmt.Println("Prime")
		} else {
			fmt.Println("Not prime")
		}

	}
}

func isPrime(in int) bool {
	if in == 2 {
		return true
	} else if in == 1 || (in & 1) == 0	{
		return false
	}

	var sr int = int(math.Sqrt(float64(in)));
	for j := 2; j <= sr; j++ {
		if in % j == 0 {
			return false
			break
		}
	}
	return true
}
