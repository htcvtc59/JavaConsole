/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_sinhvien_bt;

import java.util.Scanner;

/**
 *
 * @author phamt
 */
public class SinhVien {

    private String HoTen;
    private boolean gioiTinh;
    private Float DiemToan;
    private Float DiemLy;
    private Float DiemHoa;
    private Float TongDiem;
    private int MaSV;

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Float getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(Float DiemToan) {
        this.DiemToan = DiemToan;
    }

    public Float getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(Float DiemLy) {
        this.DiemLy = DiemLy;
    }

    public Float getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(Float DiemHoa) {
        this.DiemHoa = DiemHoa;
    }

    public Float getTongDiem() {
        return TongDiem;
    }

    public void setTongDiem(Float TongDiem) {
        this.TongDiem = TongDiem;
    }

    public SinhVien(String HoTen, boolean gioiTinh, Float DiemToan, Float DiemLy, Float DiemHoa, int MaSV) {
        this.HoTen = HoTen;
        this.gioiTinh = gioiTinh;
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
        this.MaSV = MaSV;
        this.TongDiem = DiemToan + DiemLy + DiemHoa;
    }

    public SinhVien() {
    }

    public void InputSV() {
        Scanner nhapst = new Scanner(System.in);
        Scanner nhapfl = new Scanner(System.in);
        Scanner nhapbo = new Scanner(System.in);
        Scanner nhapin = new Scanner(System.in);
        System.out.print("Nhập Mã Sinh Viên: ");MaSV = nhapin.nextInt();
        System.out.print("Họ Tên: ");HoTen = nhapst.nextLine();
        System.out.print("Giới Tính(true:Nam|false): ");gioiTinh = nhapbo.nextBoolean();
        System.out.print("Điểm Toán: ");DiemToan = nhapfl.nextFloat();
        System.out.print("Điểm Lý: ");DiemLy = nhapfl.nextFloat();
        System.out.print("Điểm Hóa: ");DiemHoa = nhapfl.nextFloat();
        this.TongDiem = DiemToan + DiemLy + DiemHoa;
    }

    public void DisplaySV() {
        System.out.println("------------------------------------");
        System.out.print("Mã Sinh Viên: " + MaSV);
        System.out.print("Họ Tên: " + HoTen);
        System.out.print("Giới Tính: " + gioiTinh);
        System.out.print("Tổng Điểm: " + TongDiem);
        System.out.println("------------------------------------");
    }
}
