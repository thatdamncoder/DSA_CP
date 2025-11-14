package RandomTry;

import java.util.Arrays;

public class javaCommandLineDemo {
    public static void main(String[] args) {
        System.out.println("Number of arguments:- " + args.length);
        if(args.length==0){
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("arr[" + i + "] = " + args[i]);
        }
    }
}
