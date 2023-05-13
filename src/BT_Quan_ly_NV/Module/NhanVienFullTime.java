package BT_Quan_ly_NV.Module;

import java.util.Date;

public class NhanVienFullTime extends QuanLyNhanVien {
    private float heSo;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(float heSo) {
        this.heSo = heSo;
    }

    public NhanVienFullTime(String name, int id, long phone, Date birthday, float heSo) {
        super(name, id, phone, birthday);
        this.heSo = heSo;
    }

    public NhanVienFullTime(String name, long phone, Date date) {
        super(name, phone, date);
    }

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }
    public double tinhLuongNVFullTime(){
        return 3000000*heSo;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" + super.toString() +
                "heSo=" + heSo +
                '}';
    }
}
