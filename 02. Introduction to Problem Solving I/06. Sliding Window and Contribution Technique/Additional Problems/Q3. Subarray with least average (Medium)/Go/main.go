package main

import "fmt"

func readArray() []int {
	var size int
	
	fmt.Printf("enter array size: ")
	fmt.Scan(&size)
	arr := make([]int, size)

	fmt.Printf("enter elemnts: ")
	for i := 0; i < size; i++ {
		fmt.Scan(&arr[i])
	}
	return arr
}

func readParams() int {
	var B int

	fmt.Printf("enter B: ")
	fmt.Scan(&B)

	return B
}

func solve(A []int , B int )  (int) {
	sum := 0
	for i := 0; i < B; i++ {
		sum += A[i]
	}

	minSum := sum
	minIndex := 0
	si := 1
	for ei := B; ei < len(A); ei++ {
		sum -= A[si-1]
		sum += A[ei]
		if sum < minSum {
			minSum = sum
			minIndex = si
		}
		si++
	}
	return minIndex
}

func main() {

	// * read array
	A := readArray()

	// * read params
	B := readParams()
	
	// * calculate minimum average
	fmt.Println("minimum index:", solve(A, B))
}