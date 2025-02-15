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
	count := 0
	for i := 0; i < len(A); i++ {
		sum := 0
		for j := i; j < len(A); j++ {
			sum += A[j]
			if sum < B {count++}
		}
	}
	return count
}

func main() {

	// * read array
	A := readArray()

	// * read params
	B := readParams()
	
	// * calculate minimum average
	fmt.Println("\nsubarray sums less than B:", solve(A, B))
}