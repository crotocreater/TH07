package Source;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class MyPham implements Serializable {
    private String maMP, tenMp, moTa, loaiMP, nuouocSX, ngayHH;
    private int soLuong;
    private double donGia;
    public MyPham(){}

    public String getMaMP() {
        return maMP;
    }

    public String getTenMp() {
        return tenMp;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getLoaiMP() {
        return loaiMP;
    }

    public String getNuouocSX() {
        return nuouocSX;
    }

    public String getNgayHH() {
        return ngayHH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNgayHH(String ngayHH) {
        this.ngayHH = ngayHH;
    }

    public void setNuouocSX(String nuouocSX) {
        this.nuouocSX = nuouocSX;
    }

    public void setLoaiMP(String loaiMP) {
        this.loaiMP = loaiMP;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setTenMp(String tenMp) {
        this.tenMp = tenMp;
    }

    public void setMaMP(String maMP) {
        this.maMP = maMP;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap du lieu MP: \n");
        System.out.print("Ma: ");
        this.maMP = sc.nextLine();
        System.out.print("Ten: ");
        this.tenMp = sc.nextLine();
        System.out.print("Mo Ta: ");
        this.moTa = sc.nextLine();
        System.out.print("So luong: ");
        this. soLuong = new Scanner(System.in).nextInt();
        System.out.print("Don gia: ");
        this.donGia = new Scanner(System.in).nextDouble();
        System.out.print("Loai: ");
        this.loaiMP = sc.nextLine();
        System.out.print("Nuoc san xuat: ");
        this.nuouocSX = sc.nextLine();
        System.out.print("Ngay Het Han: ");
        this.ngayHH = sc.nextLine();
    }
    public void output(){
        System.out.printf("%10s%20s%60s%10d%10.1f%10s%10s%10s\n", maMP, tenMp, moTa, soLuong, donGia, loaiMP, nuouocSX, ngayHH);
    }
}
