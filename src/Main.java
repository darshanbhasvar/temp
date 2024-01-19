import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");


        readfromfile("abc.txt");

    }
        public static void readfromfile(String fileName) throws IOException {
            File file = null;
            FileReader fileReader = null;
            try {
                System.out.println("hello");
                file = new File(fileName);
            
                fileReader.read();
                System.out.println("hi");
            } catch (Exception e) {
                System.out.println("exception has occured we are checking this");
                //throw new RuntimeException(e);
    
            } finally {
                System.out.println("finally block");
            }
            System.out.println("outside finally");
        }

}