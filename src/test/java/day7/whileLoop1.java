package day7;

import java.io.*;


public class whileLoop1 {

    public static  void main(String args[]) throws IOException {

        File f = new File("C:\\Users\\virunu\\IdeaProjects\\Ferrari\\src\\Files");// these three lines used to read file
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        //here if we want to print three lines we have to give give print stmt three times

        //here we can use while loop to print any no of lines

        String x="";

        while((x=br.readLine())!=null){
            System.out.println(x);
        }
    }
}
