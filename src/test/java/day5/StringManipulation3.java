package day5;

public class StringManipulation3 {

    public static void  main(String args[]){

        String msg = "Work from home till april 14th";
        String s = msg.substring(0,15).toUpperCase()+ msg.substring(15,30);//we can also write +msg.substring(15)
        System.out.println(s);
        System.out.println(msg.replace("o","*"));
    }
}
      //we can also use this function to split as well