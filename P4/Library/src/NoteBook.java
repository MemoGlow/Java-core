import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class NoteBook extends Product{
    private int pageNum;
    private String type;
    private String paperType;
    private String paperSize;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getType() {
        return type;
    }

    public String getPaperType() {
        return paperType;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public String getColor() {
        return color;
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("Nhập loại: ");
        setType(sc.nextLine());
        System.out.print("Nhập kiểu giấy: ");
        setPaperType(sc.nextLine());
        System.out.print("Nhập cỡ giấy: ");
        setPaperSize(sc.nextLine());
        System.out.print("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.print("Nhập số trang: ");
        setPageNum(parseInt(sc.nextLine()));
    }
    public String toString(){
        return String.format(super.toString() + " " + getType() + " " + getPaperType() + " " + getPaperSize() + " " + getColor() + " " + getPageNum() + " trang");
    }
    public String listInfo(){
        StringBuilder inf = new StringBuilder(super.listInfo());
        inf.append("\nSố trang: " + getPageNum());
        inf.append("\nLoại vở: " + getType());
        inf.append("\nMàu sắc bìa: " + getColor());
        inf.append("\nChất liệu giấy: " + getPaperType());
        inf.append("\nKích thước: " + getPaperSize());
        return inf.toString();
    }
    public String tableInfo(){
        StringBuilder inf = new StringBuilder(super.tableInfo());
        inf.append("\nSố trang: " + getPageNum());
        inf.append("\nLoại vở: " + getType());
        inf.append("\nMàu sắc bìa: " + getColor());
        inf.append("\nChất liệu giấy: " + getPaperType());
        inf.append("\nKích thước: " + getPaperSize());
        return inf.toString();
    }
    public boolean equals(String keyword){
        return super.equals(keyword) ||
                keyword.equals(color) ||
                keyword.equals(type) ||
                keyword.equals(paperSize) ||
                keyword.equals(paperType) ||
                keyword.equals(Integer.toString(pageNum));
    }
}
