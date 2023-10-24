import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager QLSV = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);


    public void showMenuEdit(){
        System.out.println("-----Menu Edit-----");
        System.out.println("Nhập id muốn sửa");
        int idEdit = inputInt.nextInt();
        System.out.println("Nhập tên :");
        String nameEdit = inputString.nextLine();
        System.out.println("Nhập tuổi ");
        int ageEdit = inputInt.nextInt();
        System.out.println("Nhập địa chỉ :");
        String addressEdit = inputString.nextLine();
        Student newStudent = new Student(idEdit,nameEdit,ageEdit,addressEdit);
        QLSV.upDate(idEdit,newStudent);
        System.out.println("Sửa thành công");
    }
    public void showMenuDelete(){
        System.out.println("Xóa học sinh");
        System.out.println("Nhập id cần xóa");
        int idDelete = inputInt.nextInt();
        QLSV.delete(idDelete);
        System.out.println("Xóa thành công");
    }
    public void showMenuAdd(){
        System.out.println("Thêm mới Student");
        System.out.println("Nhập tên");
        String insertName = inputString.nextLine();
        System.out.println("nhập tuổi");
        int insertAge = inputInt.nextInt();
        System.out.println("Nhập địa chỉ");
        String insertAddress = inputString.nextLine();
        Student student = new Student(insertName,insertAge,insertAddress);
        QLSV.add(student);
        System.out.println("thêm thành công");
    }
    public void showAll(){
        System.out.println("Danh sách sinh viên");
        ArrayList<Student> list = QLSV.finfAll();
        for (Student student: list) {
            System.out.println(student);
        }
    }
    public void showMainMenu(){
        int choice;
        do {
            System.out.println("-----Menu Studen Manager-----");
            System.out.println("1.thêm mới học sinh \n 2. sửa học sinh \n 3.xóa học sinh\n 4.hiển thị tất cả\n 5.thoát");
            choice = inputInt.nextInt();
            switch (choice){
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showAll();
                    break;

            }

        }while (choice != 0);
    }
}
