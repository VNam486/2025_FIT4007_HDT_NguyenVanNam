import java.io.Serializable;

// BƯỚC 1: Phải "đánh dấu" lớp này là có thể Tuần tự hóa
public class Student implements Serializable {
    
    // BƯỚC 2: (Good practice) Thêm serialVersionUID để đảm bảo
    // phiên bản lớp khi Ghi và Đọc là nhất quán.
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // BƯỚC 3: Thêm hàm toString() để có thể in ra kiểm tra
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}


________________________________________
File 2: Chương trình Ghi và Đọc
Đây là file main thực hiện việc lưu và tải.
MainApp.java
Java
import java.io.*;
import java.util.ArrayList;

public class MainApp {
    
    private static final String FILENAME = "students.dat";

    public static void main(String[] args) {
        // 1. Tạo dữ liệu mẫu (Một danh sách các đối tượng)
        ArrayList<Student> listToWrite = new ArrayList<>();
        listToWrite.add(new Student("B21DCCN001", "An Nguyen", 3.2));
        listToWrite.add(new Student("B21DCCN002", "Binh Le", 2.8));
        listToWrite.add(new Student("B21DCCN003", "Chi Pham", 3.5));

        // 2. GỌI HÀM GHI FILE
        writeObjectsToFile(listToWrite);
        
        // 3. GỌI HÀM ĐỌC FILE
        ArrayList<Student> listFromRead = readObjectsFromFile();
        
        // 4. KIỂM CHỨNG KẾT QUẢ
        System.out.println("\n--- Dữ liệu đã đọc từ file " + FILENAME + ": ---");
        if (listFromRead != null) {
            for (Student s : listFromRead) {
                System.out.println(s);
            }
        }
    }

    /**
     * Ghi một ArrayList các đối tượng Student xuống file.
     * @param studentList Danh sách cần ghi
     */
    public static void writeObjectsToFile(ArrayList<Student> studentList) {
        System.out.println("--- Bắt đầu GHI file: " + FILENAME + " ---");
        
        // Sử dụng try-with-resources để tự động đóng stream
        try (FileOutputStream fos = new FileOutputStream(FILENAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            // GHI TOÀN BỘ ArrayList xuống file CHỈ BẰNG 1 LỆNH
            oos.writeObject(studentList);
            
            System.out.println("Ghi file thành công!");
            
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Đọc một ArrayList các đối tượng Student từ file.
     * @return Danh sách đã đọc, hoặc null nếu có lỗi.
     */
    public static ArrayList<Student> readObjectsFromFile() {
        System.out.println("\n--- Bắt đầu ĐỌC file: " + FILENAME + " ---");
        
        ArrayList<Student> studentList = null;
        
        try (FileInputStream fis = new FileInputStream(FILENAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // ĐỌC TOÀN BỘ ArrayList lên CHỈ BẰNG 1 LỆNH
            // Cần ép kiểu (cast) về đúng kiểu dữ liệu ban đầu
            studentList = (ArrayList<Student>) ois.readObject();
            
            System.out.println("Đọc file thành công!");
            
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy file " + FILENAME);
        } catch (IOException | ClassNotFoundException e) {
            // ClassNotFoundException xảy ra nếu lớp Student không được tìm thấy
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
            e.printStackTrace();
        }
        
        return studentList;
    }
}
