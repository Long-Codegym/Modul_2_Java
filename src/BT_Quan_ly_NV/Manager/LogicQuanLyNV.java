package BT_Quan_ly_NV.Manager;

import BT_Quan_ly_NV.Module.NhanVienFullTime;
import BT_Quan_ly_NV.Module.NhanVienPartTime;
import BT_Quan_ly_NV.Module.QuanLyNhanVien;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogicQuanLyNV {
    Scanner scanner = new Scanner(System.in);
//    QuanLyNhanVien[] nhanViens = new QuanLyNhanVien[2];

    NhanVienFullTime[] nhanVienFullTimes = new NhanVienFullTime[0]; // nhân viên full time

    NhanVienPartTime[] nhanVienPartTimes = new NhanVienPartTime[0]; // nhân viên part time

//    nhanViens[0] = (QuanLyNhanVien) nhanVienFullTimes;
//    nhanViens[1] = (QuanLyNhanVien) nhanVienPartTimes;
//    public LogicQuanLyNV() {
//
//    }

    public void show() {      // hiển thị
        System.out.println(" nhân viên full time:");
        for ( NhanVienFullTime s : nhanVienFullTimes) {
            System.out.println(s);
        }
        System.out.println(" nhân viên part time:");
        for (NhanVienPartTime k : nhanVienPartTimes){
            System.out.println(k);
        }
    }

    public void add() {    // thêm nhân viên
        while (true) {
            System.out.println("1. Thêm nhân viên FullTime: ");
            System.out.println("2. Thêm Nhân viên PartTime ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // thêm nhân viên Fulltime
                    nVFullTime();
                    break;
                case 2:
                    // thêm nhân viên PartTime
                    nVPartTime();
                    break;
            }
            break;
        }
    }

    public void nVFullTime() {
        System.out.println(" Nhập tên");
        String name = scanner.nextLine();
        System.out.println(" Nhập số điện thoại:");
        long phone = Long.parseLong(scanner.nextLine());
        System.out.println(" Nhập ngày, tháng, năm sinh:");
        String inputDate = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(inputDate);
            System.out.println("Ngày sinh của nhân viên vừa nhập là: " + dateFormat.format(date));
        } catch (Exception e) {
            System.out.println("Ngày không hợp lệ!");
        }
        NhanVienFullTime nhanVien = new NhanVienFullTime(name, phone, date );

        NhanVienFullTime[] newNVFullTime = new NhanVienFullTime[nhanVienFullTimes.length + 1];
        newNVFullTime[newNVFullTime.length - 1] = nhanVien;
        for (int i = 0; i < nhanVienFullTimes.length; i++) {
            newNVFullTime[i] = nhanVienFullTimes[i];
        }
        nhanVienFullTimes = newNVFullTime;
    }

    public void nVPartTime() {
        System.out.println(" Nhập tên");
        String name = scanner.nextLine();
        System.out.println(" Nhập số điện thoại:");
        long phone = Long.parseLong(scanner.nextLine());
        System.out.println(" Nhập ngày, tháng, năm sinh:");
        String inputDate = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(inputDate);
            System.out.println("Ngày sinh của nhân viên vừa nhập là: " + dateFormat.format(date));
        } catch (Exception e) {
            System.out.println("Ngày không hợp lệ!");
        }
        NhanVienPartTime nhanVien = new NhanVienPartTime(name, phone, date);
        NhanVienPartTime[] newNVPartTime = new NhanVienPartTime[nhanVienPartTimes.length + 1];
        newNVPartTime[newNVPartTime.length - 1] = nhanVien;
        for (int i = 0; i < nhanVienPartTimes.length; i++) {
            newNVPartTime[i] = nhanVienPartTimes[i];
        }
        nhanVienPartTimes = newNVPartTime;
    }
    public void wage(){

    }

    public void editInformation() {
        System.out.println(" Nhập id muốn sửa thông tin");
        int id = Integer.parseInt(scanner.nextLine());
        boolean kTID = false;
        for (int j = 0; j < nhanVienFullTimes .length; j++) {
            if (nhanVienFullTimes [j].getId() == id) {
                kTID = true;
            }
        }
        if (kTID) {
            for (int i = 0; i < nhanVienFullTimes .length; i++) {
                if (nhanVienFullTimes [i].getId() == id) {
                    System.out.println(" Thông tin cũ: ");
                    System.out.println(nhanVienFullTimes [i].getId() + " - " + nhanVienFullTimes [i].getName() + " - " + nhanVienFullTimes [i].getPhone());
////                    System.out.println(" Nhập id muốn sửa:");
////                    int newID = Integer.parseInt(scanner.nextLine());
////                    System.out.println(" Nhập tên muốn sửa: ");
////                    String newName = scanner.nextLine();
////                    System.out.println(" Nhập tuổi muốn sửa: ");
////                    int newAGE = Integer.parseInt(scanner.nextLine());
////                    NhanVienFullTime student = new NhanVienFullTime(newID, newName, newAGE);
////                    NhanVienFullTime[i] = student;
                }
            }
        }
        if (!kTID) {
            System.out.println( " ko có ");
        }
    }
}

