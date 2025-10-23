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
