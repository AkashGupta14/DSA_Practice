

import java.util.*;

public class Practice_Problems {

    public static void main(String[] args) {
        // Question 1 
        int[] arr = {100, 200, 300, 400, 500};
        int sum = 0, avg;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.print("Numbers greater than average are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }

        // Question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the number");
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(x * (i + 1));
        }
        
        // Question 3
        int[] arr1 = {100, 200, 300, 400, 500};
        
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1= sum1 + arr1[i];
        }
        System.out.println("The sum of Array is "+sum);
        
        // Question 4
        int[] arr2 = {100, 200, 300, 400, 500};
        System.out.print("The Given Array is ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        int max = arr2[0];
        int min = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if(max<arr2[i])
            {
                max=arr2[i];
            }
            if(min<arr2[i])
            {
                min = arr2[i];
            }
        }
        System.out.println("");
        System.out.println("The Min of Array is "+min);
        System.out.println("The Max of Array is "+max);
        
        // Question 5
        int[] arr5 = {0,0,0,1,0,0,1,1,1,1};
        System.out.print("The Given Array is ");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
        int zeros=0;
        for(int i =0;i<arr5.length;i++)
        {
            if(arr5[i]==1)
                zeros++;
        }
        for(int i=0;i<arr5.length;i++)
        {
         if(i<zeros)
         {
             arr5[i]=0;
         }
         else
         {
             arr5[i]=1;
         }
        }
        System.out.println("");
        System.out.println("The Shifted Array is ");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
        
    } 
}
