package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in first number");
        int a = sc.nextInt();
        System.out.println("Enter in second number");
        int b = sc.nextInt();
        System.out.println("The greatest common divisor recursively is " + GDRec(a, b));
        System.out.println("The greatest common divisor iteratively is " + GDIter(a, b));
    }

    public static int GDIter(int a, int b){
        while(true) {
            if (a == 0)
                return b;
            else if (b == 0)
                return a;
            else{
                if(a > b){
                    int remainder = a % b;
                    a = b;
                    b = remainder;
                }
                else{
                    int remainder = b % a;
                    b = remainder;
                }
            }
        }
    }
    public static int GDRec(int a, int b){
        if(a == 0)
            return b;
        else if(b == 0)
            return a;
        else{
            if(a > b){
                int remainder = a % b;
                return GDRec(b, remainder);
            }
            else{
                int remainder = b % a;
                return GDRec(a, remainder);
            }
        }
    }
}