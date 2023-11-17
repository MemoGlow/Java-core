import java.util.Scanner;

public class Book extends Product{
    private String author;
    private String type;
    private String year;
    private String lang;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public String getLang() {
        return lang;
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("Nhập tên tác giả: ");
        setAuthor(sc.nextLine());
        System.out.print("Nhập thể loại: ");
        setType(sc.nextLine());
        System.out.print("Nhập năm xuất bản: ");
        setYear(sc.nextLine());
        System.out.print("Nhập ngôn ngữ: ");
        setLang(sc.nextLine());
    }
    public String toString(){
        return String.format(super.toString() + " " + getAuthor() + " " + getType() + " " + getYear() + " " + getLang());
    }
    public String listInfo(){
        StringBuilder inf = new StringBuilder(super.listInfo());
        inf.append("\nThể loại: " + getType());
        inf.append("\nTác giả: " + getAuthor());
        inf.append("\nNhà xuất bản: " + getBrand());
        inf.append("\nNăm xuất bản: " + getYear());
        inf.append("\nNgôn ngữ: " + getLang());
        return inf.toString();
    }
    public String tableInfo(){
        StringBuilder inf = new StringBuilder(super.tableInfo());
        inf.append("\nThể loại: " + getType());
        inf.append("\nTác giả: " + getAuthor());
        inf.append("\nNhà xuất bản: " + getBrand());
        inf.append("\nNăm xuất bản: " + getYear());
        inf.append("\nNgôn ngữ: " + getLang());
        return inf.toString();
    }
    public boolean equals(String keyword){
        return super.equals(keyword) ||
                keyword.equals(author) ||
                keyword.equals(lang) ||
                keyword.equals(year) ||
                keyword.equals(type);
    }
}
