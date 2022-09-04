package com.Bridgelabz;
import java.util.*;

public class FibNthTerm {

    public static void main(String args[])
    {
        System.out.println("***************************************************");
        System.out.println(" Welcome to Fibonacci Series up to Nth Term.....");
        System.out.println("***************************************************");

        System.out.println("Enter A Nth  Term = ");
        Scanner sc = new Scanner(System.in);
                int count = sc.nextInt();

        System.out.println ("Following Is Result ->");
        System.out.println ("--------------------------");

                    /*
                    printing 0 and 1
                     */

                    int n1=0,n2=1,n3,i;
                    System.out.println (""+n1);
                    System.out.println (""+n2);


                    for(i=2 ; i < count ; ++i)
                    {
                        n3=n1+n2;
                        System.out.println(""+n3);
                        n1=n2;
                        n2=n3;
                    }

                }
}
