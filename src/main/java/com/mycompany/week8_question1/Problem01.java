//Kevin Carpenter Week 08

import java.io.*;
import java.util.*;
// Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  

public class Problem01 {
    static int sumOfPrimes(int n)
    {
        boolean prime[]=new boolean[n + 1];
        Arrays.fill(prime, true);
      
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++)
            if (prime[i])
                sum += i;
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Please input a number to determine all prime numbers 1 - n");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt(); 
        System.out.println("After adding all the prime numbers the total is");
        System.out.print(sumOfPrimes(n));
    }
}
