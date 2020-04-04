package day8;

public class methodExamples {
    public static void main(String args[]) {
        methodExamples m = new methodExamples();
        m.addNumbers(1,2);
        m.addNumbers(2,3,4);
        m.Student("Abhi", 94);
        m.Student("Abhi", "82l");

    }

    public int addNumbers(int i, int j) {
        int sum = i + j;
        return sum;
    }

    public void addNumbers(int i, int j, int k) {
        int sum = i + j + k;
        System.out.println(sum);
    }

    public void Student(String name, String rollNo) {
        System.out.println("Name of the student is " + name);
        System.out.println("Roll number of the Student is " + rollNo);
    }

    public void Student(String name, float per) {
        System.out.println("Name of the student is " + name);
        System.out.println("percentage of the Student is " + per);
    }

}
//if the same method is given one more time using diffrent parameters is called method overloading
