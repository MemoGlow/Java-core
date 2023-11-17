import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Pen extends Product{
    private String color;
    private String inkType;
    private String material;
    private String tip;

    public void setColor(String color) {
        this.color = color;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getColor() {
        return color;
    }

    public String getInkType() {
        return inkType;
    }

    public String getMaterial() {
        return material;
    }

    public String getTip() {
        return tip;
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.print("Nhập loại mực: ");
        setInkType(sc.nextLine());
        System.out.print("Nhập độ mịn: ");
        setTip(sc.nextLine());
    }
    public String toString(){
        return String.format(super.toString() + " " + getColor() + " " + getInkType() + " " + getTip());
    }
    public String listInfo(){
        StringBuilder inf = new StringBuilder(super.listInfo());
        inf.append("\nMàu sắc: " + getColor());
        inf.append("\nChất liệu: " + getMaterial());
        inf.append("\nLoại mực: " + getInkType());
        inf.append("\nĐộ mịn: " + getTip());
        return inf.toString();
    }
    public String tableInfo(){
        StringBuilder inf = new StringBuilder(super.tableInfo());
        inf.append("\nMàu sắc: " + getColor());
        inf.append("\nChất liệu: " + getMaterial());
        inf.append("\nLoại mực: " + getInkType());
        inf.append("\nĐộ mịn: " + getTip());
        return inf.toString();
    }
    public boolean equals(String keyword){
        return super.equals(keyword) ||
                keyword.equals(color) ||
                keyword.equals(inkType) ||
                keyword.equals(material) ||
                keyword.equals(tip);
    }
}
