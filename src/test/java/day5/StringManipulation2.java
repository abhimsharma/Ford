package day5;

public class StringManipulation2 {
    public static void main(String args[]){

        String msg = "Work from Home till April 14th";
        System.out.println(msg.length());

        String msg1 = "Abhishek_1995";
        String name = msg1.split("_")[0];
        String num = msg1.split("_")[1];
        System.out.println(name);
        //we can split based on anything for example number character special symbol as we used underscore in our xample
    }

}
