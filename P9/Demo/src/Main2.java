class ValidLengthException extends RuntimeException{
    ValidLengthException(String s){
        super(s);
    }

}
public class Main2 {
    public static void printLength(double len){
        if(len < 0){
            throw new ValidLengthException("Do dai khong hop le");
        }
        System.out.println("Do dai la: " + len);
    }
    public static void main(String[] args) {
        try{
            printLength(-2);
        }catch (ValidLengthException e){
            System.out.println(e);
        }
    }
}
