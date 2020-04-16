//Program to check if the input string only contains digits
package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class DigitStr {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str=in.nextLine();
        if(str.matches("[0-9]+")&&str.length()>2)
        {
            System.out.println("The string contains only digits");
        }
        else
            System.out.println("String contains both digits and characters");

    }

}
