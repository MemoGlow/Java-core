# Cách java lưu trữ dữ liệu
## **Các vùng dữ liệu.**
|Vùng nhớ| Kích thước| Vai trò |
|:-------|:--------|:------|
|Code segment  |Không đổi|Tất cả mã chương trình lưu ở đây.|
|Data segment  |Không đổi|Nơi lưu trữ những dữ liệu chung như các biến static constant,... những biến dữ liệu mà được sinh ra khi chương trình bắt đầu thực thi và chỉ được giải phóng khi chương trình kêt thúc.|
|Stack segment | Thay đổi|nơi lưu trữ các biến thuộc kiểu dữ liệu cơ sở và địa chỉ của ô nhớ.|
|Free memory|||
|Heap segment  |Thay đổi |Nơi lưu trữ các các đôi tượng (object) được sinh ra trong thời gian thực thi.|
## **Cách java lưu trữ kiểu dữ liệu.**
1. Kiểu dữ liệu nguyên thủy.
   - Tất cả các biến kiểu dữ liệu nguyên thủy được lưu trên vùng nhớ stack.
   - Ví dụ: int a = 10; 
   - int a là cấp phát một ô nhớ có giá trị 4 byte trên stack. Ô nhớ gồm có value và địa chỉ.
   - a = 10 gán value cho ô nhớ là 10.
1. Kiểu dữ liệu object và Class object
    - Kiểu dữ liệu object là các kiểu dữ liệu phức tạp, là đối tượng, và có thể chứa nhiều giá trị khác nhau. Các kiểu dữ liệu object trong Java bao gồm: array, class, interface, enum, và các lớp đóng gói (wrapper) của các kiểu dữ liệu nguyên thủy.
   - Lớp object là lớp cha của tất cả các lớp.
   - Lớp Object cung cấp một vài cách xử lý chung cho tất cả các đối tượng.
   - Khi một object được tạo ra bằng toán tử new thì một vùng nhớ trên heap sẽ được cấp phát.
   - Các phương thức của lớp object.
    
    |Phương thức|Mô tả|
    |-----|-----|
    |public final Class getClass()|trả về đối tượng lớp Class của đối tượng hiện tại. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.
    |public int hashCode()|trả về số hashcode cho đối tượng hiện tại.|
    |public boolean equals(Object obj)|so sánh đối tượng đã cho với đối tượng hiện tại.|
    |public String toString()|	trả về chuỗi ký tự đại diện của đối tượng hiện tại.


2. Wrapper, boxing, unboxing.
   - Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy. Có 8 wrapper tương ứng với 8 kiểu dữ liệu nguyên thủy.
   - Tính năng autoboxing và unboxing chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy một cách tự động.
   - Thực hiện các phép toán và so sánh trên các đối tượng bằng cách sử dụng các phương thức parseXxx(), compare(), compareTo(), equals(), hashCode(), toString(), và các phương thức khác của các lớp Wrapper.
   - Sử dụng các đối tượng trong các cấu trúc dữ liệu như mảng (array), danh sách (list), tập hợp (set), bản đồ (map), v.v. Các cấu trúc dữ liệu này chỉ chấp nhận các đối tượng, không chấp nhận các kiểu nguyên thủy.
   - Ví dụ:
   ```Java
   public class WrapperExample1 {
       public static void main(String args[]) {
           // Đổi int thành Integer
           int a = 20;
           Integer i = Integer.valueOf(a);// đổi int thành Integer
           int b = i.intValue(); // đổi Integer sang int
       }
   }
   ```
