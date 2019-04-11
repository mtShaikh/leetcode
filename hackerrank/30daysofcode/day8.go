// dictionaries and maps
package main
import (
	"fmt"
	"strings"
	"bufio"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	phoneBook := make(map[string] string)

	scanner.Scan()
    n,_ := strconv.Atoi(scanner.Text())

    for i := 0; i < n; i++ {
    	scanner.Scan()
    	in := scanner.Text()
    	inSplit := strings.Split(in, " ")
    	// r, _ := strconv.Atoi(inSplit[1])
    	phoneBook[inSplit[0]] = inSplit[1]
    }
    for scanner.Scan() {
    	in := scanner.Text()
    	if val, ok := phoneBook[in]; ok {
   			fmt.Printf("%s=%s\n",in,val)
    	} else {
    		fmt.Println("Not found")
    	}
    }
}
