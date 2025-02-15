package main

import "fmt"

func readArrayInput() []int {
	var size int
	fmt.Printf("enter size of array: ")
	fmt.Scanf("%d", &size)

	arr := make([]int, size)

	fmt.Printf("enter elements : ")
	for i := 0; i < size; i++ {
		fmt.Scanf("%d", &arr[i])
	}
	return arr
}

func allSubarraySum(arr []int) int  {
	var totalSum int
	N := len(arr)

	for i := 0; i < N; i++ {
		totalSum += (N-i) * (i+1) * arr[i]
	}
	return totalSum
}

func main() {
	
	// * Read Array Input
	arr := readArrayInput()

	// * find the sum of all subarrays
	fmt.Println("all subarray sum:", allSubarraySum(arr))
}