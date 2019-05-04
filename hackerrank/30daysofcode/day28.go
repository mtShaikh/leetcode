//regex, patterns
package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
    "regexp"
    "sort"
)



func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)
    r, _ := regexp.Compile("([a-z]+)@gmail.com")
    NTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    N := int32(NTemp)
    var arr []string
    for NItr := 0; NItr < int(N); NItr++ {
        firstNameEmailID := strings.Split(readLine(reader), " ")

        firstName := firstNameEmailID[0]

        emailID := firstNameEmailID[1]
        if r.MatchString(emailID) {
            arr = append(arr, firstName)
        }
    }
    sort.Strings(arr)
    for i := 0; i < len(arr); i++ {
        fmt.Println(arr[i])
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
