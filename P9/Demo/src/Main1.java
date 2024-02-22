import java.io.FileNotFoundException;
import java.io.FileReader;

class Test{
    void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("data.txt");
        String s = file.toString();
        System.out.println(s);
    }
}
public class Main1 {
    public static void main(String[] args)  {
        Test obj = new Test();
        try{
            obj.readFile();
        }catch(FileNotFoundException e){
            System.out.println("Caught");
        }
    }

}