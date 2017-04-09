/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_sinhvien_bt;

import java.util.*;

/**
 *
 * @author phamt
 */
public class QL_SinhVien_BT {

    public static SinhVien[] SV = new SinhVien[100];
    public static int Count = 0;

    public static void main(String[] args) {
        do {
            System.out.println("-------------MENU-QUẢN-LÝ-SINH-VIEN-------------");
            System.out.println("1. Nhập một sinh viên mới.");
            System.out.println("2. Xem danh sách sinh viên.");
            System.out.println("3. Sắp tăng dần theo tổng điểm.");
            System.out.println("4. Kiểm tra danh sách đã tăng dần theo tổng điểm chưa.");
            System.out.println("5. Tìm tuyến tính theo tông điểm.");
            System.out.println("6. Sửa tên sinh viên có mã nhập vào từ bàn phím.");
            System.out.println("7. Xóa sinh viên có mã nhập vào từ bàn phím.");
            System.out.println("8. Chèn một sinh viên vào danh sách đã sắp xếp mà tính sắp xếp vẫn được bảo toàn.");
            System.out.println("0. thoát.");
            System.out.println("------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            Scanner nhap = new Scanner(System.in);
            int c = nhap.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Nhập thông tin sinh viên: ");
                    SV[Count] = new SinhVien();
                    SV[Count++].InputSV();
                    break;
                case 2:
                    for (int i = 0; i < Count; i++) {
                        SV[i].DisplaySV();
                    }
                    break;
                case 3:
                    Sort(SV, Count);
                    System.out.println("Sắp xếp xong!");
                    break;
                case 4:
                    if (CheckSort(SV, Count)) {
                        System.out.println("Danh sách đã sắp xếp!");
                    } else {
                        System.out.println("Danh sách chưa sắp xếp");
                    }
                    break;
                case 5:
                    System.out.print("Nhập vào tổng điểm cần tìm");
                    Scanner nhap1 = new Scanner(System.in);
                    Float Diem = nhap1.nextFloat();
                    for (int i = 0; i < Count; i++) {
                        if (Objects.equals(Diem, SV[i].getTongDiem())) {
                            SV[i].DisplaySV();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên muốn sửa!");
                    Scanner nhap2 = new Scanner(System.in);
                    int id = nhap2.nextInt();
                    EditName(SV, Count, id);
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên muốn xóa!");
                    Scanner nhap3 = new Scanner(System.in);
                    int idd = nhap3.nextInt();
                    if (Delete(SV, Count, idd)) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("không có ai!");
                    }
                    break;
                case 8:
                    SinhVien sv = new SinhVien();
                    sv.InputSV();
                    for (int i = 0; i < Count; i++) {
                        if (sv.getTongDiem() < SV[i].getTongDiem()) {
                            for (int j = Count; j > i; j--) {
                                SV[j] = SV[j - 1];
                            }
                            SV[i] = sv;
                            break;
                        } else {
                            SV[Count] = sv;
                        }
                    }
                    break;
                case 0:

                    break;
            }
            if (c == 0) {
                break;
            }
        } while (true);
    }

    public static boolean checkSinhVien(SinhVien[] lst, int id) {
        boolean check = false;
        try {
            for (SinhVien b : lst) {
                if (b.getMaSV() == id) {
                    check = true;
                    break;
                }
            }
        } catch (NullPointerException ex) {
        }
        return check;
    }

    public static void Sort(SinhVien[] lst, int Count) {
        for (int i = 0; i < Count - 1; i++) {
            for (int j = i + 1; j < Count; j++) {
                if (lst[i].getTongDiem() > lst[j].getTongDiem()) {
                    SinhVien temp = lst[i];
                    lst[i] = lst[j];
                    lst[j] = temp;
                }
            }
        }
    }

    public static boolean CheckSort(SinhVien[] lst, int Count) {
        for (int i = 0; i < Count - 1; i++) {
            for (int j = i + 1; j < Count; j++) {
                if (lst[i].getTongDiem() > lst[j].getTongDiem()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void EditName(SinhVien[] lst, int count, int id) {
        boolean check = false;
        for (int i = 0; i < count; i++) {
            if (id == lst[i].getMaSV()) {
                System.out.println("Nhập tên mới: ");
                Scanner nhap = new Scanner(System.in);
                String Name = nhap.nextLine();
                lst[i].setHoTen(Name);
                check = true;
            }
        }
        if (!check) {
            System.out.println("không có ai!");
        }
    }

    public static boolean Delete(SinhVien[] lst, int count, int id) {
        int idx = 0;
        boolean check = false;
        for (int i = 0; i < count; i++) {
            if (lst[i].getMaSV() == id) {
                idx = i;
                check = true;
            }
        }
        if (check) {
            for (int i = idx; i < count - 1; i++) {
                lst[i] = lst[i + 1];
            }
        }
        return check;
    }
}
