package day5;

public class StringManipulation1 {

    public static void main(String args[]){

        /*
        = and ==
         */
    int a = 10;
    int b = 20;
    System.out.println(a==b);

    String name1 = "Abhi";//as the hashcode of the both string are not same it will print false
    String name2 = "abhi";
    System.out.println(name1.hashCode());//this is to get the hashcode
    System.out.println(name1==name2);

    if (name1.equals("Abhi")){    //name1.equals(name2) can be compared in this way too
        System.out.println("Equal");
    }else{
        System.out.println("NotEqual");

        if(name1.equalsIgnoreCase("abhi")){
            System.out.println("Equal");
        }else{
            System.out.println("NotEqual");
        }
    }

    }

}
