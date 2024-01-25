## Interface và abstract class.
### **1. Tính trừu tượng.**
   - Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng.
   - Tính trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình.
   - Tính trừu tượng giúp bạn tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
### **2. Lớp trừu tượng trong java:**


   - **Lớp trừu tượng** là lớp được khai báo sử dụng từ khóa "abstract" trong định nghĩa class, là lớp được khai báo thuộc tính và phương thức cho các lớp khác sử dụng.
   - **Cách sử dụng từ khóa abstract:**
     - Lớp trừu tượng:
       ```Java
       abstract class tên-class{
        // code
       }
       ```
     - Phương thức trừu tượng:
        ``` Java
        abstract type method-name(parameter-list);
        ```
   - **Tính chất của lớp trừu tượng:**
     - Phương thức trừu tượng không có phần định nghĩa.
       - Ví dụ:
          ``` Java
          abstract void print();
          ```
     - Object của lớp trừu tượng không thể tạo một cách trực tiếp.
       - Ví dụ:
          ```Java
          abstract class Company{
              private String postion;

              public String getPostion() {
                  return postion;
              }

              public void setPostion(String postion) {
                  this.postion = postion;
              }

              Company(){
                  System.out.println("Ham khoi tao cua Company");
              }
              abstract void upgrade();
              void showEmployee(){
                  System.out.println("Liet ke danh sach nhan vien");
              }
          }
          class TechCompany extends Company{
              TechCompany(){
                  System.out.println("ham khoi tao cua TechCompany");
              }
              void upgrade(){
                  System.out.println("Tech company upgraded");
              }
          }
          public class Main2 {
              public static void main(String[] args) {
                  Company c = new TechCompany();
                  c.upgrade();
                  c.showEmployee();
                  c.setPostion("Hanoi");
                  System.out.println(c.getPostion());
              }
          }
          /*  Output:
          Ham khoi tao cua Company
          ham khoi tao cua TechCompany
          Tech company upgraded
          Liet ke danh sach nhan vien
          Hanoi */ 
          ```
     - Lớp trừu tượng có thể có phương thức trừu tượng hoặc phương thức cụ thể.

     - Lớp trừu tượng có thể có hàm khởi tạo: Do lớp trừu tượng thường không được tạo một cách trực tiếp nên hàm khởi tạo của lớp trừu tượng chính là hàm khởi tạo trong một hàm con cụ thể.
     - Lớp trừu tượng có thể được sử dụng để tạo Interface. 
     - Lớp con phải implement tất cả các phương thức trừu tượng của lớp cha.
### **3. Interface trong java**
  - **Định nghĩa:**
     - Interface trong Java là bản thiết kế của một lớp, nó chỉ chứa các phương thức trừu tượng.
     - Interface là một kỹ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java.
     -  Interface trong Java cũng biễu diễn mối quan hệ IS-A.
     -  Nó không thể được khởi tạo giống như lớp trừu tượng mà phải sử dụng từ khóa "Interface".
  -  **Tính chất của interface:**
     -  Không thể khởi tạo một object của interface.
     -  Interface không chứa hàm khởi tạo.
     -  Interface không chứa một trường nào ngoài trường vừa static và final.
     -  Một Interface không kế thừa từ lớp, nó được triển khai bằng lớp.
     - Một interface có thể kế thừa nhiều interface khác.
        -  Ví dụ:
            ```Java
              interface Animal{
                  void makeSound();
                  void selfClean();
              }
              interface Friend{
                  void  makeJoke();
              }
              class Cat implements Animal, Friend{
                  private int age;
                  private double weight;

                  @Override
                  public void makeSound() {
                      System.out.println("Gau");
                  }

                  @Override
                  public void selfClean() {
                      System.out.println("Meo lam sach");
                  }

                  @Override
                  public void makeJoke() {
                      System.out.println("Lam tro");
                  }
              }
              class Main {
                  public static void main(String args[])
                  {
                      Cat c = new Cat();
                      c.makeSound();
                      c.selfClean();
                      c.makeJoke();
                  }
              }
            ```
     -  Trừ khi một lớp triển khai interface là lớp trừu tượng, còn lại tất cả phương thức của interface cần được định nghĩa trong class.
        -  Ví dụ:
            ```Java
            interface Animal{
                void makeSound();
                void selfClean();
            }
            abstract class Dog implements Animal{
                double weight;
                int age;
            }
            class VietNamDog extends Dog{
                public void makeSound(){
                    
                };
                public void selfClean(){
                    
                };
            }
            ```
### 4. So sánh Interface và Abstract Class.
|Abstract Class |Interface |
|:--------|:----|
|Lớp trừu tượng có thể có các phương thức trừu tượng và không trừu tượng| Chỉ có phương thức trừu tượng
|Không hỗ trợ đa kế thừa| Hỗ trợ đa kế thừa|
|Có thể có các biến final, non-final, static và non-static |Chỉ có các biến static và final|
|Có thể implement interface | 	Không thể extents lớp abstract
|Từ khóa abstract được sử dụng để khai báo lớp trừu tượng |Từ khóa interface được sử dụng để khai báo giao diện
| Một lớp trừu tượng có thể extents một lớp Java khác và implement nhiều interface| Một interface chỉ có thể implement interface khác|
|Có thể được kế thừa bằng cách sử dụng từ khóa “extends”| Các lớp triển khai interface sử dụng từ khóa implements|
|Một lớp trừu tượng có thể có phạm vi truy cập là private, protected,… |Các phương thức của interface được mặc định là public|
### 5. Cách sử dụng của Interface và Abstract Class.
 - Khi một nhóm đối tượng có cùng bản chất kế thừa từ một class thì sử dụng abstract class. 
 - Khi một nhóm đối tượng không có cùng bản chất nhưng chúng có hành động giống nhau thì sử dụng interface.