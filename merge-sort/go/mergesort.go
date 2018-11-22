package main
import "fmt"

func merge (A []int, l int, m int, r int) {
	nL := m - l + 1
	nR := r - m
	L := make([]int, nL)
	R := make([]int, nR)

	for i := 0; i < nL; i++ {
		L[i] = A[l + i]
	}

	for j := 0; j < nR; j++ {
		R[j] = A[m + 1 + j]
	}

	i := 0
	j := 0
	k := l
	for i < nL && j < nR {
		if L[i] <= R[j] {
			A[k] = L[i]
			i++
		} else {
			A[k] = R[j]
			j++
		}
		k++
	}

	for i < nL {
		A[k] = L[i]
		k++
		i++
	}
	for j < nR {
		A[k] = R[j]
		k++
		j++
	}
}

func mergeSort(A []int, l int, r int) {
	if l < r {
		m := (l + r) / 2
		mergeSort(A, l, m)
		mergeSort(A, m + 1, r)
		merge(A, l, m, r)
	}
}

func main() {
	A := []int{2, 5, 10, 3, 4, 1, 9, 6, 7, 8}
	fmt.Println(A)
	mergeSort(A, 0, len(A) - 1)
	fmt.Println("after sort: ")
	fmt.Println(A)
}
