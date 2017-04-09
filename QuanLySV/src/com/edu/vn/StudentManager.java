package com.edu.vn;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {

    public static void lineline() {
        System.out.println();
        for (int i = 0; i <= 80 ; i++) {
            if (i==0||i==80){
                System.out.print("^");
            }else{
                System.out.print("*");
            }
        }
    }
    public static void menu(){
        lineline();
        System.out.printf("\n| %-70s %8s","-------Quản lý sinh viên--------", "|");
        System.out.printf("\n| %-70s %8s","1. Thêm thông tin sinh viên", "|");
        System.out.printf("\n| %-70s %8s","2. Xóa sinh viên", "|");
        System.out.printf("\n| %-70s %8s","3. Tìm kiếm sinh viên và hiển thị thông tin điểm của sinh viên", "|");
        System.out.printf("\n| %-70s %8s","4. Hiển thị danh sách sinh viên được cấp bằng và không được cấp bằng", "|");
        System.out.printf("\n| %-70s %8s","0. Kết thúc", "|");
        lineline();
    }
    public static void main(String[] args) {
        try{
            int input;
            ArrayList<Student> studentArrayList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            Count n = new Count();
            Student student = new Student();
            FunctionStudent.createstudent(studentArrayList, n);

            do {
                menu();
                System.out.print("\nNhập vào chức năng: ");
                input = scanner.nextInt();
                System.out.flush();

                switch (input){
                    case 1:
                        System.out.println("--Nhập thông tin sinh viên mới--");
                        student.InputStudent(studentArrayList, n);

                        break;
                    case 2:
                        if(n.getN() == 0){
                            System.out.println("Chưa có sinh viên nào bạn hãy thêm sinh viên!");
                        }else{
                            System.out.print("\n Xóa sinh viên ");
                            FunctionStudent.removeStudent(studentArrayList, n);
                        }
                        break;
                    case 3:
                        FunctionStudent.finddisplay(studentArrayList,n.getN());
                        break;
                    case 4:
                        FunctionStudent.degree(studentArrayList, n.getN());
                        break;
                    case 0:
                        System.out.println("Kết thúc!");
                        break;
                    default:
                        System.out.println("Không có chức năng này!!!");
                        break;
                }


            }while(input!=0);
        }
        catch (Exception exception)
        {
            System.err.print("Chương trình tự thoát!");
            System.exit(0);

        }
    }

}
