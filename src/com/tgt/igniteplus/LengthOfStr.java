//Program to determine the length of the string
package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class LengthOfStr {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str = in.nextLine();
        int len = str.length();
        System.out.println("The length of string is : " + len);
    }
}
