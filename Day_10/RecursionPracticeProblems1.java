package com.p.recursionpracticeproblems1;

/**
 *
 * @author akash
 */
public class RecursionPracticeProblems1 {

    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {

            System.out.print(a[i]);

        }
        System.out.println("");
    }

    // Question 1
    static boolean ArrayisPalindrome(int a[], int left, int right) {
        if (left >= right) {
            return true;
        }
        if (a[left] == a[right]) {
            if (ArrayisPalindrome(a, left + 1, right - 1)) {
                return true;
            }
        }
        return false;

    }

    // Question 2
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int x = factorial(n - 1) * n;
        return x;
    }
    
    // Question 3
    static int SumofSquareofNNaturalNumbers(int n)
    {
        if(n==1) return 1;
        int x =  (int) (SumofSquareofNNaturalNumbers(n-1) + Math.pow(n,2));
        return x;
    }
    
    // Question 4
    static int GreatestCommonDivisor(int a , int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        int remainder = a%b;
        
        return GreatestCommonDivisor(b,remainder);
    }

    public static void main(String[] args) {

        // Question 1
        System.out.println("The Given Array is :");
        int s[] = {1, 2, 1};
        print(s);
        if (ArrayisPalindrome(s, 0, s.length - 1)) {
            System.out.println("The Array is Palindrome");

        } else {
            System.out.println("The Array is not a Palindrome");
        }

        // Question 2
        int x = 5;
        System.out.println("Factorial of " + x + " is " + factorial(x));
        
        // Question 3
        System.out.print("The Sum of Squares of 2 Natural Numbers is :");
        System.out.print(SumofSquareofNNaturalNumbers(2));
        System.out.println("");
        
        // Question 4
        System.out.println("The GCD of 270 and 192 is :");
        System.out.print(GreatestCommonDivisor(270, 192));
    }
}
