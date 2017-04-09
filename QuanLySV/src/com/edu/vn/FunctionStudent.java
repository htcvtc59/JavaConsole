package com.edu.vn;


import java.util.ArrayList;
import java.util.Scanner;

public class FunctionStudent {

    public static void pdisplay() {
        System.out.println();
        for (int i = 1; i <= 150; i++) {
            if (i == 1 || i == 14 || i == 50 || i ==70  || i == 90 || i == 110 || i == 130||i == 150) {
                System.out.print(":");
            } else System.out.print("-");
        }

    }

    public static void fdisplay() {
        pdisplay();
        System.out.printf("\n| %-10s | %-33s | %-17s | %-17s | %-17s | %-17s | %-17s |", "ID", "Name", "cMark", "javaMark", "htmlMark", "javascriptMark", "androidMark");
        pdisplay();
    }

    public static void disstudent(ArrayList<Student> studentArrayList, int n)  throws Exception{
        try {
            fdisplay();
            for (int i = 0; i < n; i++) {
                System.out.printf("\n");
                studentArrayList.get(i).displaystudent();
                pdisplay();
            }
        } catch (Exception exception) {
            throw exception;
        }
    }

    public static String removespace(String s) throws Exception{
        try {
            s = s.trim();
            s = s.replaceAll("\\s+"," ");
            return s;
        }
        catch (Exception exception){
            throw exception;
        }
    }

    public static String removeallspace(String s) throws Exception{
        try {
            s = s.trim();
            s = s.replaceAll("\\s+","");
            return s;
        }
        catch (Exception exception){
            throw exception;
        }
    }

    public static void removeStudent(ArrayList<Student>studentArrayList, Count n)throws Exception{
        Scanner delete = new Scanner(System.in);
        String id,a,ab,ac;
        String choice ;
        int location;
        try{
            System.out.print("\nBạn hãy nhập id hoặc tên sinh viên cần xóa: ");
            a =delete.nextLine();
            id=a+"";
            removeallspace(id);
            if(n.getN() > 0) {
                for (int i = 0; i < n.getN(); i++) {
                    ab = studentArrayList.get(i).getId() + "";
                    ac = studentArrayList.get(i).getName();
                    if (id.contains(ab)|| ac.contains(id)) {
                        location = studentArrayList.get(i).getId();
                        System.out.printf("%-5s",location);
                        System.out.printf("%5s",ac);
                        System.out.printf("\n");
                    }
                }
            }System.out.printf("\nBạn hãy tìm đúng Id mà bạn cần và vui lòng nhập lại!");
            System.out.print("\nBạn hãy nhập id sinh viên cần xóa: ");
            a=delete.nextLine();
            id=a+"";
            removeallspace(id);
            if(n.getN() > 0) {
                for (int i = 0; i < n.getN(); i++) {
                    ab = studentArrayList.get(i).getId()+"";
                    ac = studentArrayList.get(i).getName();
                    if (id.equalsIgnoreCase(ab)) {
                        location = studentArrayList.get(i).getId();
                        System.out.printf("%-5s",location);
                        System.out.printf("%5s",ac);
                        System.out.printf("\n");
                    }
                }
            }
            System.out.printf("\nBạn có thực sự muốn xóa , hãy chon yes hoặc no : ");
            choice = delete.nextLine();
            removeallspace(choice);
            if(choice.equalsIgnoreCase("yes")) {
                location = idsreach(studentArrayList, id, n.getN());
                System.out.println(location);
                if (location >= 0) {
                    n.setN(n.getN() - 1);
                    for (int i = location; i < n.getN(); i++) {
                        studentArrayList.set(i, new Student(studentArrayList.get(i+1).getId(),studentArrayList.get(i+1).getName(),
                                studentArrayList.get(i+1).getcMark(),studentArrayList.get(i+1).getJavaMark(),studentArrayList.get(i+1).getHtmlMark(),
                                studentArrayList.get(i+1).getJavascriptMark(),studentArrayList.get(i+1).getAndroidMark()));
                    }
                    System.out.printf("Sinh viên \"%s\" đã được xóa khỏi danh sách", id);
                } else {
                    System.out.printf("Không có sinh viên nào như trên!");
                }
            }else{
                System.out.print("\nHãy chọn chức năng khác!");
            }
        }catch (Exception exception) {
            throw exception;
        }
    }

    public static int idsreach(ArrayList<Student> studentArrayList, String id, int n)throws Exception{
        try{
            int reseach = -1;
            if(n>0){
                for (int i = 0; i < n; i++) {
                    if(id.equalsIgnoreCase(studentArrayList.get(i).getId()+"")){
                        reseach = i;
                        break;
                    }
                }
            }
            return reseach;
        }catch (Exception exception){
            throw exception;
        }
    }

