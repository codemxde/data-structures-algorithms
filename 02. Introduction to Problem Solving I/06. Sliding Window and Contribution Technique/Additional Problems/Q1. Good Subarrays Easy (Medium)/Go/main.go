package main

import "fmt"

func readArray() []int {
	var size int

	fmt.Printf("enter array size: ")
	fmt.Scanf("%d", &size)
	arr := make([]int, size)

	fmt.Printf("enter elements: ")
	for i := 0; i < size; i++ {
		fmt.Scanf("%d", &arr[i])
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
	N := len(A)
	goodSubarrays := 0

	for i:= 0; i < N; i++{
		sum := 0
		for j := i; j < N; j++ {
			condition := (j-i+1) % 2
			sum += A[j]
			if (condition == 0 && sum < B) || (condition == 1 && sum > B) {goodSubarrays++}
		}
	}
	return goodSubarrays
}

func main() {
	// * read array input
	arr := readArray()

	// * read sum of all elements
	B := readParams()

	// * couting number of good subarrays
	fmt.Println("number of good subarrays:", solve(arr, B))
}