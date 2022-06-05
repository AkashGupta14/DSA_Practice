//
//
//package com.p.dsa_problems;
//
//import java.util.*;
//
//
//public class DSA_Problems {
//
//    public static void main(String[] args) {
//        //Question 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Two Numbers ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println("The product of Given numbers are "+num1*num2);
//        
//        // Question 2
//        System.out.println("Enter the Radius of Circle");
//        int radius = sc.nextInt();
//        System.out.println("The Area of Circle is "+3.14*radius*radius);
//        System.out.println("The Perimeter of Circle is"+2*3.14*radius);
//        
//        // Question 3
//        System.out.println("Enter the numbers in Inches");
//        int inch = sc.nextInt();
//        System.out.println("The Number in Meters is"+inch*0.0254);
//        
//        // Question 4
//        System.out.println("Enter the Three Numbers");
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int n3=sc.nextInt();
//        if(n1>n2 && n1>n3)
//        {
//            System.out.println("Greatest Number is"+n1);
//        }
//        else if(n3>n2 && n3>n1)
//        {
//            System.out.println("Greatest Number is"+n3);
//        }
//        else if(n2>n1 && n2>n3)
//        {
//            System.out.println("Greatest Number is"+n2);
//        }
//        else
//        {
//            System.out.println("None of them is Greatest");
//        }
//        
//        // Question 5
//        System.out.println("Enter the Year");
//        int year = sc.nextInt();
//        if(year%4==0)
//        {
//            System.out.println("The Year is Leap Year");
//        }
//        else{
//            System.out.println("The Year is not a Leap Year ");
//        }
//        
//        // Question 6 
//        System.out.println("Enter the two to be Swapped");
//        int no1 = sc.nextInt();
//        int no2 = sc.nextInt();
//        System.out.println("Number 1 before swap is"+no1);
//        System.out.println("Number 2 before swap is"+no2);
//        int temp;
//        temp=no1;
//        no1=no2;
//        no2=no1;
//        System.out.println("Number 1 before swap is"+no1);
//        System.out.println("Number 2 before swap is"+no2);
//        
//        // Question 7
//        System.out.println("Enter the Student Marks");
//        int marks = sc.nextInt();
//        if(marks>90)
//        {
//            System.out.println("The Grade is S");
//        }
//        else if(marks<=90 && marks>80)
//        {
//            System.out.println("The Grade is A");
//        }
//        else if(marks<=80 && marks>70)
//        {
//            System.out.println("The Grade is B");
//        }
//        else if(marks<=80 && marks>60)
//        {
//            System.out.println("The Grade is C");
//        }
//        else if(marks<=60 && marks>50)
//        {
//            System.out.println("The Grade is D");
//        }
//        else {
//            System.out.println("The Grade is E");
//        }
//    }
//}
