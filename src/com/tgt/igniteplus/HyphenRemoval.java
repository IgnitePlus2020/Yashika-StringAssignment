//Program to remove hyphens between digits in a given string
package com.tgt.igniteplus;
import java.io.*;
import java.util.*;
public class HyphenRemoval {
    public static void main(String[] args) {
        String str;
        int j=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        str = in.nextLine();
        char a[]=str.toCharArray();
        char temp[]=new char[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            if (a[i] == '-' && Character.isDigit(a[i - 1]) && Character.isDigit(a[i + 1])) ;
            else
                temp[j++] = a[i];
        }
        System.out.println(temp);

        }




    }

