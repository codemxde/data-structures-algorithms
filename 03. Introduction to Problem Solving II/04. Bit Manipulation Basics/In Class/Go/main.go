package main

import (
	"fmt"
)

func endOfSegment() {
	fmt.Println("-----------------------------------------")
}

func ConvertBinaryToDecimal() {
	fmt.Println("Q1. Convert Binary to Decimal")
	var binary int
	fmt.Printf("\nenter binary: ")
	fmt.Scanf("%d", &binary)

	decimal, power := 0, 1

	for binary > 0 {
		digit := binary % 10
		decimal += digit * power
		power *= 2
		binary /= 10
	}

	fmt.Println("decimal representation:", decimal)
}

func ConvertDecimalToBinary() {
	fmt.Println("Q2. Convert Decimal to Binary")
	var decimal int
	fmt.Printf("\nenter decimal: ")
	fmt.Scanf("%d", &decimal)

	binary, power := 0, 1

	for decimal > 0 {
		remainder := decimal % 2
		binary += remainder * power
		power *= 10
		decimal /= 2
	}
	fmt.Println("binary representation:", binary)
}

func BinaryAddition() {
	fmt.Println("Q3. Add Two Binary Numbers")

	var binary1, binary2, result int
	fmt.Printf("\nenter first binary: ")
	fmt.Scanf("%d", &binary1)
	fmt.Printf("enter second binary: ")
	fmt.Scanf("%d", &binary2)

	carry, power := 0, 1
	for binary1 > 0 || binary2 > 0 || carry > 0 {
		sum := (binary1 % 10) + (binary2 % 10) + carry
		r := sum % 2
		carry = sum / 2
		result += r * power
		power *= 10
		binary1 /= 10; binary2 /= 10
	}
	fmt.Println("addition result:", result)
}

func main() {
	// # Q1. Convert Binary to Decimal
	ConvertBinaryToDecimal(); endOfSegment();

	// # Q2. Convert Decimal to Binary
	ConvertDecimalToBinary(); endOfSegment();

	// # Q3. Add Two Binary Numbers
	BinaryAddition(); endOfSegment();
}