package BT_Quan_ly_NV;

import BT_Quan_ly_NV.Manager.LogicQuanLyNV;

import java.util.Scanner;

public class QuanLyNhanVienTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LogicQuanLyNV logicQuanLyNV = new LogicQuanLyNV();
        while (true) {
            System.out.println("Quản Lý nhân viên");
            System.out.println("1. Hiển thị toàn bộ nhân viên.");
            System.out.println("2. Thêm nhân viên.");
            System.out.println("3. Tính lương nhân viên.");
            System.out.println("4. Xóa nhân viên theo id.");
            System.out.println("5. thoát.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                        // hiển thị
                    logicQuanLyNV.show();
                    break;
                case 2:
                        // thêm nhân viên
                    logicQuanLyNV.add();
                    break;
                case 3:
                        // tính lương nhân viên
                case 4:
                        // xóa nhân viên theo id
                case 5:
                        // thoát
            }
        }
    }
}
