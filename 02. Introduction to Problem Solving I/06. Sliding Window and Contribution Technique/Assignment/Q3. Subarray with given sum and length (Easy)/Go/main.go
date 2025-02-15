package main

import "fmt"

func readArray() []int {
	var size int
	
	fmt.Printf("enter size for array: ")
	fmt.Scanf("%d", &size)
	arr := make([]int, size)

	fmt.Printf("enter elements: ")
	for i := 0; i < size; i++ {
		fmt.Scanf("%d", &arr[i])
	}
	return arr
}

func readParameters() (B int, C int) {

	fmt.Printf("enter the length and maximum sum allowed for subarray: ")
	fmt.Scanf("%d %d", &B, &C)

	return B , C
}

func createPrefixSum(arr []int) {
	for i := 1; i < len(arr); i++ {
		arr[i] = arr[i] + arr[i-1]
	}
}

func solve(A []int , B int , C int )  (int) {
	createPrefixSum(A)

	// * handing edge case
	if A[B-1] == C {return 1}

	si, ei := 1, B

	for ;ei < len(A);ei++ {
		if A[ei] - A[si-1] == C {return 1}
		si++
	}
	return 0
}

func main() {
	// * read array input
	A := readArray()

	// * read maximum sum and size
	B, C := readParameters()

	// * find if a subarray exists with given length and sum
	ans :=solve(A, B, C)
	fmt.Println(ans)
}