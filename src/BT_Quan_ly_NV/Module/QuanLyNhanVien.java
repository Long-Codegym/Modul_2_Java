package BT_Quan_ly_NV.Module;

import java.util.Date;

public class  QuanLyNhanVien {
    private String name;
    private int id = 0;
    private long phone;
    private Date birthday;

    public QuanLyNhanVien() {
    }

    public QuanLyNhanVien(String name, int id, long phone, Date birthday) {
        this.name = name;
        this.id = ++id;
        this.phone = phone;
        this.birthday = birthday;
    }

    public QuanLyNhanVien(String name, long phone, Date date) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "QuanLyNhanVien{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", birthday=" + birthday +
                '}';
    }
}
