import java.util.Scanner;

public class Circle {
    private double r;

    public Circle() {
        this.r = 1;
    }

    
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    
    public void input(Scanner sc) {
        System.out.print("Nhap ban kinh r: ");
        this.r = sc.nextDouble();
    }

    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r: " + r);
    }

    public double tinhDienTich() {
        return Math.PI * r * r;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Circle c1 = new Circle(); 
        c1.output();

        System.out.println("\nNhap hinh tron:");
        c1.input(sc);

        c1.output();
        System.out.printf("Dien tich hinh tron: %.2f\n", c1.tinhDienTich());
        System.out.printf("Chu vi hinh tron: %.2f\n", c1.tinhChuVi());

        sc.close(); 
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