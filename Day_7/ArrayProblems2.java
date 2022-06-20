/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.p.arrayproblems2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author akash
 */
public class ArrayProblems2 {

    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + ",");

        }
        System.out.println("");
    }

    // Question 1
    public static void frequencyinsortedarray(int a[]) {
        Arrays.sort(a);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int c = 1;
        int curr = a[0];
        int i = 0;
        for (i = 1; i < a.length; i++) {
            if (curr == a[i]) {
                c++;
            } else {
                map.put(a[i - 1], c);
                curr = a[i];
                c = 1;
            }
        }
        map.put(a[i - 1], c);
        System.out.println("Frequency of Elements in a Sorted Array :");
        System.out.println(map);
    }

    // Question 2
    static void longestlengthofallconsecuticeones(int a[]) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                curr++;
            } else {
                curr = 0;
            }
            if (max < curr) {
                max = curr;
            }
        }

        System.out.println("The Given Array is :");
        print(a);
        System.out.println("The longest length of all consecutive one is : " + max);

    }

    // Question 3
    static void moveallzeroestoend(int a[]) {
        System.out.println("The Given Array is :");
        print(a);
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }
        for (; j < a.length; j++) {
            a[j] = 0;
        }

        System.out.println("The Modified Array is :");
        print(a);

    }

    // Question 4
    static void TrappingRainWater(int a[]) // Space Compexity = O(1)
    {
        int ans = 0;
        int left = 0;
        int leftMax = 0, rightMax = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] <= a[right]) {
                if (a[left] > leftMax) {
                    leftMax = a[left];
                } else {
                    ans += leftMax - a[left];
                }
                left++;
            } else {
                if (a[right] > rightMax) {
                    rightMax = a[right];
                } else {
                    ans += rightMax - a[right];
                }
                right--;
            }

        }
        System.out.println("The Max Amount of Rain water is:" + ans);

    }

    // Question 5
    static void Minimumsumsubarray(int a[]) {
        System.out.println("The Given Array:");
        print(a);
        int min = Integer.MAX_VALUE, curr = 0;
        for (int i = 0; i < a.length; i++) {
            curr += a[i];
            if (curr > 0) {
                curr = 0;
            }
            if (min > curr) {
                min = curr;
            }
        }
        System.out.println("The Minimum sum subarray is: " + min);
    }

    static void ElementsofMaxSumSubArray(int a[]) {
        System.out.println("The Given Array:");
        print(a);
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int x[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            curr += a[i];
            x[j++] = a[i];
            if (curr > max) {
                max = curr;
            }
            if (curr < 0) {
                curr = 0;
                j = 0;
            }
        }
        System.out.println("The Max Sum is " + max);
        for (int i = 0; i < j - 1; i++) {
            System.out.print(x[i] + " , ");
        }

    }

    //Question 7
    static int maxProfit(int[] prices) {
        System.out.println("");
        System.out.println("");
        int buy = Integer.MAX_VALUE, day = 0, sell = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
             buy=prices[i];
             day=i+1;
            }
        }
        System.out.println(buy);
        int flag=0;
        for(int i=day;i<prices.length;i++)
        {
            if(sell<prices[i])
            {
                sell=prices[i];
                flag=1;
            }
        }
        System.out.println(flag);
        if(buy<sell)
        {
            int profit = sell - buy;
            return profit;
        }
        
        return 0;
    }

    public static void main(String[] args) {

        // Question 1
        int[] h = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        frequencyinsortedarray(h);

        // Question 2
        int a[] = {1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
        longestlengthofallconsecuticeones(a);

        //Question 3
        moveallzeroestoend(a);

        // Question 4
        TrappingRainWater(h);

        //Question 5
        int[] x = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Minimumsumsubarray(x);

        //Question 6
        int[] z = {6, -7, 4, -2, 1, 5, -4};
        ElementsofMaxSumSubArray(z);

        //Question 7
        int s[] = {2,4,1};
        int profit = maxProfit(s);
        System.out.println("");
        System.out.println("Profit is " + profit);
        
        //Question 8
    }
}
