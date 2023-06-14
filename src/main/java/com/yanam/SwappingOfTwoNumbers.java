package com.yanam;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value : ");
        int a=sc.nextInt();
        System.out.println("enter b value :");
        int b= sc.nextInt();
        System.out.println("Before swapping a is "+a);
        System.out.println("Before swapping b is "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("after swapping a is "+a);
        System.out.println("after swapping b is "+b);
    }
}
