//Program to compare two strings
package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class CompareStr {
    public static void main(String[] args) {
        String str1,str2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string1");
        str1 = in.nextLine();
        System.out.println("Enter the string2");
        str2 = in.nextLine();
        int i=str1.compareTo(str2);
        if(i==0)
            System.out.println("The strings are equal");
        if(i>0)
            System.out.println("The 1st string is lexicographically greater than 2nd string");
        if(i<0)
            System.out.println("The 1st string is lexicographically lesser than 2nd string");


    }

}
