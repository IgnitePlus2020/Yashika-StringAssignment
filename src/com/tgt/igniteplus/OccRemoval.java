//Program to remove all occurences of a given character for the given string
package com.tgt.igniteplus;
import java.io.*;
import java.util.Scanner;
public class OccRemoval {
    public static void main(String[] args) {
        int j=0;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str=in.nextLine();
        System.out.println("Enter the character to be removed");
        char ch=in.next().charAt(0);
        char a[]=str.toLowerCase().toCharArray();
        char temp[]=new char[str.length()];
        for(int i=0;i<str.length();i++) {
            if (a[i] != ch) {
                temp[j] = a[i];
                j++;
            }
        }
        System.out.println(temp);
    }
}
