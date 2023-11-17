import java.util.*;

import static java.lang.Integer.parseInt;

public class Menu {
    static String account;
    static String password;
    static ProductList lis;
    static void login(Scanner sc){
        System.out.println("==========================");
        while(true){
            System.out.print("Nhap tai khoan: ");
            account = sc.nextLine();
            if(account.compareTo("admin") == 0){
                System.out.print("Nhap mat khau: ");
                password = sc.nextLine();
                if(account.compareTo("admin") == 0){
                    System.out.println("Xin Chao admin");
                    return;
                }
            }else if(account.compareTo("khach") == 0){
                System.out.println("Xin chao khach");
                return;
            }else{
                System.out.println("Tai khoan khong ton tai");
            }
        }
    }
    static void function(Scanner sc){
        while(true){
            System.out.println("Danh sách các chức năng:");
            if(account.equals("admin") == true){
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Xóa sản phẩm");
                System.out.println("3. Sửa sản phẩm");
                System.out.println("4. Tìm kiếm sản phẩm");
                System.out.println("5. Danh sách sản phẩm");
                System.out.println("6. Thoát tài khoản");
                System.out.println("Nhập chức năng: ");
                int chosen = parseInt(sc.nextLine());
                switch (chosen){
                    case 1:
                        addFunc(sc);
                        break;
                    case 2:
                        removeFunc(sc);
                        break;
                    case 3:
                        changeFunc(sc);
                        break;
                    case 4:
                        searchFunc(sc);
                        break;
                    case 5:
                        viewFunc(sc);
                        break;
                    case 6:
                        exitFunc();
                        return;
                }
            }else{
                System.out.println("1. Tìm kiếm sản phẩm");
                System.out.println("2. Danh sách sản phẩm");
                System.out.println("3. Thoát tài khoản");
                System.out.print("Nhập chức năng: ");
                int chosen = parseInt(sc.nextLine());
                switch (chosen){
                    case 1:
                        searchFunc(sc);
                        break;
                    case 2:
                        viewFunc(sc);
                        break;
                    case 3:
                        exitFunc();
                        return;
                }
            }
        }
    }
    public static void exitFunc(){
        System.out.println("Vĩnh biệt");
    }
    public static void addFunc(Scanner sc){
        ProductList.showAll();
        ProductList.add(sc);
        System.out.println("Bạn đã hoàn thành");
        ProductList.showAll();
        pause(sc);
    }

    public static void changeFunc(Scanner sc){
        ProductList.showAll();
        ProductList.change(sc);
        System.out.println("Bạn đã hoàn thành");
        ProductList.showAll();
        pause(sc);
    }
    public static void viewFunc(Scanner sc){
        ProductList.showAll();
        pause(sc);
    }
    public static void searchFunc(Scanner sc){
        ArrayList<ArrayList<Product>> list = ProductList.getList();
        System.out.print("Vui lòng nhập từ khóa: ");
        String keyword = sc.nextLine();

        boolean findStatus = false;
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); i++){
                if(list.get(i).get(j).equals(keyword) == true){
                    findStatus = true;
                    break;
                }
            }
            if(findStatus == true) break;
        }
        if(findStatus == false){
            System.out.println("Không có sản phẩm thỏa mãn từ khóa!");
            pause(sc);
            return;
        }
        System.out.println("Vui lòng chọn kiểu xem!");
        System.out.println("1. Danh sách");
        System.out.println("2. Dạng bảng");
        System.out.print("Lựa chọn của bạn là: ");
        int chosen = parseInt(sc.nextLine());
        while(chosen != 1 && chosen != 2){
            System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            System.out.print("Lựa chọn của bạn là: ");
            chosen = parseInt(sc.nextLine());
        }
        if(chosen == 1){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < list.get(i).size(); j++){
                    if(list.get(i).get(j).equals(keyword)){
                        if(findStatus == false){
                            System.out.println("Danh sách sản phầm tìm kiếm được:");
                            System.out.println("-----");
                            findStatus = true;
                        }
                        System.out.println(list.get(i).get(j).listInfo());
                        System.out.println("-----");
                    }
                }
            }
            pause(sc);
        }else{
            int maxSize = Table.getMaxSize();
            System.out.println("|" + Table.fill("Tên sản phẩm", maxSize) + '|' + Table.fill("Giá bán", maxSize) + '|' + Table.fill("Thương hiệu", maxSize) + '|' + Table.fill("Thông tin thêm", maxSize));
            System.out.println("-".repeat(maxSize * 5));
            for(int i = 0; i < list.size(); i++){
                for(int j = 0; j < list.get(i).size(); j++){
                    if(list.get(i).get(j).equals(keyword) == true){
                        Table.show(list.get(i).get(j), maxSize);
                    }
                }
            }
            pause(sc);
        }

    }
    public static void removeFunc(Scanner sc){
        ProductList.showAll();
        ProductList.remove(sc);
        System.out.println("Bạn đã hoàn thành");
        ProductList.showAll();
        pause(sc);
    }
    public static void pause(Scanner sc){
        System.out.print("Nhấn Enter để tiếp tục");
        sc.nextLine();
    }
    public static void main(String[] args) {
        lis = new ProductList();
        account = new String();
        password = new String();
        Scanner sc = new Scanner(System.in);
        while(true){
            login(sc);
            function(sc);
        }
    }
}
