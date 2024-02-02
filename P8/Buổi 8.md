<!-- Cấu trúc dữ liệu là gì, sử dụng khi nào?
Interface Iterable, Collection -> List, Set, Queue.
Interface Map, SortedMap -> HashMap, TreeMap.
Sử dụng một số hàm của cấu trúc dữ liệu như sort. -->
<!-- Framework trong java là phần thân của những đoạn code được viết sẵn mà chúng ta có thể thêm code vào để giải quyết vấn đề. Chúng ta có thể sử dụng framework bằng cách gọi các phương thức, kế thừa, callbacks, listener or other implementations of the Observer pattern. -->
## 1. Cấu trúc dữ liệu trong Java.
   - Cấu trúc dữ liệu là cách mà chúng ta sắp xếp, thao tác, truy cập, và lưu trữ dữ liệu.
   - Cấu trúc dữ liệu có nhiều dạng đơn giản và phức tạp, thường được sử dụng để tổ chức dữ liệu tùy theo cách sử dụng nhất định.
   - Cấu trúc dữ liệu giúp chúng ta truy cập và sử dụng dữ liệu một cách dễ dàng hơn.
   - Sơ đồ cấp bậc.
     ![Alt text](image-3.png)
## 2. Interface iterable, Collection, List, Set, Queue.
  1. **Iterable interface.**
      - **Tổng quan Iterable interface.**
         - Iterable interface trong Java cung cấp cho chúng ta khả năng duyệt qua các phần tử của Collection một cách tuần tự.
         - Các phần tử của collections như mảng, sets, queues, maps,... cũng có thể duyệt qua một cách dễ dàng sử dụng Iterable interface.
         - Bằng cách sử dụng **iterator**, chúng ta có thể truy cập các phần tử trong collection. 
      - **Hệ thống phân cấp.**
      
      ![Collections Hiearachy](image-2.png)  
      - **Về Iterator và Iterable:**
         - Mỗi class mà implement interface Iterable đều được ghi đè phương thức Iterator(). 
         - Phương thức Iterator này gọi interface Iterator và trả về interface Iterator.
         - Iterator được sử dụng để duyệt qua các object của class.
         - Các phương thức của Iterator:
            |Phương thức| Mô tả|
            |:----------|:----|
            |public boolean hasNext()| Trả về true nếu còn phần tử kế tiếp của phần tử đang duyệt|
            |public object next| Trả về phần tử hiện tại và di chuyển đến phần tử tiếp theo|
            |public void remove()| Loại bỏ phần tử cuối được trả về Iterator|
      - Các phương thức của Iterable:
         |Phương thức|Mô tả|
         |:----|:----|
         |void forEach()|Các phần tử của Iterabel sẽ được duyệt qua cho đến khi không còn phần tử nào để duyệt hoặc phương thức này trả về một ngoại lệ|
         |Iterator<T> iterator()|Hàm Iterator() trả về một interface Iterator được sử dụng để duyệt phần tử hoặc một số thao tác nào đó|
         |Spliterator<T> spliterator()|Tạo ra Spliterator qua một số phần tử. Spiterator được sử dụng để duyệt hoặc phân chia các phần tử của Collection (mảng, set, tree).|
      - Các cách duyệt qua các phần tử của Iterable.
         -  Sử dụng vòng lặp for-each.
            - Ví dụ:
            ```Java
            public class Main {
               public static void main(String[] args) {
                  List<String> pet = new ArrayList<>();
                  pet.add("Dog");
                  pet.add("Cat");
                  pet.add("Elephant");
                  Iterator<String> it = pet.iterator();
                  for(String p : pet){
                        System.out.println(p);
                  }
               }
            }
            ```
            ```
            Output:
            Dog
            Cat
            Elephant
            ```
         -  Sử dụng Iterator.
            - Ví dụ:
            ```Java
            public class Main {
               public static void main(String[] args) {
                  List<String> pet = new ArrayList<>();
                  pet.add("Dog");
                  pet.add("Cat");
                  pet.add("Elephant");
                  Iterator<String> it = pet.iterator();
                  while(it.hasNext() == true){
                        String p = it.next();
                        System.out.println(p);
                  }
               }
            }
            ```
            ```
            Output:
            Dog
            Cat
            Elephant
            ```
         -  Sử dụng phương thức forEach().
            -  Ví dụ:   
            ``` Java
            public class Main {
               public static void main(String[] args) {
                  List<String> pet = new ArrayList<>();
                  pet.add("Dog");
                  pet.add("Cat");
                  pet.add("Elephant");
                  Iterator<String> it = pet.iterator();
                  pet.forEach((n) ->{
                        System.out.print(n);
                        System.out.println(" is pet");
                  });
               }
            }
            ```
            ```
            Output:
            Dog is pet
            Cat is pet
            Elephant is pet
            ```
   2. **Collection trong Java.**
      - **Tổng quan Collection interface.**
        <!-- - Phân biệt collections và c**ollection
        - Collections trong Java là một framework dùng để cung cấp các kiến trúc để lưu trữ và thao tác với tập các phần tử.
        - Collection cung cấp cho chúng ta nhiều thao tác như tìm kiếm, sắp xếp, chèn, ... -->
        - Collection interface kế thừa từ Iterable interface.
        - Tất cả các class trong Collection đều implement Collection interface. Các class này đều chứa các phương thức của Collection interface.

      - **Các phương thức của Collection interface.**
        |Phương thức|Mô tả|
        |:---|:---|
        |public boolean add(Object element)| Được sử dụng để chèn một phần tử vào collection.|
        |public boolean addAll(Collection c)|chèn các phần tử của một collection c nào đó|
        |public boolean remove(Object element)|Được sử dụng để xóa phần tử từ collection.|
        |public boolean removeAll(Collection c)|Được sử dụng để xóa tất cả các phần tử của collection được chỉ định từ collection gọi phương thức này.|
        |public boolean retainAll(Collection c)|Được sử dụng để xóa tất cả các thành phần từ collection gọi phương thức này ngoại trừ collection được chỉ định.|
        |public int size()|Trả lại tổng số các phần tử trong collection.|
        |public void clear()|Loại bỏ tổng số của phần tử khỏi collection.|
        |public boolean contains(Object element)|Được sử dụng để tìm kiếm phần tử.|
        |public boolean containsAll(Collection c)|Được sử dụng để tìm kiếm collection được chỉ định trong collection.|
        |public Iterator iterator()|Trả về một iterator.|
        |public Object[] toArray()|Chuyển đổi collection thành mảng (array).|
        |public boolean isEmpty()|Kiểm tra nếu collection trống.|
        |public boolean equals(Object element)|So sánh 2 collection.|
        |public int hashCode()|Trả về số hashcode của collection.|
   3. **List, Set, Queue.**
      1. **List interface.**
         - **Định nghĩa:**
           - List là một interface trong java. Nó chứa các phương thức để chèn và xóa dựa trên chỉ số index.
           - List được triển khai bởi:
             - ArrayList.
             - LinkedList.
             - Vector.
             - Stack.
             - ArrayDequeue.
         - **Các phương thức của List interface.**
            |Phương thức |Mô tả| 
            |:---|:---|
            |void add(int index,Object element)| Nó được sử dụng để chèn các phần tử vào list tại chỉ số index.|
            |boolean addAll(int index,Collection c)| Nó được sử dụng để chèn tất cả các yếu tố của c vào danh sách tại chỉ số index.|
            |object get(int index)| Nó được sử dụng để trả về đối tượng được lưu trữ tại chỉ số index trong list.|
            |object set(int index,Object element)| Nó được sử dụng để gán phần tử cho vị trí được chỉ định index trong list.|
            |object remove(int index)| Nó được sử dụng để xóa các phần tử tại vị trí có chỉ số index và trả về phần tử đã xóa.|
            |ListIterator listIterator()| Nó được sử dụng để trả về một Iterator mà bắt đầu từ phần tử đầu tiên của list.|
            |ListIterator listIterator(int index)| Nó được sử dụng để trả về một Iterator mà phần tử bắt đầu từ chỉ số index chỉ định.|
            Ví dụ:
            ```Java
            public class Main {
               public static void main(String[] args) {
                  List<String> pet = new ArrayList<>();
                  pet.add("Dog");
                  pet.add("Cat");
                  System.out.println(pet.get(0));
                  String s = new String("Elephant");
                  pet.set(0, s);
                  System.out.println(pet.get(0));
                  pet.remove(0);
                  System.out.println(pet.get(0));
               }
            }
            ```
            ```
            Output:
            Dog
            Elephant 
            Cat
            ```

         - **ListIterator:**
            - ListIterator được sử dụng để duyệt các phần tử trong List của Java.
            - Các phương thức của ListIterator:
              |Phương thức| Mô tả|
              |:---|:---|
              |boolean hasNext()| Phương pháp này trả về true nếu list interator có tồn tại phần tử kế tiếp phần tử hiện tại.|
              |Object next()| Phương thức này trả về phần tử kế tiếp trong danh sách và vị trí con trỏ tăng lên 1.|
              |boolean hasPrevious()| Phương pháp này trả về true nếu list interator có tồn tại phần tử phía trước phần tử hiện tại.|
              |Object previous()| Phương thức này trả về phần tử kế sau trong danh sách và vị trí con trỏ giảm đi 1.|
      2. **Set interface.**
         - **Định nghĩa:** 
            - Set là một interface kế thừa Collection interface trong java. Set trong java là một Collection không thể chứa các phần tử trùng lặp.
            - Set được triển khai bởi HashSet, LinkedHashset, Treeset hoặc EnumSet.
              - HashSet lưu trữ các phần tử của nó trong bảng băm.
              - TreeSet lưu trữ các phần tử của nó trong một cây.
              - LinkedHashSet được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, các phần tử được sắp xếp theo thứ tự chèn.
              - EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum.
         - **Các phương thức của Set interface:**
            |Phương thức|Mô tả|
            |:---|:---|
            |boolean add(Object element)| Chèn các phần tử vào set.|
            |boolean addAll(Collection c)| Chèn tất cả các phần tử của c vào set.|
            |void clear()| Xóa tất cả các phần tử khỏi set.|
            |boolean contains(Object element)| Trả về true nếu tập hợp này chứa phần tử đã chỉ định.|
            |boolean containsAll(Collection c)| Trả về true nếu set chứa tất cả các phần tử của collection c đã chỉ định.|
            |boolean equals(Object o)| So sánh các đối tượng được chỉ định với set.|
            |boolean isEmpty()| Trả về true nếu set không chứa phần tử.|
            |int hashCode()| Trả về giá trị mã băm|
            |Iterator iterator()| Trả về một trình vòng lặp iterator để duyệt qua các phần tử của set.|
            |boolean remove(Object o)| Xóa phần tử đã chỉ định khỏi set.|
            |boolean removeAll(Collection c)| Xóa khỏi set tất cả các phần tử của nó được chứa trong collection c đã chỉ định.|
            |boolean retainAll(Collection c)| Chỉ giữ lại các phần tử trong set được chứa trong collection c đã chỉ định.|
            |int size()| Trả về số lượng các phần tử của set.|
            |Object[] toArray()| Trả về một mảng chứa tất cả các phần tử trong set.|
            |T[] toArray(T[] a)| Trả về một mảng chứa tất cả các phần tử trong set, kiểu run-time của mảng trả về là kiểu đã chỉ định.|
         - Ví dụ:
            ```Java
            public class Main {
               public static void main(String[] args) {
                  Set<Integer> st = new HashSet<>();
                  st.add(1);
                  st.add(2);
                  st.add(3);
                  st.add(1);
                  for(Integer x : st){
                        System.out.print(x + " ");
                  }
               }
            }
           ```   
           ```
           Output:
           1 2 3
           ```
      3. **Queue interface.**
         - **Tổng quan:**
           - Queue là một interface kế thừa từ Collection interface. Queue được sử dụng để lưu trữ dữ dữ liệu theo thứ tự FIFO (first in first out).
           - Queue được triển khai bới các class: 
             - PriorityQueue: được sử dụng để truy cập các object theo thứ tự ưu tiên.
             - ArrayDequeue.
         - **Các phương thức của interface Queue:**
            |Phương thức| Mô tả|
            |:---|:---|
            |add(int index, element)|Thêm phần tử tại vị trí index của Queue|
            |addAll(int index, Collection collection)|Thêm tất cả các phần tử của collection có sẵn vào queue. |
            | size()|Trả về kích thước queue|
            |clear()|Xóa tất cả các phần tử của queue|
            |remove()|Xóa phần tử tại đầu queue|
            |remove(int index)|Xóa phần tử tại chỉ số index của queue, sau đó dịch chuyển các phần tử còn lại|
            |remove(element)|xóa bỏ phần tử|
            |get(index)|trả về phần tử tại index|
            |set(int index, element)|thay phần tử tại index bằng một phần tử khác|
         - Ví dụ:
            ```Java
            public class Main {
               public static void main(String[] args) {
                  Queue<String> q = new ArrayDeque<>();
                  q.add("Xin chao");
                  q.add("Tam biet");
                  q.add("Vinh biet");
                  for(String s : q){
                        System.out.print(s + " ");
                  }
                  System.out.println();
                  q.remove();
                  for(String s : q){
                        System.out.print(s + " ");
                  }
                  System.out.println();
               }
            }
            ```
            ```
            Output:
            Xin chao Tam biet Vinh biet 
            Tam biet Vinh biet 
            ```

