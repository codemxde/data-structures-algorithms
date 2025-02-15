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
	window := 0

	// * calculating window size or, the total numbers
	// * which are less than or equal to B
	for i := 0; i < len(A); i++ {
		if A[i] <= B {window++}
	}

	// * calculating number of bad numbers in the first window
	badNums := 0
	for i := 0; i < window; i++ {
		if A[i] > B {badNums++}
	}
	
	minSwaps := badNums
	si, ei := 1, window

	// * the window with the least number of bad nums is the answer
	for ;ei < len(A); ei++ {
		if A[si-1] > B { badNums-- }
		if A[ei] > B { badNums++ }
		if badNums < minSwaps {minSwaps = badNums}
		si++
	}

	return minSwaps
}

func main() {

	// * read array
	A := readArray()

	// * read params
	B := readParams()

	// * find minimum no of swaps required
	fmt.Println("minimum swaps required:", solve(A, B))
}