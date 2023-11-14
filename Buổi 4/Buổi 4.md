##Buổi 4
### Tính đóng gói trong java.
- Khái niệm: 
    - Tính đóng gói trong java là kỹ thuật **ẩn giấu thông tin không liên quan** và **hiển thị ra thông tin liên quan**.
    - Mục đích chính của đóng gói trong java là **giảm thiểu mức độ phức tạp** của phát triển phẩn mềm.
- Tác dụng của đóng gói trong java:
    - Bạn có thể tạo lớp read-only hoặc write-only bằng việc cài đặt phương thức setter hoặc getter.
    - Bạn có thể kiểm soát đối với dữ liệu. Giả sử bạn muốn đặt giá trị của id chỉ lớn hơn 100 bạn có thể viết logic bên trong lớp setter.
    - Ví dụ:
    ```Java
    public class Student {
        private String name;
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    }

    class Test {
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Hehehehe");
            System.out.println(s.getName());
        }
    }
    ```
    Output:
    ```
    Hehehehe
    ```
### Tính kế thừa trong java.
 - Khái niệm: 
   - Kế thừa trong java là **sự liên quan giữa hai class** với nhau, trong đó có class cha (superclass) và class con (subclass).
   - Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha.
   - Tuy nhiên, nó chỉ được truy cập các thành viên public và protected của class cha. Nó không được phép truy cập đến thành viên private của class cha.
   - Tư tưởng của kế thừa trong java là có thể tạo ra một class mới được xây dựng trên các lớp đang tồn tại. Khi kế thừa từ một lớp đang tồn tại bạn có sử dụng lại các phương thức và thuộc tính của lớp cha, đồng thời có thể khai báo thêm các phương thức và thuộc tính khác.
 - Cú pháp kế thừa trong java
   - Sử dụng từ khóa extends để kế thừa.
   ```Java
    class Subclass-name extends Superclass-name {  
      //methods and fields
    }  
   ```
   - Ví dụ về tính kế thừa trong java.
   ```Java
   class Employee {
       float salary = 1000;
   }
    
   class Programmer extends Employee {
       int bonus = 150;
   }
    
   public class InheritanceSample1 {
       public static void main(String args[]) {
           Programmer p = new Programmer();
           System.out.println("Programmer salary is: " + p.salary);
           System.out.println("Bonus of Programmer is: " + p.bonus);
       }
   }
   ```
 - Các kiểu kế thừa trong java.
 ![](https://viettuts.vn/images/java/cac-kieu-ke-thua.jpg)
   - Đơn kế thừa: Một lớp chỉ được kế thừa từ đúng một lớp khác. Hay nói cách khác, lớp con chỉ có duy nhất một lớp cha.
   Ví dụ:
   ```Java
      public class Animal {
          public void eat() {
              System.out.println("eating...");
          }
      }
      
      public class Dog extends Animal {
          public void bark() {
              System.out.println("barking...");
          }
      }
      
      public class TestInheritance {
          public static void main(String args[]) {
              Dog d = new Dog();
              d.bark();
              d.eat();
          }
      }
   ```
   ```
   barking...
   eating...
   ```
   - Kế thừa nhiều tầng: Trong kiểu thừa kế này, một lớp dẫn xuất được tạo từ một lớp dẫn xuất khác.
   Ví dụ:
   ```Java
      public class Animal {
          public void eat() {
              System.out.println("eating...");
          }
      }
      
      public class Dog extends Animal {
          public void bark() {
              System.out.println("barking...");
          }
      }
      
      public class BabyDog extends Dog {
          public void weep() {
              System.out.println("weeping...");
          }
      }
      
      public class TestInheritance2 {
          public static void main(String args[]) {
              BabyDog d = new BabyDog();
              d.weep();
              d.bark();
              d.eat();
          }
      }
   ```
   ```
   weeping...
   barking...
   eating...
   ```
   - Kế thừa thứ bậc: Trong kiểu thừa kế này, sẽ có nhiều hơn một lớp con được kế thừa từ một lớp cha duy nhất.
   Ví dụ:   
    ```Java
    class Animal {
        public void eat() {
            System.out.println("eating...");
        }
    }
    
    class Dog extends Animal {
        public void bark() {
            System.out.println("barking...");
        }
    }
    
    public class Cat extends Animal {
        public void meow() {
            System.out.println("meowing...");
        }
    }
    
    public class TestInheritance3 {
        public static void main(String args[]) {
            Cat c = new Cat();
            c.meow();
            c.eat();
        }
    }
    ```
    ```
    meowing...
    eating...  
    ```
### Tính đa hình.
 - Tính đa hình ( Polymorphism ) là một khái niệm mà chúng ta có thể thực hiện một công việc bằng nhiều cách khác nhau.
 - Có hai kiểu đa hình trong java đó là đa hình lúc thực thi ( runtime ) và đa hình trong lúc biên dịch ( compile ).
   - Đa hình lúc thực thi ( runtime ). Tính đa hình này được sử dụng bằng cách ghi đè (overriding).
     - Overriding là quá trình gọi phương thức đã được ghi đè trong thời gian thực thi chương trình. Trong quá trình này, một phương thức được ghi đè được gọi thông qua một biến tham chiếu của lớp cha.
     - Ví dụ:
     ```Java
      class Bike {
          void run() {
              System.out.println("running");
          }
      }
      
      public class Splender extends Bike {
          void run() {
              System.out.println("running safely with 60km");
          }
      
          public static void main(String args[]) {
              Bike b = new Splender();// upcasting
              b.run();
          }
      }
     ```
     ```
     running safely with 60km
     ```
   - Đa hình trong lúc biên dịch (compile). Tính đa hình được sử dụng bằng cách nạp chồng hàm (overloading).
     - Nạp chồng hàm: Ta có thể sử dụng cùng một tên gọi cho các hàm "Giống nhau" (cùng mục đích) nhưng phải khác nhau về kiểu dữ liệu tham số hoặc số lượng tham số.
     - Nạp chồng hàm cho phép ta khai báo và định nghĩa các hàm trên với cùng một tên gọi.
     - Ví dụ:
      ```Java
      class Student{
         String name;
         int age;
         Student(){
             System.out.println("Constructor mac dinh");
         }
         Student(String name, int age){
             this.name = name;
             this.age = age;
         }
      };
      ```


