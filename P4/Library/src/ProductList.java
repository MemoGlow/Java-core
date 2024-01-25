import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProductList {
    private static ArrayList<ArrayList<Product>> list;
    ProductList(){
        list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
    }
    public void search(Scanner sc){
        String keyword = sc.nextLine();

    }

    public static ArrayList<ArrayList<Product>> getList() {
        return list;
    }

    public static void showProductByType(int type){

        System.out.print("Danh sách sản phẩm loại ");
        switch (type){
            case 0:
                System.out.print("sách");
                break;
            case 1:
                System.out.print("vở ghi");
                break;
            case 2:
                System.out.print("bút mực");
                break;
            case 3:
                System.out.print("bút chì");
                break;
        }
        if(list.get(type).size() == 0){
            System.out.println(" hiện không có");
            return;
        }
        System.out.println(" và thông số");
        for(int i = 0; i < list.get(type).size(); i++){
            System.out.print(i + 1 + "> ");
            System.out.println(list.get(type).get(i).toString());
        }
    }
    public static void showAll(){
        for(int i = 0; i < 4; i++){
            showProductByType(i);
        }
    }

    public static int chooseProductType(Scanner sc){
        System.out.println("Danh sách loại sản phẩm:");
        System.out.println("1. Sách");
        System.out.println("2. Vở ghi");
        System.out.println("3. Bút mực");
        System.out.println("4. Bút chì");
        System.out.print("Thể loại bạn chọn là: ");
        return parseInt(sc.nextLine()) - 1;
    }
    public static void add(Scanner sc){
        System.out.println("Vui lòng nhập thể loại cần thêm!");
        int type = chooseProductType(sc);
        switch (type){
            case 0:
                list.get(type).add(new Book());
                break;
            case 1:
                list.get(type).add(new NoteBook());
                break;
            case 2:
                list.get(type).add(new Pen());
                break;
            case 3:
                list.get(type).add(new Pencil());
                break;
        }
        System.out.println("Nhập thông tin sản phẩm:");
        list.get(type).getLast().input(sc);
    }
    public static void remove(Scanner sc){
        System.out.println("Vui lòng nhập thể loại cần xóa!");
        int type = chooseProductType(sc);
        while(list.get(type).size() == 0){
            System.out.println("Hiện tại không có sản phầm loại này, vui lòng chọn lại!");
            type = chooseProductType(sc);
        }
        showProductByType(type);
        System.out.println("Nhập số thứ tự sản phầm cần xóa: ");
        int chosen = parseInt(sc.nextLine()) - 1;
        while(chosen < 0 || chosen > list.get(type).size() - 1){
            System.out.println("Vui lòng nhập lại!");
            System.out.println("Nhập số thứ tự sản phẩm cần sửa: ");
            chosen = parseInt(sc.nextLine()) - 1;
        }
        list.get(type).remove(chosen);
    }
    public static void change(Scanner sc){
        System.out.println("Vui long nhập thể loại cần sửa!");
        int type = chooseProductType(sc);
        showProductByType(type);
        System.out.println("Nhập số thứ tự sản phẩm cần sửa: ");
        int chosen = parseInt(sc.nextLine()) - 1;
        while(chosen < 0 || chosen > list.get(type).size() - 1){
            System.out.println("Vui lòng nhập lại!");
            System.out.println("Nhập số thứ tự sản phẩm cần sửa: ");
            chosen = parseInt(sc.nextLine()) - 1;
        }
        list.get(type).get(chosen).input(sc);
    }
}