## 4. Map interface, SortedMap.
1. **Map interface.**
   - **Tổng quan**
      - Map interface cho phép chúng ta quản lý dữ liệu theo cặp key-value trong đó key là duy nhất và tương ứng với key là một giá trị value.
      - Map interface được triển khai bới các class:
        - HashMap: không duy trì tính thứ tự của các phần tử.
        - LinkedHashMap: Kế thừa HashMap, được sắp xếp theo thứ tự chèn phần tử.
        - Treemap: được triển khai bởi Map và SortedMap, có duy trì thứ tự các phần tử tăng dần.
      - Do Map không thể truy cập nên chúng ta phải chuyển sang Set sử dụng phương thức keySet() hoặc entrySet().
   ![Alt text](image-4.png) 
   - **Các phương thức của Map interface:**
     |Phương thức| Mô tả|
     |:---|:---|
     |Object put(Object key, Object value)|Chèn một mục nhập trong map hiện tại.|
     |void putAll(Map map)|Chèn map chỉ định vào map hiện tại|
     |Object remove(Object key)|Xóa mục nhập của key chỉ định|
     |Object get(Object key)|trả lại giá trị cho khóa chỉ định|
     |boolean containsKey(Object key)| Sử dụng để tìm kiếm key được chỉ định từ map hiện tại|
     |Set keySet()|Trả đối tượng Set có chứa tất cả các key|
     |Set entrySet()| Trả lại đối tượng Set có chứa tất cả các keys và values|
     - Ví dụ:
     ```Java
     public class Main {

        public static void main(String[] args) {
           Map<Integer, String> mp = new HashMap<>();
           mp.put(1, "D");
           mp.put(2, "F");
           mp.put(-1, "G");
           Set<Integer> st = mp.keySet();
           for(Integer x : st){
                 System.out.println(x + " " + mp.get(x));
           }
        }
     }
     ```
     ```
     Output:
     -1 G
      1 D
      2 F
     ```
   - **Map.Entry Interface**
     - Entry là một interface con của Map. Vì vậy, chúng ta được truy cập nó bằng tên Map.Entry. Nó cung cấp các phương pháp để truy xuất các key và value.
     - Các phương thức của Map.Entry interface:
       |Phương thức| Mô tả|
       |:---|:---|
       |Object getKey()|Sử dụng để lấy key|
       |Object getValue()|Sử dụng để lấy value|.
      - Ví dụ
      ```Java
      public class MapExample3 {
         public static void main(String args[]) {
            // init map
            Map<Integer, String> map = new HashMap<Integer, String>();
            // add elements to map
            map.put(1, "Java");
            map.put(3, "C++");
            map.put(2, "PHP");
            map.put(4, "Python");
            // show map
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                  System.out.println(entry.getKey() + " " + entry.getValue());
            }
         }
      }
      ```
      ```
      Output:
      1 Java
      2 PHP
      3 C++
      4 Python
      ```
