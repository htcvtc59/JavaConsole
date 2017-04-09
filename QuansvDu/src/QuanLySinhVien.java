import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/2/2016.
 */
public class QuanLySinhVien {


    public static void sapxep(ArrayList<SinhVien> sinhVienArrayList) {
        for (int i = 0; i < sinhVienArrayList.size(); i++) {
            for (int j = 0; j < sinhVienArrayList.size(); j++) {
                if (sinhVienArrayList.get(i).getPointSV() > sinhVienArrayList.get(j).getPointSV()) {
                    SinhVien sv = new SinhVien();
                    sv = sinhVienArrayList.get(i);
                    sinhVienArrayList.set(i, sinhVienArrayList.get(j));
                    sinhVienArrayList.set(j, sv);
                }
            }
        }
    }

    public static void displaySV(ArrayList<SinhVien> sinhVienArrayList) {
        for (int i = 0; i < sinhVienArrayList.size(); i++) {
           sinhVienArrayList.get(i).OutputOfSV();

        }
    }

    public static void inputListSV(int n) {
        SinhVien sv = new SinhVien();
        ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu "+i);
            sv.InputOfSV();
            sinhVienArrayList.add(sv);

        }
    }

    public static void searchSV(ArrayList<SinhVien> sinhVienArrayList, String name) {
        int j = 0;
        for (int i = 0; i < sinhVienArrayList.size(); i++) {
            if (sinhVienArrayList.get(i).getNameSv().equalsIgnoreCase(name)) {
                sinhVienArrayList.get(i).OutputOfSV();
                j = 1;
            }
        }
        if (j == 1) {
            System.out.println("Khong co sih vien nao ten la " + name + " nhu vay ca!");
        }
    }
public static int input;
    public static void main(String[] args) {
            int luachon;
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien>sinhVienArrayList=new ArrayList<>();
        do {
            System.out.println();
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi thong tin sinh vien");
            System.out.println("3.Sap xep danh sach sinh vien theo diem");
            System.out.println("4.Tim kiem sinh vien");
            System.out.println("0.Thoat");
            System.out.println("Moi ban lua chon: ");
            luachon = sc.nextInt();
            sc.nextLine();
//            System.out.flush();
            switch (luachon) {
                case 1:
                    System.out.println("Ban hay nhap tong so sinh vien: ");
                    input=sc.nextInt();
                    QuanLySinhVien.inputListSV(input);
                    QuanLySinhVien.displaySV(sinhVienArrayList);
                    break;
                case 2:
                    QuanLySinhVien.displaySV(sinhVienArrayList);

                    break;
                case 3:
                    QuanLySinhVien.sapxep(sinhVienArrayList);
                    QuanLySinhVien.displaySV(sinhVienArrayList);
                    break;
                case 4:
                    System.out.println("Moi ban nhap ten sinh vien: ");
                    String name=sc.nextLine();
                    QuanLySinhVien.searchSV(sinhVienArrayList,name);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Khong co lua chon nhu vay!");
                    break;
            }
        } while (luachon != 0);

    }
}
