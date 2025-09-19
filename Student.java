import java.time.Year;

public class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String diaChi;

    public Student(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public Student(String maSV, String hoTen, int namSinh, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int tinhTuoi() {
        int namHienTai = Year.now().getValue();
        return namHienTai - namSinh;
    }

    public void hienThiThongTin() {
        System.out.println("- Ma sinh vien: " + maSV);
        System.out.println("- Ho ten: " + hoTen);
        System.out.println("- Nam sinh: " + namSinh);
        System.out.println("- Dia chi: " + diaChi);
    }

    public static void main(String[] args) {
        Student sv = new Student("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");

        System.out.println("Thong tin sinh vien:");
        sv.hienThiThongTin();
        System.out.println("Tuoi cua sinh vien: " + sv.tinhTuoi() + " tuoi");
    }
}

/*----------------------------------
+----------------------------------+
|            Student               |
+----------------------------------+
| - maSV: String                   |
| - hoTen: String                  |
| - namSinh: int                   |
| - diaChi: String                 |
+----------------------------------+
| + Student(maSV: String, hoTen: String) |
| + Student(maSV: String, hoTen: String, namSinh: int, diaChi: String) |
| + getMaSV(): String              |
| + setMaSV(maSV: String): void    |
| + getHoTen(): String             |
| + setHoTen(hoTen: String): void  |
| + getNamSinh(): int              |
| + setNamSinh(namSinh: int): void |
| + getDiaChi(): String            |
| + setDiaChi(diaChi: String): void|
| + tinhTuoi(): int                |
| + hienThiThongTin(): void        |
+----------------------------------+
-----------------------------------*/