2. **SortedMap interface**
   - Tổng quan:
     - SortedMap interface được kế thừa từ Map interface nên nó có những đặc điểm của Map như các cặp key - value.
     - SortedMap có điểm vượt trội hơn so với Map là các entry có trong SortedMap được sắp xếp theo thứ tự tăng dần của khóa.
     - Các phương thức của SortedMap interface:
         |Phương thức|Mô tả|
         |:---|:---|
         |comparator()| Trả về phương thức để so sánh các key trong map.|
         |firstKey()| Trả về key đầu tiên của Map.|
         |lastKey()| Trả về key cuối của Map.|
         |headMap(key)| Trả về tất cả các entry của Map mà có key nhỏ hơn key đã cho|
         |tailMap(key)|Trả về tất cả các entry của Map mà có key lớn hơn hoặc bằng key đã cho|
         |subMap(key1, key2)| trả về tất cả các entry có giá trị key từ key1 đến key2|
     - Ví dụ:
         ```Java
        public class Main {
           public static void main(String[] args) {
              TreeMap<String, Integer> mp = new TreeMap<>();

              // Adding elements to the tree map
              mp.put("A", 1);
              mp.put("C", 3);
              mp.put("B", 2);
              // Getting values from the tree map
              String s = mp.lastKey();
              System.out.println(s + " " + mp.get(s));
           }
        }
         ```
         ```
         Output:
         C 3
         ```

