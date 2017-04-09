package quanlysinhvien;

import java.util.Scanner;

public class ThaoTac
{
    //Function print with format 
    public static void printFormat()
    {
        System.out.println();

        for (int i = 1; i <= 129; i++)
        {
            if (i == 1 || i == 14 || i == 27 || i == 65 || i == 77 || i == 90 || i == 103 || i == 116 || i == 129)
            {
                System.out.print("+");
            }
            else
            {
                System.out.print("-");
            }
        }
    }

    //Function print tile 
    public static void printTile()
    {
        printFormat();
        System.out.printf("\n| %-10s | %-10s | %-35s | %-9s | %-10s | %-10s | %-10s | %-10s |", "STT", "Mã SV", "Họ Và Tên", "Giới Tính", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "Tổng Điểm");
        printFormat();
    }

    //Function remove symbol space 
    public static String removeSpace(String s, boolean check) throws Exception
    {
        try
        {
            //xóa tất cả dấu cách đầu và cuối của xâu. 
            s = s.trim();

            //hàm xóa 2 dấu cách liền nhau trong xâu. 
            while(s.lastIndexOf("  ") != -1)
            {
                s = s.replaceAll("  ", " ");
            }

            //xóa tất cả các dấu cách còn lại trong xâu chỉ dùng với mã học sinh và giới tính. 
            if(check)
            {
                while(s.lastIndexOf(" ") != -1)
                {
                    s = s.replaceAll(" ", "");
                }
            }

            return s;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function standardized data 
    public static void standardized(SinhVien temp) throws Exception
    {
        try
        {
            temp.setMaSV(removeSpace(temp.getMaSV(), true));
            temp.setHoTen(removeSpace(temp.getHoTen(), false));
            temp.setGioiTinh(removeSpace(temp.getGioiTinh(), true));
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check ID exists 
    public static int checkIDExists(SinhVien[] sinhVien, String ID, int n) throws Exception
    {
        try
        {
            int result = -1;

            if(n > 0)
            {
                for(int i = 0; i < n; i++)
                {
                    if(ID.equalsIgnoreCase(sinhVien[i].getMaSV()))
                    {
                        result = i;
                        break;
                    }
                }
            }

            return result;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check maSV 
    public static boolean checkID(String s) throws Exception
    {
        try
        {
            //kiểm tra xem ID có đúng định dạng không? ID chỉ chứa các ký tự từ a -> z, A -> Z và 0 -> 9 độ dài = 10 
            if(s.matches("^[a-zA-Z](\\w{0,9})$"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check hoTen 
    public static boolean checkFullName(String s) throws Exception
    {
        try
        {
            //kiểm tra họ tên, họ tên chỉ chứa các ký tự từ a -> z và A -> Z 
            if(s.matches("[a-z A-Z]{5,40}"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check sex 
    public static boolean checkSex(String s) throws Exception
    {
        try
        {
            //Kiểm tra giới tính, giới tính chỉ có thể là nam hoặc nu không phân biệt hoa thường. 
            if(s.equalsIgnoreCase("nam") || s.equalsIgnoreCase("nu"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check point 
    public static boolean checkPoint(double point) throws Exception
    {
        try
        {
            //Kiểm tra điểm, điểm chỉ được lơn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 
            if(point >= 0 && point <= 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public static boolean checkContinue(String s) throws Exception
    {
        try
        {
            //Kiểm tra điểm, điểm chỉ được lơn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 
            if(s.equalsIgnoreCase("continue") || s.equalsIgnoreCase("new") || s.equalsIgnoreCase("cancel"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check all 
    public static boolean checkAll(SinhVien temp) throws Exception
    {
        try
        {
            //Gọi các hàm kiểm tra tất cả dữ liệu nhập vào. 
            if(checkID(temp.getMaSV()) && checkFullName(temp.getHoTen()) && checkSex(temp.getGioiTinh()) && checkPoint(temp.getDiemToan()) && checkPoint(temp.getDiemLy()) && checkPoint(temp.getDiemHoa()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function input sinhVien 
    public static void inputSinhVien(SinhVien[] sinhVien, Count n) throws Exception
    {
        SinhVien temp = null;
        Scanner input = new Scanner(System.in);

        try
        {
            //Nhập số lượng học sinh số lượng học sinh chỉ được lớn hơn 0 và nhỏ hơn 100 
            do
            {
                System.out.print("\nBạn nhập vào số lượng học sinh(0 < n < 100 ): ");
                n.setN(input.nextInt());
            }
            while(n.getN() <= 0 || n.getN() >= 100);

            for(int i = 0; i < n.getN(); i++)
            {
                System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
                temp = new SinhVien();

                do
                {
                    temp.inputSinhVien();//1 đối tượng để chứa dữ liệu 
                    standardized(temp);//chuẩn hóa dữ liệu. 

                    if(checkIDExists(sinhVien, temp.getMaSV(), i) != -1)
                    {
                        System.out.printf("\nThông báo: ID \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getMaSV());
                    }
                }
                while(!checkAll(temp) || checkIDExists(sinhVien, temp.getMaSV(), i) != -1);

                sinhVien[i] = temp;//khi được chuẩn hóa và dữ liệu đúng điều kiện thì gán cho học sinh thứ i 
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function add data 
    public static void addSinhVien(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner input = new Scanner(System.in);
        SinhVien temp = null;
        int count, m = n.getN();

        try
        {
            do
            {
                System.out.printf("Bạn nhập vào số lượng sinh viên muốn thêm (số lượng <= %d): ", 99 - n.getN());
                count = input.nextInt();
            }
            while(!(count < 99 - n.getN()) || count <= 0);

            n.setN(n.getN() + count);

            for(int i = m; i < n.getN(); i++)
            {
                System.out.printf("Bạn nhập vào thông tin cho sinh viên thứ %d: ", i + 1);
                temp = new SinhVien();

                do
                {
                    temp.inputSinhVien();//1 đối tượng để chứa dữ liệu 
                    standardized(temp);//chuẩn hóa dữ liệu. 

                    if(checkIDExists(sinhVien, temp.getMaSV(), i) != -1)
                    {
                        System.out.printf("\nThông báo: ID \"%s\" đã có trong danh sách. Mời bạn nhập lại:", temp.getMaSV());
                    }
                }
                while(!checkAll(temp) || checkIDExists(sinhVien, temp.getMaSV(), i) != -1);

                sinhVien[i] = temp;//khi được chuẩn hóa và dữ liệu đúng điều kiện thì gán cho học sinh thứ i 
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function ouput sinhVien 
    public static void outputSinhVien(SinhVien[] sinhVien, int n) throws Exception
    {
        try
        {
            printTile();//in ra tiêu đề 

            for(int i = 0; i < n; i++)
            {
                System.out.printf("\n| %-10d |", i + 1);
                sinhVien[i].displaySinhVien();//in thông tin của các sinh viên 
                System.out.printf("| %-10.2f |", sum(sinhVien[i]));
                printFormat();//in ra các line 
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function Sum 
    public static double sum(SinhVien temp) throws Exception
    {
        try
        {
            return temp.getDiemToan() + temp.getDiemLy() + temp.getDiemHoa();//tín tổng điểm 
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function sort by sum point 
    public static void sortSinhVien(SinhVien[] sinhVien, int n) throws Exception
    {
        SinhVien temp = null;

        try
        {
            //sắp xếp các sinh viên theo tổng điểm. 
            for(int i = 0; i < n - 1; i++)
            {
                for(int j = i + 1; j < n; j++)
                {
                    if(sum(sinhVien[i]) < sum(sinhVien[j]))
                    {
                        temp = sinhVien[i];
                        sinhVien[i] = sinhVien[j];
                        sinhVien[j] = temp;
                    }
                }
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check sort by sum point 
    public static void checkSort(SinhVien[] sinhVien, int n) throws Exception
    {
        try
        {
            int i;

            for(i = 0; i < n - 1; i++)
            {
                if(sum(sinhVien[i]) < sum(sinhVien[i + 1]))
                {
                    break;
                }
            }

            if(i == n - 1)
            {
                System.out.println("\nDanh sách đã được sắp xếp theo tổng điểm.");
            }
            else
            {
                System.out.println("\nDanh sách chưa được sắp xếp theo tổng điểm.");
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function check exists sum point 
    public static int checkSumPoint(SinhVien[] sinhVien, int[]a, double sumPoint, int n) throws Exception
    {
        try
        {
            int count = 0;

            //kiểm tra nếu tổng điểm của học sinh bằng với điểm nhập vào thì thêm vị trí của học sinh đó vào mảng a. 
            for(int i = 0; i < n; i++)
            {
                if(sumPoint == sum(sinhVien[i]))
                {
                    a[count] = i;
                    count++;
                }
            }

            return count;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function find by sum point 
    public static void findPoint(SinhVien[] sinhVien, int n) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int[]a = new int[n];
        double sumPoint;
        int count;

        try
        {
            System.out.print("\nBạn nhập vào tổng điểm cần tìm kiếm: ");
            sumPoint = input.nextDouble();

            count = checkSumPoint(sinhVien, a, sumPoint, n);//lấy số lượng điểm trong danh sách bằng với điểm được nhập vào. 

            if(count > 0)
            {
                printTile();

                //in ra tất cả các học sinh có tổng điểm bằng với điểm nhập vào. 
                for(int i = 0; i < count; i++)
                {
                    System.out.printf("\n| %-10d |", i + 1);
                    sinhVien[a[i]].displaySinhVien();//in thông tin của các sinh viên 
                    System.out.printf("| %-10.2f |", sum(sinhVien[a[i]]));
                    printFormat();//in ra các line 
                }
            }
            else
            {
                System.out.printf("Không có sinh viên nào có tổng điểm = \"%-4.2f\"", sumPoint);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function edit information 
    public static void editSinhVien(SinhVien[] sinhVien, int n) throws Exception
    {
        SinhVien temp = new SinhVien();
        Scanner input = new Scanner(System.in);
        String ID;
        int location;

        try
        {
            System.out.println("\nBạn nhập vào mã sinh viên cần sửa thông tin để kiểm tra: ");
            ID = input.nextLine();
            removeSpace(ID, true);
            location = checkIDExists(sinhVien, ID, n);//lấy vị trí của học sinh có ID bằng ID nhập vào 

            if(location >= 0)
            {
                do
                {
                    System.out.printf("\nBạn nhập vào thông sinh viên (nã sinh viên phải là \"%s\"): ", ID);
                    temp.inputSinhVien();//đối tượng gán tạm dữ liệu 
                    standardized(temp);//chuẩn hóa thông tin được nhập vào 
                }
                while(!checkAll(temp) || !ID.equalsIgnoreCase(temp.getMaSV()));

                sinhVien[location] = temp;//nếu đúng thì gán thông tin cho sinh viên ở vị trí trùng với vị trí đã lấy ở trên 
            }
            else
            {
                System.out.printf("Không có sinh viên nào có mã \"%s\".", ID);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function remove student 
    public static void removeAt(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner input = new Scanner(System.in);
        String ID;
        int location;

        try
        {
            System.out.println("\nBạn nhập vào mã sinh viên cần xóa: ");
            ID = input.nextLine();
            removeSpace(ID, true);
            location = checkIDExists(sinhVien, ID, n.getN());//lấy vị trí của học sinh trong danh sách có ID bằng ID nhập vào 

            if(location >= 0)
            {
                n.setN(n.getN() - 1);//giảm số lượng học sinh đi 1 đơn vị 

                //bắt đầu gán lại thông tin cho các học sinh từ vị trí thứ i tới n - 1. 
                for(int i = location; i < n.getN(); i++)
                {
                    sinhVien[i] = sinhVien[i + 1];
                }

                System.out.printf("Sinh viên có mã \"%s\" đã được xóa khỏi danh sách.", ID);
            }
            else
            {
                System.out.printf("Không có sinh viên nào có mã \"%s\".", ID);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function insert 
    public static void insertSinhVien(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner input = new Scanner(System.in);
        SinhVien temp = new SinhVien();
        String ID;
        int location;

        try
        {
            do
            {
                System.out.println("\nBạn nhập vào mã sinh viên cần chèn (mã không được trùng, nhỏ hơn hoặc bằng 10 ký tự và không chứa các ký tự đặc biệt): ");
                ID = input.nextLine();
                removeSpace(ID, true);
            }
            while(!checkID(ID));

            sortSinhVien(sinhVien, n.getN());
            location = checkIDExists(sinhVien, ID, n.getN());

            if(location == -1)
            {
                do
                {
                    System.out.printf("\nBạn nhập vào thông sinh viên (mã sinh viên phải là \"%s\"): ", ID);
                    temp.inputSinhVien();
                    standardized(temp);
                }
                while(!checkAll(temp) || !ID.equalsIgnoreCase(temp.getMaSV()));

                if(sum(temp) <= sum(sinhVien[n.getN() - 1]))
                {
                    sinhVien[n.getN()] = temp;
                }
                else if(sum(temp) >= sum(sinhVien[0]))
                {
                    for(int i = n.getN() - 1; i >= 0; i--)
                    {
                        sinhVien[i + 1] = sinhVien[i];
                    }

                    sinhVien[0] = temp;
                }
                else
                {
                    for(int i = n.getN() - 1; i >= 0; i--)
                    {
                        sinhVien[i + 1] = sinhVien[i];

                        if(sum(temp) >= sum(sinhVien[i]) && sum(temp) <= sum(sinhVien[i - 1]))
                        {
                            sinhVien[i] = temp;
                            break;
                        }
                    }
                }

                n.setN(n.getN() + 1);
            }
            else
            {
                System.out.printf("Đã có sinh viên có mã \"%s\".", ID);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    public static void selectInput(SinhVien[] sinhVien, Count n) throws Exception
    {
        Scanner input = new Scanner(System.in);
        String Continue;

        try
        {
            if(n.getN() > 0)
            {
                do
                {
                    System.out.print("\nTrong danh sách đã có sinh viên bạn muốn nhập lại hay tiếp tục thêm? (nhập lại: new, tiếp tục: continue, thoát: cancel): ");
                    Continue = input.next();
                }
                while(!checkContinue(Continue));

                if(Continue.equalsIgnoreCase("Continue"))
                {
                    addSinhVien(sinhVien, n);
                }
                else if(Continue.equalsIgnoreCase("new"))
                {
                    inputSinhVien(sinhVien, n);
                }
            }
            else
            {
                inputSinhVien(sinhVien, n);
            }
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //Function create sinhVien 
    public static void createSinhVien(SinhVien[] sinhVien, Count n)
    {
        n.setN(10);

        for (int i = 0; i < n.getN(); i++)
        {
            sinhVien[i] = new SinhVien("C0042" + i, "Phùng Nguyễn Đức Minh " + i, "Nam", i, i, i);
        }

        sinhVien[5] = new SinhVien("C0042" + 5, "Phùng Nguyễn Đức Minh " + 5, "Nam", 10, 0, 4);
        sinhVien[9] = new SinhVien("C0042" + 9, "Phùng Nguyễn Đức Minh " + 9, "Nam", 0, 0, 0);
    }
} 