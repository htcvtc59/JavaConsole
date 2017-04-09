package quanlysinhvien;

import java.util.Scanner;
import java.io.*;

public class SinhVien
{
    //Field 
    private String maSV;
    private String gioiTinh;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    //Property 
    public String getMaSV()
    {
        return maSV;
    }

    public void setMaSV(String maSV)
    {
        this.maSV = maSV;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }

    public String getGioiTinh()
    {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemToan()
    {
        return diemToan;
    }

    public void setDiemToan(double diemToan)
    {
        this.diemToan = diemToan;
    }

    public double getDiemLy()
    {
        return diemLy;
    }

    public void setDiemLy(double diemLy)
    {
        this.diemLy = diemLy;
    }

    public double getDiemHoa()
    {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa)
    {
        this.diemHoa = diemHoa;
    }

    //Paramater 
    public SinhVien()
    {
        this("", "", "", 0, 0, 0);
    }

    public SinhVien(String maSV, String hoTen, String gioiTinh, double diemToan, double diemLy, double diemHoa)
    {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    //Method 
    //Check Error 
//    public static void printError(Exception ex) 
//    { 
//        System.out.println("Dữ liệu bạn nhập vào bị lỗi. Lỗi: " + ex.getMessage()); 
//    } 

    //Input data 
    public void inputSinhVien()throws Exception
    {
        Scanner input = new Scanner(System.in);
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            do
            {
                System.out.print("\nBạn nhập vào mã sinh viên (mã không được trùng, nhỏ hơn hoặc bằng 10 ký tự và không chứa các ký tự đặc biệt): ");
                setMaSV(inputBuffer.readLine());
            }
            while(!ThaoTac.checkID(maSV));

            do
            {
                System.out.print("Bạn nhập vào họ và tên sinh viên (Lớn hơn hoặc bằng 5 ký tự): ");
                setHoTen(inputBuffer.readLine());
            }
            while(!ThaoTac.checkFullName(hoTen));

            do
            {
                System.out.print("Bạn nhập vào giới tính cho sinh viên (không được để trống, giới tính chỉ có thể là nam hoặc nữ): ");
                setGioiTinh(inputBuffer.readLine());
            }
            while(!ThaoTac.checkSex(gioiTinh));

            do
            {
                System.out.print("Bạn nhập vào điểm toán cho sinh viên (điểm toán phải >= 0 và <= 10): ");
                setDiemToan(input.nextDouble());
            }
            while(!ThaoTac.checkPoint(diemToan));

            do
            {
                System.out.print("Bạn nhập vào điểm lý cho sinh viên (điểm lý phải >= 0 và <= 10): ");
                setDiemLy(input.nextDouble());
            }
            while(!ThaoTac.checkPoint(diemLy));

            do
            {
                System.out.print("Bạn nhập vào điểm hóa cho sinh viên (điểm hóa phải >= 0 và <= 10): ");
                setDiemHoa(input.nextDouble());
            }
            while(!ThaoTac.checkPoint(diemHoa));

            System.out.flush();
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public void displaySinhVien() throws Exception
    {
        try
        {
            System.out.printf(" %-10s | %-35s | %-9s | %-10.2f | %-10.2f | %-10.2f ", maSV, hoTen, gioiTinh, diemToan, diemLy, diemHoa);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
} 