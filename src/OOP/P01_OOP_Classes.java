package OOP;

import java.util.Arrays;

//class is template of an object- not physical- does not occupy memory
//object is instance of a class- physical- occupies memory
class Student{
    //instance variables
    int roll;    //if not initialised,by default- 0
    String name; //if not initialised,by default-null
    float marks; //if not initialised,by default- 0.0
    char section;
}
public class P01_OOP_Classes {
    public static void main(String[] args) {
        Student[] students= new Student[5];
        //new is operator- allocates dynamically

        //printing before initialising
//        System.out.println(Arrays.toString(students));   //all null


//        Student kunal;   //not creating an object, only reference to a Student type object
//        System.out.println(kunal.marks);     //error since kunal is not initialised, only reference is created
        Student kunal= new Student();
        System.out.println(kunal);          //Output- toString(Student@<hashcode>)

    }
}
