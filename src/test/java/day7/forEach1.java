package day7;

public class forEach1 {
    public static void main(String args[]){

        String str[] = {"Abhishek","Muruli", "Indira"};

        for(String ref : str){

            if(ref.equals("Abhishek")){
                System.out.println("Found");
                break;
            }else {
                System.out.println("Not Found");
            }
        }
    }

}
