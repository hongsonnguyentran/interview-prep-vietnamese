# Arrays - Mảng

## 1. Mảng là gì?

- Mảng là cấu trúc dữ liệu cơ bản nhất và quan trọng trong DSA, nằm trong loại cấu trúc dữ liệu tuyến tính (linear data structure)
- Mảng dùng để lưu trữ 1 tập hợp các phần tử có cùng kiểu dữ liệu trong các ô nhớ liên tiếp.

**Tại sao Mảng quan trọng trong DSA?**
- **Nền tảng cho các CTDL phức tạp**: Hàng đợi, Ngăn xếp, Bảng băm, Cây heap... đều được xây dựng dựa trên mảng.
- **Hiệu suất truy cập**: Truy cập phần tử bằng chỉ số có độ phức tạp O(1) (hằng số) - cực kỳ nhanh.
- **Hiểu về bộ nhớ**: Giúp bạn hình dung rõ ràng về cách dữ liệu được sắp xếp trong bộ nhớ (RAM).

## 2. Cú pháp và khai báo đơn giản

Có 2 cách khai báo phổ biến:

```java
// Cách 1: Khai báo rồi cấp phát bộ nhớ sau
int[] myArray; // Khai báo một mảng số nguyên
myArray = new int[5]; // Cấp phát bộ nhớ cho 5 phần tử

// Cách 2: Khai báo và khởi tạo ngay lập tức
int[] myArray = new int[5]; // Mảng 5 phần tử, giá trị mặc định là 0
String[] names = new String[3]; // Mảng 3 phần tử, giá trị mặc định là null

// Cách 3: Khai báo và gán giá trị trực tiếp
int[] primes = {2, 3, 5, 7, 11};
```

**Lưu ý quan trọng**:
- **Chỉ số (index)** bắt đầu từ **0**, không phải **1**.
- Phần tử đầu tiên là `myArray[0]`, phần tử cuối cùng là `myArray[myArray.length - 1]`.

## 3. Đặc điểm then chốt từ góc độ DSA

**a. Kích thước Cố định (Fixed Size)**

- Kích thước mảng được xác định ngay khi tạo và **không thể thay đổi**.
- **Ưu điểm**: Quản lý bộ nhớ đơn giản, dự đoán được.
- **Nhược điểm**: Lãng phí bộ nhớ nếu khai báo thừa, hoặc không đủ chỗ nếu thiếu. Đây là lý do cho sự ra đời của `ArrayList`.

**b. Vùng nhớ Liên tiếp (Contiguous Memory)**
- Các phần tử được lưu trong các ô nhớ kế tiếp nhau.
- **Ưu điểm**: Cho phép tính địa chỉ phần tử một cách dễ dàng: `Địa_chỉ_phần_tử_i = Địa_chỉ_đầu + i * kích_thước_kiểu_dữ_liệu.`

    -> Đây là lý do tại sao truy cập bằng chỉ số lại nhanh đến vậy - `O(1)`.

**c. Truy cập Ngẫu nhiên (Random Access)**

Có thể truy cập ngay đến bất kỳ phần tử nào nếu biết chỉ số của nó.

```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[2]); // In ra 30 (O(1))
```

## 4. Độ phức tạp Thuật toán (Time Complexity) với Mảng

Đây là phần quan trọng nhất khi học DSA. Giả sử mảng có n phần tử.


| **Thao tác**                        | **Độ phức tạp** | **Giải thích**                                           |
|------------------------------------|-----------------|-----------------------------------------------------------|
| Truy cập (`arr[i]`)                | O(1)            | Tính toán địa chỉ trực tiếp.                             |
| Tìm kiếm phần tử chưa sắp xếp      | O(n)            | Phải duyệt qua từng phần tử (tìm kiếm tuyến tính).       |
| Tìm kiếm phần tử đã sắp xếp        | O(log n)        | Có thể dùng tìm kiếm nhị phân.                           |
| Thêm/Xóa ở cuối mảng               | O(1)   or O(N)  | Nếu biết trước vị trí cuối.                              |
| Thêm/Xóa ở đầu hoặc giữa mảng      | O(n)            | Phải dịch chuyển tất cả các phần tử phía sau.            |
| Cập nhật phần tử                   | O(1)            | Nếu biết chỉ số.                                         |

**Ví dụ minh họa cho Thêm/Xóa:**
```java
// Giả sử muốn xóa phần tử tại index = 1 khỏi mảng {10, 20, 30, 40}
for (int i = 1; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1]; // Dịch chuyển các phần tử lên
}
// Mảng sau khi xóa: {10, 30, 40, 40} (cần xử lý phần tử cuối)
// Thao tác dịch chuyển này có độ phức tạp O(n).
```

## 5. Ứng dụng Thực tế trong DSA & Java

Mảng là "gạch xây" cho vô số cấu trúc và thuật toán:

**1. Triển khai các CTDL:**

- **Danh sách (List)**: `ArrayList` về bản chất là một mảng động.
- **Ngăn xếp (Stack) & Hàng đợi (Queue)**: Có thể dễ dàng triển khai bằng mảng.
- **Bảng băm (Hash Table)**: Dùng mảng để tạo buckets.
- **Cây Heap**: Được biểu diễn hoàn hảo bằng một mảng.

**2. Làm đầu vào/xuất cho các thuật toán:**

- **Sắp xếp (Sorting)**: Hầu hết các thuật toán sắp xếp (Bubble Sort, Quick Sort, Merge Sort) đều hoạt động trên mảng.
- **Tìm kiếm (Searching)**: Tìm kiếm tuyến tính, nhị phân.
- **Thuật toán Tham lam (Greedy) & Quy hoạch động (DP)**: Mảng 1 chiều, 2 chiều thường được dùng để lưu trữ kết quả trung gian.

## 6. Mảng đa chiều (Multi-dimensional Arrays)

Trong DSA, mảng 2 chiều thường được dùng để biểu diễn:

- **Ma trận** (Matrix)
- **Lưới** (Grid)
- **Đồ thị** (Graph) bằng Ma trận kề (**Adjacency Matrix**)

```java
// Khai báo và sử dụng mảng 2 chiều
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
// Truy cập phần tử: matrix[row][col]
System.out.println(matrix[1][2]); // In ra 6

// Duyệt mảng 2 chiều (rất phổ biến)
for (int i = 0; i < matrix.length; i++) { // Duyệt hàng
    for (int j = 0; j < matrix[i].length; j++) { // Duyệt cột
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```