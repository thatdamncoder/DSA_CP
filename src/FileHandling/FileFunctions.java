package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileFunctions {
    public static void main(String[] args) throws IOException {
        File obj=new File("test.txt");
        if(obj.createNewFile()) System.out.println("Created");
        FileWriter writer=new FileWriter(obj);
        writer.write("This is my first file in file handling");
        Scanner sc=new Scanner(obj);
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
    }
}
