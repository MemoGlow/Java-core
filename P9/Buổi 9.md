## Buổi 9: Xử lý ngoại lệ.
### 1. Các khái niệm liên quan.
- Exception: Exceptions là một sự kiện xảy ra khi một chương trình đang chạy (thực thi), sự kiện đó làm cho luồng xử lý thông thường của chương trình không thể thực hiện một cách bình thường, thậm chí chết chương trình.
- Cần phân biệt Exception với Error:
    - Error là các lỗi nghiêm trọng của chương trình.
    - Exception là lỗi chương trình được phát hiện và có thể xử lý.
- Phân loại exception:
    - Checked exception: là những exception phải xử lý ngay khi viết code, bởi nó được kiểm tra bởi chính trình biên dịch.
        - Ví dụ: ClassNotFoundException,...
    - Unchecked exception: là exception xảy ra khi chương trình chạy nghĩa là trình biên dịch không phát hiện ra biên dịch nên không thể xử lý khi viết code.
        - Ví dụ: NullPointerException, ArrayIndexOutOfBoundException,...
### 2. Xử lý exception.
1. **Xử lý ngoại lệ:**
    - Xử lý ngoại lệ trong Java là một cơ chế xử lý các lỗi runtime để có thể duy trì luồng hoạt động bình thường của ứng dụng.
    - Quá trình xử lý ngoại lệ được gọi là catch exception, nếu Runtime System không xử lý được ngoại lệ thì chương trình sẽ kết thúc.
1. **Quá trình xử lý của JVM:**
    - Khi một lỗi xảy ra trên một method, method đó sẽ tạo ra 1 object và đưa nó vào Runtime System (Object đó là Exception Object chứa tất cả thông tin về lỗi và trạng thái chương trình).
    - Runtime System sẽ tìm cách xử lý Exception phù hợp tại method ấy. Nếu không có thì sẽ tiếp tục tìm ở các method trên. Nếu không có method nào có xử lý ngoại lệ phù hợp thì Thread mà đang thực hiện chuỗi method xảy ra ngoại lệ bị ngắt. Nếu thread ấy là main thì ngắt chương trình.
1. **Xử lý ngoại lệ trong Java:**
    - Khối lệnh try trong java được sử dụng để chứa một đoạn code có thế xảy ra một ngoại lệ. Nó phải được khai báo trong phương thức.
    - Sau một khối lệnh try bạn phải khai báo khối lệnh catch hoặc finally hoặc cả hai.
1. **Sử dụng khối lệnh try, catch, final.**
    - Cú pháp:
    ``` java
    try{
        // Khối lệnh có thể ném ra ngoại lệ.
    }catch(Exception_class_name ex){
        // code xử lý ngoại lệ.
    }final{
        // code trong này luôn được thực thi.
    }
    ```
    - Luồng hoạt động của khối lệnh try catch finally.
        - **Trường hợp 1:** Chứa try-catch hoặc try-catch-finally. 
            - **Ngoại lệ có trong khối try và được xử lý trong khối catch:** 
                - Khi đó khối try sẽ không được thực thi mà lệnh ở khối catch sẽ được thực thi. 
                - Sau khi khối catch được thực thi thì khối finally (nếu có) sẽ được thực thi. Chương trình tiếp tục chạy như bình thường.   
            - **Ngoại lệ có trong khối try và không được xử lý trong khối catch:**
                - Khối finally (nếu có) sẽ được thực thi, sau đó sẽ được JVM xử lý.
            - **Ngoại lệ không có trong khối try.**
                - Khối catch block sẽ không được thực thi.
                - Khối finally (nếu có) sẽ được thực thi, sau đó chương trình tiếp tục chạy bình thường.
        - **Trường hợp 2:** chứa try-finally.
            - **Khi có ngoại lệ**
                - Lệnh trong final sẽ được thực thi, sau đó sẽ được JVM xử lý.
            - **Không có ngoại lệ**
                - Lệnh trong try, final được thực thi, sau đó là chương trình còn lại.


