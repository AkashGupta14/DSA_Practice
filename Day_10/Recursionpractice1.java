package com.p.recursionpractice1;

public class Recursionpractice1 {

    static int sumofNNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        {
            return sumofNNaturalNumbers(n - 1) + n;
        }
    }

    static void printNNaturalNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNNaturalNumbers(n - 1);
        System.out.println(n);
    }

    static int NumberofPaths(int n, int m) {
        if (n == 1 || m == 1) return 1;
         
            int rightside = NumberofPaths(n, m - 1) ;
            int downside = NumberofPaths(n - 1, m);
            return  rightside+downside;
        
    }

    public static void main(String[] args) {
        int sum = sumofNNaturalNumbers(5);
        System.out.println(sum);
        printNNaturalNumbers(sum);
        sum = NumberofPaths(2, 3);
        System.out.println(sum);
    }
}
