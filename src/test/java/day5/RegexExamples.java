package day5;

public class RegexExamples { //solving using regular expressions

    public static void main(String args[]){

        String msg = " Abhishek 199 born";
        String msg1 = "10 jan 1995";
        for (String str:msg.split(" ")) {
            if (str.matches("//d{4}"))  //d is used for numeric logic stands for digit
                System.out.println(str);
        }
        for (String str1:msg1.split(" ")) {
            if(str1.matches("//w{3}")) //w is used for alphabet logic used for words
                System.out.println(str1);


        }

    }
}
