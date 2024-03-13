# Thư viện đồ họa Swing.
## Thư viện đồ họa Swing cơ bản.
    - Khái niệm: Java Swing là một phần của Java Foundation Class (JFC) được sử dụng để tạo ccacs ứng dụng window-based. Nó được xây dựng trên API AWT (Abstract Windowing Toolkit) và được viết hoàn toàn bằng Java.
    - JFC là một bộ các thành phần GUI đơn giản hóa sự phát triển của các ứng dụng desktop.
    - Phân cấp các lớp Java Swing.
    ![Phân lớp Java Swing](image-2.png)
    - Một số phương thức thường dùng:
        - public void add(Component c): thêm một thành phần vào thành phần khác.
        - public void setSize(int width, int height): thiết lập kích thước của thành phần.
        - public void setLayout(LayoutManager m): thiết lập trình quản lý bố cục cho thành phần.
        - public void setVisible(boolean b): thiết lập khả năng hiển thị của thành phần. Mặc định là false (ẩn).
        - Ví dụ:
        ```Java 
        public class Main {
            public static void main(String[] args) {
                JFrame frame = new JFrame();
                frame.setSize(350, 200);
                frame.setTitle("Day la vi du");
                JButton button = new JButton();
                button.setText("Click vao vi du");
                button.setBounds(50, 50, 200, 50);
                frame.add(button);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        }
        ```
        ![Ảnh output ví dụ](image-3.png)
## JFrame, JButton, JLabel, JTextField, JTable, JList
### JFrame
    - Lớp JFrame là một container trong ứng dụng Java Swing, nó được dùng để chứa và sắp xếp các thành phần con như Button, Label, TextField. 
    - Các thao tác với JFrame.
        - Tạo một JFrame.
        - Xử lý khi JFrame bị đóng.
        - Chiều cao, chiều rộng và vị trí của JFrame trên Desktop.
        - Cài dặt LayoutManager cho JFrame.
        - Thêm các component con vào JFrame.
        - Cấu hình kích thước JFrame.
        - Xử lý sự kiện trong JFrame.
### JButton
    - Button là một control được sử dụng nhiều trong Java.
    - Các thao tác với JButton.
        - Tạo Button.
        - Tạo Button và xử lý sự kiện.
        - Tạo Button với Icon.
        - Xử lý sự kiện trong Button.
        - Tạo phím tắt, ghi nhớ cho Button.
        - Tùy biến giao diện Button.
### JLabel
    - JLabel có thể hiển thị text hoặc hình ảnh hoặc cả hai.
    - Các thao tác với JLabel.
        - Tạo Label.
        - Mnemonic Key.
        - Label với HTML.
        - Căn chỉnh văn bản.
        - Tạo Border.
        - Vô hiệu hóa Label.
### JTextField
    - JTextField là component cho phép nhập và chỉnh sửa đoạn văn bản trên cùng một dòng.
    - Các thao tác với JTextField.
        - Tạo JTextField.
        - Lấy String trong JTextField.
        - Tạo Tooltip trong JTextField.
        - Focus vào một JTextField.
        - Xử lý sự kiện trong JTextField.
        - Select các ký tự trong JTextField.
### JTable
    - JTable được sử dụng để hiển thị và chỉnh sửa dữ liệu kiểu dạng Table.
    - Một số thao tác trong JTable.
        - Khởi tạo và tùy biến JTable.
        - Sắp xếp trong JTable.
        - Filter trong JTable.
### JList
    - Jlist được sử dụng để hiển thị một tập hợp các phần tử và cho phép người dùng có thể chọn hoặc nhiều phần tử trong số chúng.
    - Một số thao tác trong JList.
        - Tạo JList đơn giản.
        - Xử lý sự kiện trong JList.
        - Tạo JList Scroll trong Java Swing.
        - Multiple select trong JList.
        - Custom JList để hiện thị một Object.
        - Tạo JList với các phần tử là checkbox.
## BorderLayout, FlowLayout, GridLayout
### BorderLayout.
    - BorderLayout tổ chức các thành phần con thành 5 vùng NORTH, SOUTH, EAST, WEST and CENTER. Ở mỗi vùng chỉ có thể chứa tối đa một thành phần con, khi thêm các phần tử khác nhau vào BorderLayout bạn cần chỉ định 1 trong 5 vùng trên.
    ![Minh họa BorderLayout](image-4.png)
### FlowLayout.
    - FlowLayout bố trí các thành phần con theo hướng từ trái sang phải hoặc từ phải sang trái trên cùng một dòng. Nếu tất cả các thành phần con không thể chứa trên cùng một dòng so với chiều dài tối đa của container thì chúng sẽ được sắp xếp trên một hàng mới.
### GridLayout.
    - GridLayout được sử dụng để bố trí các thành phần trong một lưới hình chữ nhật, lưới này đã được chia thành các hình chữ nhật có kích thước bằng nhau và một thành phần được đặt trong mỗi hình chữ nhật. Chúng ta có thể khởi tạo GridLayout thông qua các constructor sau:
## Graphics2D, Image.
    - 
