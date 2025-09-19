public class Book {
    private String maSach;
    private String tenSach;
    private double giaSach;
    private double giamGia;

    public Book(String maSach, String tenSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
    }

    public Book(String maSach, String tenSach, double giaSach, double giamGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.giamGia = giamGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double tinhGiaBan() {
        return giaSach - giamGia;
    }

    public void hienThiThongTin() {
        System.out.println("- Ma sach: " + maSach);
        System.out.println("- Ten sach: " + tenSach);
        System.out.println("- Gia sach: " + giaSach);
        System.out.println("- Giam gia: " + giamGia);
    }

    public static void main(String[] args) {
        Book book = new Book("B001", "Lap Trinh Java", 120000, 20000);

        System.out.println("Thong tin quyen sach:");
        book.hienThiThongTin();
        System.out.println("Gia ban: " + book.tinhGiaBan());

        book.setGiamGia(30000);

        System.out.println("\nThong tin quyen sach sau khi thay doi giam gia:");
        book.hienThiThongTin();
        System.out.println("Gia ban moi: " + book.tinhGiaBan());
    }
}

/*------------------------------- 
|            Book               |
------------------------------- 
| - maSach: String              |
| - tenSach: String             |
| - giaSach: double             |
| - giamGia: double             |
------------------------------- 
| + Book(maSach: String, tenSach: String) |
| + Book(maSach: String, tenSach: String, giaSach: double, giamGia: double) |
| + getMaSach(): String         |
| + setMaSach(maSach: String): void |
| + getTenSach(): String        |
| + setTenSach(tenSach: String): void |
| + getGiaSach(): double        |
| + setGiaSach(giaSach: double): void |
| + getGiamGia(): double        |
| + setGiamGia(giamGia: double): void |
| + tinhGiaBan(): double        |
| + hienThiThongTin(): void     |
-------------------------------*/