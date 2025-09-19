public class Account {
    private String maSoTaiKhoan;
    private double soTien;

    public Account(String maSoTaiKhoan, double soTien) {
        this.maSoTaiKhoan = maSoTaiKhoan;
        this.soTien = soTien;
    }

    public String getMaSoTaiKhoan() {
        return maSoTaiKhoan;
    }

    public void setMaSoTaiKhoan(String maSoTaiKhoan) {
        this.maSoTaiKhoan = maSoTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public void hienThiThongTin() {
        System.out.println("- Ma so tai khoan: " + maSoTaiKhoan);
        System.out.println("- So tien: " + soTien);
    }

    public static void main(String[] args) {

        Account acc = new Account("123456", 1000000);

        System.out.println("Thong tin tai khoan hien tai:");
        acc.hienThiThongTin();

        acc.setSoTien(800000);

        System.out.println("\nThong tin tai khoan sau khi cap nhat:");
        acc.hienThiThongTin();
    }
}

/*------------------------------- 
|           Account             |
------------------------------- 
| - maSoTaiKhoan: String        |
| - soTien: double              |
------------------------------- 
| + Account(maSoTaiKhoan: String, soTien: double) |
| + getMaSoTaiKhoan(): String   |
| + setMaSoTaiKhoan(maSoTaiKhoan: String): void |
| + getSoTien(): double         |
| + setSoTien(soTien: double): void |
| + hienThiThongTin(): void     |
-------------------------------*/