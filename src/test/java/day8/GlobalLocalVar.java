package day8;

public class GlobalLocalVar {
    String city = "Bangalore";
    static float temp = 33.6f;


    public static void main(String args[]){
        //static methods can be called like classname.methodname
        GlobalLocalVar gv = new GlobalLocalVar();
        gv.Teacherinfo("Aravindanath","Selenium");
        System.out.println("**************************");
        Studentinfo("Abhishek",82,'A');
        System.out.println(gv.city);//we can access non static variables like this


    }

    public static void Studentinfo(String name, int RollNo, char sec){ //for static methods no need to create a object directly we can call
        System.out.println("Name of the student is "+name);
        System.out.println("Roll no of the student is "+RollNo);
        System.out.println("Section of the Student is"+sec);
        System.out.println("temperature temp is "+temp);//

       //global variable cannot be called inside a static method
       //static variable can called inside a static method
    }
    public void Teacherinfo(String name, String subject){

        System.out.println("Name of the Teacher is "+name);
        System.out.println("Name of the subject "+subject);
        System.out.println("City of the Student is "+city);
        System.out.println(+temp);

    }

}
//we can use static variables in static methods