    public static void finddisplay(ArrayList<Student>studentArrayList,int inter)throws Exception{
        Scanner sc = new Scanner(System.in);
        Count n = new Count();
        int input;
        String a;
        int count;
        int blue = 0;
        float point;
        int []b= new int[inter];

        try{
            System.out.print("\n 1.Tìm kiếm theo id hoặc tên sinh viên ");
            System.out.print("\n 2.Tìm kiếm theo điểm sinh viên ");
            System.out.print("\nVui lòng ấn phím 1 hoặc 2 để chọn: ");
            input = sc.nextInt();
            sc.nextLine();
            switch (input){
                case 1:
                    System.out.print("\nBạn hãy nhập id hoặc tên sinh viên để tìm kiếm: ");
                    a=sc.nextLine();
                    blue= sreachnameid(studentArrayList, b,a,inter);
                    if(blue>0)
                    {
                        fdisplay();
                        for (int i = 0; i < blue; i++) {
                            System.out.printf("\n");
                            studentArrayList.get(b[i]).displaystudent();
                            pdisplay();
                        }

                    }
                    break;
                case 2:
                    System.out.print("\nBạn hãy nhập điểm của sinh viên: ");
                    point=sc.nextFloat();
                    count = sreachpoint(studentArrayList, b ,point,inter);
                    if (count>0)
                    {
                        fdisplay();
                        for (int i = 0; i < count; i++) {
                            System.out.printf("\n");
                            studentArrayList.get(b[i]).displaystudent();
                            pdisplay();
                        }

                    }

                    break;
                default:
                    System.out.printf("\n Không có chức năng này !");
                    break;
            }


        }catch (Exception exception){
            System.exit(0);
        }
    }

    public static void degree(ArrayList<Student>studentArrayList, int inter)throws Exception{
        int point;
        int []b= new int[inter];
        Count n =  new Count();
        boolean nice;
        int blue;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.printf("\nHãy nhập thang điểm của bạn: ");
            point = sc.nextInt();
            sc.nextLine();
            nice = countcheck(studentArrayList,b,point,inter);

        }catch (Exception exception){
            throw exception;
        }
    }


    public static boolean countcheck(ArrayList<Student> studentArrayList, int[]a, int point, int n)throws Exception{
        float cmark ,javamark,htmlmark,javascriptmark,androidmark;
        int percent;
        int count = 0;
        int x=0;
        try{
            percent = point/2;
            for (int i = 0; i < n ; i++) {
                cmark = studentArrayList.get(i).getcMark();
                javamark = studentArrayList.get(i).getJavaMark();
                htmlmark = studentArrayList.get(i).getHtmlMark();
                javascriptmark = studentArrayList.get(i).getJavascriptMark();
                androidmark = studentArrayList.get(i).getAndroidMark();

                if (cmark < percent) {
                    x++;
                } else if (javamark < percent) {
                    x++;
                } else if (htmlmark < percent) {
                    x++;
                } else if (javascriptmark < percent) {
                    x++;
                } else if (androidmark < percent) {
                    x++;
                }else if (x > 2){
                    a[count]=i;
                    count++;
                }

            }
            if(count>0) {
                System.out.println();
                System.out.println("Danh sách sinh viên được cấp bằng!");
                fdisplay();
                for (int j = 0; j < count; j++) {
                    System.out.printf("\n");
                    studentArrayList.get(a[j]).displaystudent();
                    pdisplay();
                }
            }
            System.out.println();
            System.out.println("Danh sách sinh viên không được cấp bằng do 2 trên 5 môn có điểm dưới 50% !");
            fdisplay();
            for (int k = 0; k < n-count; k++) {
                System.out.printf("\n");
                studentArrayList.get(k).displaystudent();
                pdisplay();
            }
            System.out.println();
            return true;
        }catch (Exception exception){
            throw exception;
        }
    }



    public static int sreachnameid(ArrayList<Student>studentArrayList, int []a, String id ,int n) throws Exception{
        try {
            int reseach = 0;
            String ac ;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    ac = studentArrayList.get(i).getName();
                    while (id.equalsIgnoreCase(studentArrayList.get(i).getId() + "")||
                            ac.contains(id)) {
                        a[reseach] = i;
                        reseach++;
                        break;
                    }
//               if (id.equalsIgnoreCase(studentArrayList.get(i).getId() + "")||
//                ac.contains(id)) {
//                   a[reseach] = i;
//                   reseach++;
//                   break;
//                }
                }
            }
            return reseach;
        }catch (Exception exception)
        {
            throw exception;
        }
    }




    public static int sreachpoint(ArrayList<Student>studentArrayList, int[]a,float point,int inter)throws Exception{
        try{
            int count = 0 ;
            for (int i = 0; i < inter ; i++) {
                if(point == studentArrayList.get(i).getcMark()||point == studentArrayList.get(i).getJavaMark()||
                        point == studentArrayList.get(i).getHtmlMark()||point == studentArrayList.get(i).getJavascriptMark()||
                        point == studentArrayList.get(i).getAndroidMark()){
                    a[count] = i;
                    count++;
                }
            }
            return count;
        }catch (Exception exception){
            throw exception;
        }
    }

    public static void  createstudent(ArrayList<Student> studentArrayList, Count n){
        n.setN(7);

        Student blue = new Student(0,"Bich quyen",6,3,5,3,4);
        Student blue1 = new Student(1,"Dinh van",7,5,4,5,5);
        Student blue2 = new Student(2,"Vu",1,3,4,5,2);
        Student blue3 = new Student(3,"Long nguyen",6,1,3,6,2);
        Student blue4 = new Student(4,"Dung",7,5,4,3,3);
        Student blue5 = new Student(5,"Bao Ngoc",7,6,5,8,9);
        Student blue6 = new Student(6,"Ngoc minh",7,5,6,5,9);
        studentArrayList.add(blue);
        studentArrayList.add(blue1);
        studentArrayList.add(blue2);
        studentArrayList.add(blue3);
        studentArrayList.add(blue4);
        studentArrayList.add(blue5);
        studentArrayList.add(blue6);

    }


}



