import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        try(File file = new File();
        try{
            System.out.println("Start");
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException){
            System.out.println("Catch Block");
        }
    }
}