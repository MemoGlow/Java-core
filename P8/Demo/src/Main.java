import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        q.add("Xin chao");
        q.add("Tam biet");
        q.add("Vinh biet");
        for(String s : q){
            System.out.print(s + " ");
        }
        System.out.println();
        q.remove();
        for(String s : q){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}