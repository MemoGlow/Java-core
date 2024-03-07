import java.util.ArrayList;

    public class Main{
        public static void main(String[] args) {
            Rectangle rec = new Rectangle();

            System.out.println(rec.area());
        }
    };
interface Shape{
    int area();
}
class Square implements Shape{
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int area() {
        return size * size;
    }
}
class Rectangle implements Shape{
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }
}
















