package day9;
//Constructor
//Constructors are called as soo as the object is created

public class Cars {
    Cars(){
        System.out.println("This is a Constructor");
    }

    public void Method(){
        System.out.println("This is a method");
    }
        public static void main(String args[]){
        Cars c = new Cars();//implicit calling
        c.Method();//explicit calling
        }

}
