//nested logic
package main
import (
"bufio"
"fmt"
"io"
"os"
"strconv"
"strings"
)

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)
	var fine int = 0
	returnIn := strings.Split(readLine(reader), " ")
	dueIn := strings.Split(readLine(reader), " ")
	var returnDate [3]int
	var dueDate [3]int
	for i := 0; i < 3; i++ {
		arrItemTemp, err := strconv.ParseInt(returnIn[i], 10, 64)
        checkError(err)
        returnDate[i] = int(arrItemTemp)
        arrItemTemp2, err := strconv.ParseInt(dueIn[i], 10, 64)
        checkError(err)
        dueDate[i] = int(arrItemTemp2)
	}
	yearDiff := returnDate[2] - dueDate[2]
	monthDiff := returnDate[1] - dueDate[1]
	dayDiff := returnDate[0] - dueDate[0]
	if yearDiff > 0 {
		fine = 10000
	} else if yearDiff == 0 {
		if monthDiff > 0 {
			fine = 500 * monthDiff
		} else {
			if dayDiff > 0 {
				fine = 15 * dayDiff
			} else {
				fine = 0
			}
		}
	} else {
		fine = 0
	}

	fmt.Println(fine)
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}
