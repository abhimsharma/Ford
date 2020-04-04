package day4;
//Write a program to get the character at the given index within the string

import java.util.Scanner;

public class Program1 {

    public static void main(String args[]){

        //String str = "Get well soon from Corona";
        //System.out.println(str.length());
       // System.out.println(str.charAt(6)); this is not reusable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.next();

        System.out.println("Enter a index : ");
        int inx = sc.nextInt();


        Program1 pgm = new Program1();
        char v1 = pgm.getCharIndex(str, inx);
        System.out.println(v1);

    }

    public char getCharIndex(String str, int index){

        char val = str.charAt(index);
        return val;
    }
}
