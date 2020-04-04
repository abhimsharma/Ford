package day6;

import java.util.Scanner;

public class Conditions1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks<35){
            System.out.println("Fail");
        }else if(marks>=35 && marks<45){
            System.out.println("Pass Class");
        }else if (marks>45 && marks<60){
            System.out.println("Scond Class");
        }else if(marks>60 && marks<75){
            System.out.println("First Class");
        }else if(marks>75 && marks<=100){
            System.out.println("Distinction Class");
        }else{
            System.out.println("NA");
        }
    }
}
