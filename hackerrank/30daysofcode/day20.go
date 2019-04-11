//sorting
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

    nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    n := int32(nTemp)

    arrTemp := strings.Split(readLine(reader), " ")

    var arr []int32

    for i := 0; i < int(n); i++ {
        arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
        checkError(err)
        arrItem := int32(arrItemTemp)
        arr = append(arr, arrItem)
    }

    numberOfSwaps := 0;
    for i := 0; i < int(n); i++ {
        // Track number of elements swapped during a single array traversal

        for j := 0; j < int(n) - 1; j++ {
            // Swap adjacent elements if they are in decreasing order
            if (arr[j] > arr[j + 1]) {
                temp := arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                numberOfSwaps++;
            }
        }

        // If no elements were swapped during a traversal, array is sorted
        if (numberOfSwaps == 0) {
            break;
        }
    }

    fmt.Printf("Array is sorted in %d swaps.\n", numberOfSwaps)
    fmt.Printf("First Element: %d\n", arr[0])
    fmt.Printf("Last Element: %d\n", arr[int(n)-1])

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

