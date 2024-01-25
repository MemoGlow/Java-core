import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    public static String fill(String s, int maxSize){
        StringBuilder str = new StringBuilder(s);
        while(str.length() < maxSize){
            str.append(" ");
        }
        return str.toString();
    }
    public static int getMaxSize(){
        int maxSize = ("Thông tin thêm").length();
        ArrayList<ArrayList<Product>> list = ProductList.getList();
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                String data = list.get(i).get(j).tableInfo();
                Scanner sc = new Scanner(data);
                while(sc.hasNextLine() == true){
                    String tmp = sc.nextLine();
                    if(tmp.length() > maxSize) maxSize = tmp.length();
                }
            }
        }
        return maxSize;
    }
    public static void show(Product data, int maxSize){
        Scanner sc = new Scanner(data.tableInfo());
        System.out.print('|' + fill(sc.nextLine(), maxSize) + '|' + fill(sc.nextLine(), maxSize) + '|' + fill(sc.nextLine(), maxSize) + '|' + sc.nextLine() + '\n');
        while(sc.hasNextLine() == true){
            System.out.print('|' + fill("", maxSize) + '|' + fill("", maxSize) + '|' + fill("", maxSize) + '|' + sc.nextLine() + '\n');
        }
        System.out.println("-".repeat(maxSize * 5));
    }

}
