package day3;

public class Calculator {

    public static void main (String args[]){
      //class reference = class object
        Calculator cal = new Calculator();
        cal.addTwoNumber(10,20);
        cal.mulTwoNumber(20,23);
        int val=cal.division(10,2);//when we use retrun type we should store it in a value to get the output
        System.out.println(val);


    }

    public void addTwoNumber(int a, int b){
        int sum = a+b;
        System.out.println("Addition of "+a+" and "+b+" is "+sum);

    }

    public void mulTwoNumber(int a, int b){
        int mul = a*b;
        System.out.println(mul);
    }

    public int division(int a, int b){
        int divof = a/b;
        return divof;
    }

}


