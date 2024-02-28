# Nhập xuất file, unit test.
## Xử lý file trong Java.
1. Xử lý file trong java.
    - Các class thường được sử dụng để xử lý file là:
        - **File**: thể hiện một file hoặc đường dẫn và cung cấp các phương thức để làm việc với file.
        - **FileInputStream** và **FileOutputStream**: Sử dụng để đọc ghi file nhị phân.
        - **FileReader** và **FileWriter**: Sử dụng để đọc ghi file dạng văn bản.
1. Các thao tác với file trong Java.
    1. Một số phương thức của class File.
        |Phương thức|Mô tả|
        |---|---|
        |createNewFiile()| Tạo file mới|
        |canRead()|Kiểm tra khả năng đọc file|
        |canWrite()|Kiểm tra khả năng ghi file|
        |delete()|Xóa file|
        |exists()|Kiểm tra sự tồn tại của file
        - Một số ví dụ.
            - Tạo file.
            ```Java
            
            ```
            - Xóa file.
    2. Đọc và ghi file trong Java.
        - File nhị phân.
            - Ta sử dụng class **FileInputStream** để đọc file.
            ```Java
            
            ```
            - Ta sử dụng class **FileOutputStream** để ghi file.
            ```Java

            ```
        - File văn bản:
            - Ta sử dụng class **FileReader** để đọc file.
            ```Java
            
            ```
            - Ta sử dụng class **FileWriter** để ghi file.
            ```Java
            
            ```
## Assertions
- Tổng quan:
    - Câu lệnh Assertion giúp phát hiện lỗi bằng cách kiểm tra đoạn code mà người lập trình cho là đúng.
    - Ta có thể sử dụng Assertion trong Java bằng cách sử dụng từ kháo assert.
    - Khi thực thi assertion, mặc định sẽ được cho là đúng. Nếu sai thì JVM sẽ ném ra AssertionError.
    - Thông thường, assertion thường bị tắt, để chạy được ta phải thực hiện câu lệnh trong terminal.
        Ta sử dụng cú pháp.         
        ```bash
        java -ea class-name.java
        ```
        - Ví dụ: đối với class Main.
        ```Java
        public class Main {
            public static void main(String[] args) {
                int a = 20;
                assert a <= 15;
                System.out.println("a is " + a);
            }
        }
        ```
        - Khi ta sử dụng Assertion.
        ![alt text](image.png)
        - Khi ta không sử dụng Assertion.
        ![alt text](image-1.png)
- Cách sử dụng Assertion.
    - Đảm bảo rằng các đoạn code không thể đạt được không thể đạt được.
    - Đảm bảo các giả thiết trong comment là đúng.
    - Vị trí sử dụng Assertions.
        - Nên sử dụng assertion ở.
            - Các đối số của hàm private. Các đối số này chỉ được cung cấp bởi lập trình viên và lập trình viên đó muốn kiểm tra các giả thiết của mình.
            - Các câu điều kiện.
            - Điều kiện tại phần mở đầu của các phương thức.
        - Không nên sử dụng Assertions ở.
            - Không nên sử dụng Assertions để thay thế thông báo lỗi.
            - Không nên sử dụng để kiểm tra lỗi ở các phương thức public bởi chúng có thể gây ra do người dùng. Khi đó chúng ta nên để người dùng tự xử lý lỗi.
            - Assertions không nên sử dụng trên các tham số do người dùng nhập.
## Unit test.
- Khái niệm:
    - Trong kiểm thử phần mềm có 4 mức độ: Unit test ( kiểm thử mức đơn vị), Intergration test ( kiểm thử tích hợp), System test (kiểm thử hệ thống), Acceptance test (kiểm thử chấp nhận).
    - Unit test là mức độ kiểm thử nhỏ nhất trong quá trình trên. Unit test bao gồm kiểm thử method, class, module,...
    - Unit test được thực hiện bởi lập trình viên.
- Lợi ích của Unit test.
    - Viết Unit test tốt giúp tăng sự tin tưởng vào mã nguồn được thay đổi hoặc bảo trì.
    - Kiểm thử từng thành phần riêng rẽ của dự án mà không cần đợi các thành phần khác hoàn thành.
    - Dễ dàng khoanh vùng và sửa chữa do thực hiện kiểm thử trên từng đơn vị nhỏ và các module riêng rẽ.
    - Có thể tái sử dụng.
    - Chi phí cho Unit test ít hơn.
    - Mã nguồn tốt nếu viết Unit test tốt.
    
        


