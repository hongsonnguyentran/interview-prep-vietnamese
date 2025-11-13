public class ArrayAddressCalculation {
    public static void main(String[] args) {
        // Giả sử mảng được lưu ở địa chỉ 1000
        int baseAddress = 1000;
        int elementSize = 4; // bytes cho kiểu int

        int[] numbers = {10, 20, 30, 40, 50};

        // Truy cập phần tử tại index = 2
        int index = 2;
        int calculatedAddress = baseAddress + (index * elementSize);

        System.out.println("Địa chỉ đầu mảng: " + baseAddress);
        System.out.println("Truy cập phần tử tại index: " + index);
        System.out.println("Địa chỉ tính được: " + calculatedAddress);
        System.out.println("Giá trị thực tế: numbers[" + index + "] = " + numbers[index]);

        // Minh họa cho tất cả phần tử
        System.out.println("\n--- BẢNG TÍNH ĐỊA CHỈ ---");
        System.out.println("Index | Giá trị | Địa chỉ bắt đầu");
        System.out.println("------|---------|----------------");
        for (int i = 0; i < numbers.length; i++) {
            int address = baseAddress + (i * elementSize);
            System.out.printf("  %d   |   %d    |     %d%n", i, numbers[i], address);
        }
    }
}
