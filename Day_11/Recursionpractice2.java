/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.p.recursionpractice2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author akash
 */
public class Recursionpractice2 {

    static int sumofdigits(int x) {
        if (x < 10) {
            return x;
        }
        int sum = 0;
        sum = (x % 10) + sumofdigits(x / 10);
        return sum;
    }

    static void generateallsubsets(String s) {
        Set<String> set = new HashSet<>();
        utilGenerateAllSubset(s, 0, ""); // Doesnt Print all the unique subsets it repeats
        System.out.println("2nd");
        utilGenerateAllSubset(s, 0, "", set);   // Prints all the unique subsets
        System.out.println(set);
    }

    static void utilGenerateAllSubset(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }
        utilGenerateAllSubset(s, i + 1, curr);
        utilGenerateAllSubset(s, i + 1, curr + s.charAt(i));

    }

    static void utilGenerateAllSubset(String s, int i, String curr, Set z) {
        if (i == s.length()) {
            z.add(curr);
            return;
        }
        utilGenerateAllSubset(s, i + 1, curr, z);
        utilGenerateAllSubset(s, i + 1, curr + s.charAt(i), z);

    }

    static void towerofHanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        towerofHanoi(n-1,from,aux,to);
        System.out.println("Move "+n+" from "+from+" to "+to);
        towerofHanoi(n-1,aux,to,from);

    }
    

    public static void main(String[] args) {
        int x = 2314;
        int sum = sumofdigits(x);
        System.out.println(sum);
        generateallsubsets("aaa");
        towerofHanoi(3,'A','C','B');
        
    }
}
