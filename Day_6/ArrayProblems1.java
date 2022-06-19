package com.p.arrayproblems1;

public class ArrayProblems1 {

    static void print(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {

            System.out.print(a[i]);

        }
        System.out.println("");
    }

    //Question 1
    public static void smallest(int a[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }
        System.out.println("Smallest Intger in Array is " + min);

    }

    //Question 2
    public static void thirdlargest(int a[]) {
        int n = a.length;
        int first = 0, second = -1, third = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] < first && a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] < second && a[i] > third) {
                third = a[i];
            }
        }
        System.out.println("Third Largest Integer in Array is " + third);
    }

    // Question 3
    public static void sorted(int a[]) {
        int n = a.length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if ((a[i]) < (a[i + 1])) {
                break;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Array is Sorted in ascending order");
        } else {
            System.out.println("Array is not Sorted in ascending order");
        }

    }
    
    // Question 4
    public static void reverse(int a[])
    {
        int n=a.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-1-i]=temp;
        }
        System.out.println("Array in Reverse order is :");
        print(a);
    }
    
    // Question 5
    public static void leadersfromright(int a[])
    {
        System.out.println("The Given Array is:");
        print(a);       
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            int max=a[i];
            for(int j=i+1;j<n;j++)
            {
                if(max<a[j]) max=a[j];
            }
            a[i]=max;
        }
        System.out.println("The Modified Array is:");
        print(a);
    }

    public static void main(String[] args) {

        int a[] = {7, 5, 8, 9, 2, 5, 6, 1};
        System.out.println("The Given Array is :");
        print(a);
        // Question 1
        smallest(a);
        // Question 2
        thirdlargest(a);
        // Question 3
        sorted(a);
        // Question 4
        reverse(a);
        // Question 5
        leadersfromright(a);

    }
}
