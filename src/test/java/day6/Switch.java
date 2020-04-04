package day6;
import java.lang.String;
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = sc.next();

        switch(month) {
            case "jan" :
                System.out.println("January month");
                break;
            case "feb" :
                System.out.println("Febraury month");
                break;
            case "march" :
                System.out.println("March month");
                break;
            default :
                System.out.println("Enter correct month");
        }
    }
}
