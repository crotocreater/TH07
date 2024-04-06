package Source;

import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Serializable {
    private String maKH, tenKH, sdt, diaChi;
    public KhachHang(){}

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap du lieu KH: \n");
        System.out.print("Ma: ");
        this.maKH = sc.nextLine();
        System.out.print("Ten: ");
        this.tenKH = sc.nextLine();
        System.out.print("SDT: ");
        this.sdt = sc.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
    }
    public void output() {
        System.out.printf("%10s%20s%10s%20s\n", maKH, tenKH, sdt, diaChi);
    }
}
