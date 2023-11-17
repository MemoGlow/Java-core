import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Product {
    private int price;
    private String brand;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(Scanner sc){
        System.out.print("Nhập tên: ");
        setName(sc.nextLine());
        System.out.print("Nhập thương hiệu: ");
        setBrand(sc.nextLine());
        System.out.print("Nhập giá: ");
        setPrice(parseInt(sc.nextLine()));
    }
    public String toString(){
        return String.format(getName() + " " + getBrand() + " " + getPrice());
    }
    public boolean equals(String keyword){
        return keyword.equals(price) || keyword.equals(brand) || keyword.equals(name);
    }
    public String listInfo(){
        StringBuilder inf = new StringBuilder();
        inf.append("Tên sản phẩm: " + getName());
        inf.append("\nGiá bán: " + String.format("%d", getPrice()));
        inf.append("\nThương hiệu: " + getBrand());
        return inf.toString();
    }
    public String tableInfo(){
        StringBuilder inf = new StringBuilder();
        inf.append(getName());
        inf.append('\n' + String.format("%d", getPrice()));
        inf.append('\n' + getBrand());
        return inf.toString();
    }

    public boolean compareTo(Product a){
        return this.getClass().toString().equals(a.getClass().toString());
    }
}
