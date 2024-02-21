
public class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            System.out.println("Start");
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch Block");
        }
    }
}

