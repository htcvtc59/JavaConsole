import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/2/2016.
 */
public class SinhVien {
    private String nameSv;
    private int yearSV;
    private String addressSV;
    private float pointSV;


    public String getNameSv() {
        return nameSv;
    }

    public void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }

    public int getYearSV() {
        return yearSV;
    }

    public void setYearSV(int yearSV) {
        this.yearSV = yearSV;
    }

    public String getAddressSV() {
        return addressSV;
    }

    public void setAddressSV(String addressSV) {
        this.addressSV = addressSV;
    }

    public float getPointSV() {
        return pointSV;
    }

    public void setPointSV(float pointSV) {
        this.pointSV = pointSV;
    }

    public SinhVien(String nameSv,int yearSV,String addressSV,float pointSV){
        this.nameSv=nameSv;
        this.yearSV=yearSV;
        this.addressSV=addressSV;
        this.pointSV=pointSV;

    }
public SinhVien(){

}

    public void InputOfSV(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ban hay nhap ten sv: ");
        nameSv=sc.nextLine();
        System.out.println("Ban hay nhap nam sv: ");
        yearSV=sc.nextInt();
        sc.nextLine();
        System.out.println("Ban hay nhap dia chi sv: ");
        addressSV=sc.nextLine();
        System.out.println("Ban hay nhap diem sv: ");
        pointSV=sc.nextFloat();
    }

    public void OutputOfSV(){
        System.out.printf("%-15s %-15s %-15s %-10s","TenSV" ,"YearSV ","AddressSV" ,"PointSV");
        System.out.println();
        System.out.printf("%-15s %-15d %-15s %-10.1f",nameSv,yearSV,addressSV,pointSV);
    }
}
