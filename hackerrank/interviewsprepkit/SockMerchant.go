package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the sockMerchant function below.
func sockMerchant(n int32, ar []int32) int32 {
    var c int32
    c = 0
   /* var m map[int32] int32
    m = make(map[int32] int32)
    for i := 0; i < int(n); i++ {
        if x, ok := m[ar[i]]; !ok {
            m[ar[i]] = 1
        } else {
            t := x/2
            if t >= 1 {
                c+=t
            }
            m[ar[i]] = x + 1
        }
    }
    // for _, v := range m {
    //     x := v/2
    //     if x >= 1 {
    //         c+=x
    //     }
    // }*/
    for i := 0; i < int(n); i++ {
        c+=ar[i]/2 //wrong solution
    }

    return c

}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

   /* stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()*/

    writer := bufio.NewWriterSize(os.Stdout, 1024 * 1024)

    nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    n := int32(nTemp)

    arTemp := strings.Split(readLine(reader), " ")

    var ar []int32

    for i := 0; i < int(n); i++ {
        arItemTemp, err := strconv.ParseInt(arTemp[i], 10, 64)
        checkError(err)
        arItem := int32(arItemTemp)
        ar = append(ar, arItem)
    }

    result := sockMerchant(n, ar)

    fmt.Fprintf(writer, "%d\n", result)

    writer.Flush()
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