## **Phương thức khởi tạo trong java**

   1. Hàm khởi tạo (constructor):
      - Hàm khởi tạo (constructor) trong Java là một hàm có tên giống với tên lớp. Hàm này được gọi khi khởi tạo đối tượng. Hàm khởi tạo không có kiểu trả về 
      - Ví dụ về hàm khởi tạo trong class Circle
      ```java
      public class Circle {  
        private double radius;
        private String color;
           public Circle() {                   
           radius = 1.0;
           color = "red";
        }
      }
      ```
      - Ví dụ về sử dụng hàm khởi tạo:
      ```Java
      Circle c1 = new Circle();
      ```
  1. Các loại hàm khởi tạo trong java
     - Hàm khởi tạo mặc định
     - Hàm khởi tạo không tham số
     - Hàm khởi tạo có tham số
     - Ví dụ:
        ```Java
        public class Circle {  
        private double radius;
        private String color;
        // Hàm khởi tạo không tham số
        public Circle() {                 
            radius = 1.0;
            color = "red";
        }
        // Hàm khởi tạo có tham số
        public Circle(double r) {          
            radius = r;
            color = "red";
        }
        public Circle(double r, String c) {
            radius = r;
            color = c;
        }
        }
        ```
  2. Nạp chồng hàm khởi tạo
     - Khi chúng ta có nhiều hơn một hàm khởi tạo thì khi đó hàm khởi tạo đã được nạp chồng.
  3. Constructor chaining
     - Constructor chaining được thực hiện khi một hàm khởi tạo gọi hàm khởi tạo khác. 
     - Chúng ta có thể sử dụng từ khóa this để gọi hàm khởi tạo khác trong class
     - Ví dụ:
       ```Java
       public class Employee {
               private int id;
               private String name;
               
               public Employee() {
                   this("John Doe", 999);
                   System.out.println("Default Employee Created");
               }
               
               public Employee(int i) {
                   this("John Doe", i);
                   System.out.println("Employee Created with Default Name");
               }
               public Employee(String s, int i) {
                   this.id = i;
                   this.name = s;
                   System.out.println("Employee Created");
               }
               public static void main(String[] args) {

                   Employee emp = new Employee();
                   System.out.println(emp);
                   Employee emp1 = new Employee(10);
                   System.out.println(emp1);
                   Employee emp2 = new Employee("Pankaj", 20);
                   System.out.println(emp2);
               }
       }
       ```
   4. Từ khóa super
      - Khái niệm: Từ khóa super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.
      - Các cách sử dụng:
        - Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
          - Ví dụ:
          ```Java
            class Vehicle {
                int speed = 50;
            }
            
            public class Bike2 extends Vehicle {
                int speed = 100;
            
                void display() {
                    System.out.println(super.speed);//in speed của lớp Vehicle  
                }
            
                public static void main(String args[]) {
                    Bike2 b = new Bike2();
                    b.display();
            
                }
            }
          ```
        - super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
          - Ví dụ:
          ```Java
          class Vehicle {
              Vehicle() {
                  System.out.println("Vehicle is created");
              }
          }
          
          class Bike2 extends Vehicle {
              Bike2() {
                  super();//gọi Constructor của lớp cha  
                  System.out.println("Bike is created");
              }
          
              public static void main(String args[]) {
                  Bike2 b = new Bike2();
              }
          }
          ```
        - Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
          - Ví dụ:
          ```Java
          class Person {
              void message() {
                  System.out.println("welcome");
              }
          }
           
          public class Student16 extends Person {
              void message() {
                  System.out.println("welcome to java");
              }
           
              void display() {
                  message();// gọi phương thức message() của lớp hiện tại
                  super.message();// gọi phương thức message() của lớp cha
              }
           
              public static void main(String args[]) {
                  Student16 s = new Student16();
                  s.display();
              }
          }
          ```

      

## **Garbage collector**
- Khi chúng ta cấp phát bộ nhớ cho một đối tượng. Sau đó sử dụng nó và khi không còn một tham chiêu nào tới đối tượng đó, đối tượng sẽ được đánh dấu để **Garbage collector** giải phóng bộ nhớ đã được phân bố. Những công việc trên sẽ được thực hiện qua hai phương thức là mark và sweep.
- **Garbage collector** cũng đảm bảo rằng mọi đối tượng có tham chiếu trực tiếp không bị loại bỏ.
## **Các cách truyền trong java**
1. Truyền biến nguyên thủy
   - Khái niệm: Khi chúng ta gọi một phương thức và truyền một giá trị cho phương thức đó được gọi là truyền giá trị. Việc thay đổi giá trị chỉ có hiệu lực trong phương thức được gọi, không có hiệu lực ngoài phương thức.
   - Ví dụ:
   ```java
    public class Operation1 {
        int data = 50;
 
        void change(int data) {
            data = data + 100;
        }
    
        public static void main(String args[]) {
            Operation1 op = new Operation1();
    
            System.out.println("Trước khi thay đổi: " + op.data);
            op.change(500);
            System.out.println("Sau khi thay đổi: " + op.data);
        }
    }
    //output:
    //Trước khi thay đổi: 50
    //Sau khi thay đổi: 50    
   ```
2. Truyền đối tượng:
   - Khái niệm: Khi chúng ta gọi một phương thức và truyền một tham chiếu cho phương thức đó được gọi là truyền tham chiếu. Việc thay đổi giá trị của biến tham chiếu bên trong phương thức làm thay đổi giá trị gốc của nó.
   - Ví dụ:
   ```Java
       int data = 50;
 
    void change(Operation2 op) {
        op.data = op.data + 100;
    }
 
    public static void main(String args[]) {
            Operation2 op = new Operation2();
    
            System.out.println("Trước khi thay đổi: " + op.data);
            op.change(op); // truyền đối tượng
            System.out.println("Sau khi thay đổi: " + op.data);
        }
    }
    // output:
    // Trước khi thay đổi: 50
    // Sau khi thay đổi: 150
   ```
