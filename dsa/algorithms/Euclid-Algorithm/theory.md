# Thuật toán Euclid 

## Thuật toán Euclid là gì?

- Thuật toán Euclid (hay còn gọi là Giải thuật Euclid) là một phương pháp hiệu quả và lâu đời để tìm Ước chung lớn nhất (GCD - Greatest Common Divisor) của hai số nguyên.
- Nó được mô tả bởi nhà toán học Hy Lạp Euclid vào khoảng thế kỷ thứ 3 TCN.

**Ước chung lớn nhất (GCD)** của hai số nguyên `a` và `b` (không đồng thời bằng 0) là số nguyên dương lớn nhất mà cả `a` và `b` đều chia hết.

---

## Nguyên lý hoạt động

Thuật toán dựa trên một nguyên lý toán học rất quan trọng:
> GCD(a, b) = GCD(b, a mod b)

Trong đó `a mod b` là phần dư của phép chia `a` cho `b`.

**Ý tưởng**: Thay vì tìm trực tiếp, ta liên tục thay thế cặp số `(a, b)` bằng cặp số nhỏ hơn (`b, a mod b`) cho đến khi phần dư bằng 0. Khi đó, số còn lại chính là GCD.

---

## Các bước thực hiện

Giả sử chúng ta cần tìm `GCD(a, b)` với `a > b`.

1. Chia `a` cho `b`, ta được thương `q` và phần dư `r` (với 0 ≤ r < b).
`a = b * q + r`

2. Kiểm tra phần dư `r`:

- Nếu `r = 0`: Thuật toán kết thúc. `b` chính là **GCD cần tìm**.

- Nếu `r ≠ 0`: Ta lặp lại bước 1, nhưng thay `(a, b)` bằng `(b, r)`.

---

## Ví dụ minh họa

Tìm `GCD(48, 18)`:

**Lần lặp 1:**
- `a = 48`, `b = 18`
- `48 ÷ 18 = 2` dư `12` (48 = 18 × 2 + 12)
- Phần dư `12 ≠ 0` → Chuyển sang `GCD(18, 12)`

**Lần lặp 2:**
- `a = 18`, `b = 12`
- `18 ÷ 12 = 1` dư `6` (18 = 12 × 1 + 6)
- Phần dư `6 ≠ 0` → Chuyển sang `GCD(12, 6)`

**Lần lặp 3:**
- `a = 12`, `b = 6`
- `12 ÷ 6 = 2` dư `0` (12 = 6 × 2 + 0)
- Phần dư `= 0` → Thuật toán kết thúc.

**Kết luận:** `GCD(48, 18) = 6`

---

## Triển khai mã

### Dạng đệ quy (Recursive)
```text
function gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a mod b)
```

### Dạng vòng lặp (Iterative)
```text
function gcd(a, b):
    while b != 0:
        temp = b
        b = a mod b
        a = temp
    return a
```

---

## Ứng dụng

1. **Rút gọn phân số**: Chia cả tử và mẫu cho `GCD(a, b)`

- Ví dụ: `48/18 = (48÷6)/(18÷6) = 8/3`

2. **Tìm Bội chung nhỏ nhất (LCM)**:
    `LCM(a, b) = (a × b) / GCD(a, b)`

3. **Mật mã học**: Thành phần cốt lõi trong các thuật toán mã hóa như **RSA**, dùng để tìm số mũ giải mã và kiểm tra tính đồng nguyên tố.

4. **Giải phương trình Diophantine**: Giải các phương trình dạng `ax + by = c` bằng thuật toán Euclid mở rộng.