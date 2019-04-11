// review
package main
import "fmt"

func main() {

	var T int

    fmt.Scan(&T)

    for i := 0; i < T; i++ {
    	var in, odd, even string
    	fmt.Scan(&in)
    	for j := 0; j < len([]rune(in)); j++ {
    		if j%2 == 0 {
    			even += string(in[j])
    		} else {
    			odd += string(in[j])
    		}
    	}
    	fmt.Printf("%s %s\n",even, odd)
    }

}

