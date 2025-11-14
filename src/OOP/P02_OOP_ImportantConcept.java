package OOP;
//What is System.out.println()?
//What is public static void main(String[] args)?

class Test{
    static String s="java";

    static void printstring(){
        System.out.println(s);
    }
}
public class P02_OOP_ImportantConcept {
    public static void main(String[] args) {
    }
    public void sout(){
        //when printstring() is not static
        //System.out.println(Test.s.printstring()); error- static variables do not have methods

        //when printstring() is static
        Test.printstring();     //can be called
        //Test.s.printstring();   //error-static method is called without object
    }
    public void psvm(){




    }
}
