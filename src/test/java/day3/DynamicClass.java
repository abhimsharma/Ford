package day3;

import java.util.Scanner;

public class DynamicClass {
    public static void main(String args[]){
        //scanner class is used to give inputs dynamically
        Scanner sc = new Scanner(System.in); //System.in is the input stream used to input the data
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        Calculator cal = new Calculator();
        cal.addTwoNumber(num1,num2);

    }

}
