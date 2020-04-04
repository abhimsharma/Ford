package day9;

public class AccessModifiers {
    /*
    1.public
    2.private
    3.protect
    4.default
     */
    public void pubMethod(){
        System.out.println("public method");

    }

    private void priMethod(){
        System.out.println("private method");
    }

    protected void proMethod(){
        System.out.println("protected method");
    }

    void defMethod(){
        System.out.println("Default method");
    }

    public static void main(String args[]){

        AccessModifiers am = new AccessModifiers();
        am.pubMethod();
        am.priMethod();
        am.proMethod();
        am.defMethod();
    }
}

