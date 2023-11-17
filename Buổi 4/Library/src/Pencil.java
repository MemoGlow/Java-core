import java.util.Scanner;

public class Pencil extends Product{
    private String hardness;
    private String material;
    private String color;

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHardness() {
        return hardness;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void input(Scanner sc){
        super.input(sc);
        System.out.print("Nhập màu sắc: ");
        setColor(sc.nextLine());
        System.out.print("Nhập độ cứng: ");
        setHardness(sc.nextLine());
        System.out.print("Nhập chất liệu: ");
        setMaterial(sc.nextLine());
    }
    public String toString(){
        return String.format(super.toString() + " " + getColor() + " " + getHardness() + getMaterial());
    }
    public String listInfo(){
        StringBuilder inf = new StringBuilder(super.listInfo());
        inf.append("Màu sắc: " + getColor());
        inf.append("Chất liệu: " + getMaterial());
        inf.append("Độ cứng: " + getHardness());
        return inf.toString();
    }
    public String tableInfo(){
        StringBuilder inf = new StringBuilder(super.tableInfo());
        inf.append("Màu sắc: " + getColor());
        inf.append("Chất liệu: " + getMaterial());
        inf.append("Độ cứng: " + getHardness());
        return inf.toString();
    }
}