## 5. Sorting trong Collection.
- Lớp Collections trong java cung cấp các phương thức static để sắp xếp các phần tử của collection. 
- Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap.
- Phương thức Collections.sort(List list).
  - Chúng ta có thể sử dụng phương thức Collections.sort(List list) để sắp xếp các phần tử của List.
  - Tuy nhiên để có thể so sánh được thì các phần tử của List phải là kiểu Comparable. Nghĩa là các phần tử phải được implements Comparable interface.
- Ví dụ:
  - Sắp xếp int:
      ```Java
      public class Main {

         public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(10);
            list.add(3);
            list.add(6);
            for(int x : list){
                  System.out.print(x + " ");
            }
            System.out.println();
            Collections.sort(list);
            for(int x : list){
                  System.out.print(x + " ");
            }
            System.out.println();
         }
      } 
      ```
      1 10 3 6
      1 3 6 10
      ```
      Output:

      ```
  - Ví dụ sắp xếp String:
      ```Java
      public class Main {
         public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("1");
            list.add("3");
            list.add("6");
            list.add("10");
            for(String x : list){
                  System.out.print(x + " ");
            }
            System.out.println();
            Collections.sort(list);
            for(String x : list){
                  System.out.print(x + " ");
            }
            System.out.println();
         }
      }
      ```
      ```
      Output:
      1 3 6 10
      1 10 3 6
      ```
   - Ví dụ về sắp xếp các đối tượng người dùng tự định nghĩa:
     - Cách 1: Sử dụng Comparable interface.
      ```Java
         public class SinhVien implements Comparable<SinhVien> {
            private String name, msv;
            private double gpa;

            public SinhVien(String name, String msv, double gpa) {
               this.name = name;
               this.msv = msv;
               this.gpa = gpa;
            }

            @Override
            public int compareTo(SinhVien o) {
               return this.getName().compareTo(o.getName());
            }
            //getter & setter
         }
         public class Main {
            public static void main(String[] args) {
               List<SinhVien> list = new ArrayList<>();
               list.add(new SinhVien("AB", "001", 3.2));
               list.add(new SinhVien("AAA", "003", 3.0));
               list.add(new SinhVien("BCB", "002", 2.0));
               Collections.sort(list);
               for(SinhVien sinhVien : list){
                     System.out.println(sinhVien.getName()); // AAA AB BCB
               }
            }
         }
      ```
     - Cách 2: Tạo đối tượng Comparator để cài đặt phương thức compare(). Phải cài đặt tiêu chí để phương thức so sánh compare() để so sánh các đối tượng với nhau.
      ```Java
         public class SinhVien{
            private String name, msv;
            private double gpa;

            public SinhVien(String name, String msv, double gpa) {
               this.name = name;
               this.msv = msv;
               this.gpa = gpa;
            }
         }
         public class Main {
            public static void main(String[] args) {
               List<SinhVien> list = new ArrayList<>();
               list.add(new SinhVien("AB", "001", 3.2));
               list.add(new SinhVien("AAA", "003", 3.0));
               list.add(new SinhVien("BCB", "002", 2.0));
               Collections.sort(list, new Comparator<SinhVien>() {
                     @Override
                     public int compare(SinhVien o1, SinhVien o2) {
                        return o1.getMsv().compareTo(o2.getMsv());
                     }
               });
               for(SinhVien sinhVien : list){
                     System.out.println(sinhVien.getMsv()); // 001 002 003
               }
            }
         }
      ```

