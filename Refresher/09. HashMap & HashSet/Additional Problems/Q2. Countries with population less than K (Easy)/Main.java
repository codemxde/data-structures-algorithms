// # Problem Description
// * You are given a Hashmap<String, int> H and
// * an integer K as a function input.
// * The hashmap stores the name of some countries
// * and the corresponding population.
// * Return the number of countries with a population less than K.

// # Problem Constraints
// * 1 <= Length of H <= 10^5

// # Input Format
// * First argument is the hashmap H.
// * Second argument K is an integer.

// # Output Format
// * Return an integer denoting the number of
// * countries with population less than K

// # Example
// $ Input 1
// * H = [{"India", 12}, {"Pakistan", 8}, {"China" , 9}]
// * K = 10

// $ Output 1
// * 2

// ! Explanantion
// * The countries with population less than 10 are Pakistan and China.

// $ Input 2
// * H = [{"USA", 6}, {"Canada", 4}]
// * K = 6

// $ Output 2
// * 1

// ! Explanantion
// * The country with population less than 6 is Canada.

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void readHashMap(HashMap<String, Integer> map, Scanner sc) {
        System.out.print("enter map size: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("\nenter country: ");
            String key = sc.next();

            System.out.print("enter population: ");
            int population = sc.nextInt();

            map.put(key, population);
        }
    }

    public static int population(HashMap<String, Integer> H, int K){
        int countries = 0;
        for (String country : H.keySet()) {
            if (H.get(country) < K) {
                countries++;
            }
        }
        return countries;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        // * read hashmap as input
        readHashMap(map, sc);

        // * read integer K
        System.out.print("\nenter integer K: ");
        int K = sc.nextInt();

        // * checking countries with popukation less than K
        System.out.println("\ncountries with population less than " + K + ": " + population(map, K));
    }
}
