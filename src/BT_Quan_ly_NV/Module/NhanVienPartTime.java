package BT_Quan_ly_NV.Module;

import java.util.Date;

public class NhanVienPartTime extends QuanLyNhanVien {
    private int soGiolam;

    public NhanVienPartTime(String name, long phone, Date date) {
        super(name, phone, date);
    }

    public NhanVienPartTime(int soGiolam) {
        this.soGiolam = soGiolam;
    }

    public NhanVienPartTime(String name, int id, long phone, Date birthday, int soGiolam) {
        super(name, id, phone, birthday);
        this.soGiolam = soGiolam;
    }


    public int getSoGiolam() {
        return soGiolam;
    }

    public void setSoGiolam(int soGiolam) {
        this.soGiolam = soGiolam;
    }
    public long tinhLuongNVPartTime(){
        return 30000*soGiolam;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" + super.toString() +
                "soGiolam=" + soGiolam +
                '}';
    }
}
