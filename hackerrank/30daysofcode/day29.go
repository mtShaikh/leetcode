// bitwise AND
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

	tTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
	checkError(err)
	t := int32(tTemp)
	var res []int32
	for tItr := 0; tItr < int(t); tItr++ {
		nk := strings.Split(readLine(reader), " ")

		nTemp, err := strconv.ParseInt(nk[0], 10, 64)
		checkError(err)
		n := int32(nTemp)

		kTemp, err := strconv.ParseInt(nk[1], 10, 64)
		checkError(err)
		k := int32(kTemp)
		var max int32 = 0
		for i := int32(1); i <= n; i++ {
			for j := int32(i + 1); j <= n; j++ {
				x := i & j
				if x > max && x < k {
					max = x
				}
			}
		}
		res = append(res, max)
	}
	for i := 0; i < len(res); i++ {
		fmt.Println(res[i])
	}
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
