//Program to check if the string is empty
package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class EmptyStr {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string");
        str = in.nextLine();
        if (str.isEmpty())
            System.out.println("The string is empty");
        else
            System.out.println("The string is not empty");
    }
}
