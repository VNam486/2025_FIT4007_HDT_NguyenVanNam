import java.util.Scanner;

public class Circle {
    // Thuộc tính
    private double r;

    // Constructor không tham số (default) -> r = 1
    public Circle() {
        this.r = 1;
    }

    // Constructor có tham số
    public Circle(double r) {
        this.r = r;
    }

    // Getter & Setter
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // Nhập bán kính từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.r = sc.nextDouble();
    }

    // Xuất thông tin
    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r: " + r);
    }

    // Tính diện tích
    public double tinhDienTich() {
        return Math.PI * r * r;
    }

    // Tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    // Main
    public static void main(String[] args) {
        // Tạo hình tròn mặc định
        Circle c1 = new Circle();

        // Xuất thông tin mặc định
        c1.output();

        // Nhập bán kính mới
        System.out.println("\nNhap hinh tron:");
        c1.input();

        // Xuất thông tin sau khi nhập
        c1.output();

        // In diện tích và chu vi
        System.out.println("Dien tich hinh tron: " + c1.tinhDienTich());
        System.out.println("Chu vi hinh tron: " + c1.tinhChuVi());
    }
}

/*----------------------------------
+----------------------------------+
|             Circle               |
+----------------------------------+
| - r: double                      |
+----------------------------------+
| + Circle()                       |
| + Circle(r: double)              |
| + getR(): double                 |
| + setR(r: double): void          |
| + input(): void                  |
| + output(): void                 |
| + tinhDienTich(): double         |
| + tinhChuVi(): double            |
+----------------------------------+
-----------------------------------*/