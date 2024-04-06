package Source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDon implements Serializable {
    private String maHD, ngayLap;
    private KhachHang khachHang;
    private List<MyPham> myPhamList;
    private double TongTien;
    public HoaDon(){
        this.khachHang = new KhachHang();
        this.myPhamList = new ArrayList<>();
        this.TongTien = 0;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public List<MyPham> getMyPhamList() {
        return myPhamList;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }

    public void setMyPhamList(List<MyPham> myPhamList) {
        this.myPhamList = myPhamList;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    public  void input(List<MyPham> list){
        System.out.print("Nhap ma HD: ");
        this.maHD = new Scanner(System.in).nextLine();
        System.out.print("Nhap ngay lap: ");
        this.ngayLap = new Scanner(System.in).nextLine();
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        if(this.ngayLap.matches(regex)){
            this.ngayLap = null;
        }
        this.khachHang.input();
        List<String> maMPList = new ArrayList<>();
        for (MyPham mp : list){
            mp.output();
        }
        System.out.print("Nhap so luong my pham can thanh toan: ");
        int sz = new Scanner(System.in).nextInt();
        for(int i =0;i<sz ;i++){
            System.out.print("Nhap ma my pham thu "+ i+" :");
            String key = new Scanner(System.in).nextLine();
            for (MyPham mp : list){
                if(mp.getMaMP().equals(key)){
                    this.myPhamList.add(mp);
                }
            }
        }
        for(MyPham mp: this.myPhamList){
            this.TongTien = mp.getDonGia();
        }
    }
    public void output(){
        System.out.println("Thong tin hoa don");
        System.out.printf("%20s%20s\n", maHD , ngayLap);
        System.out.println("Thong tin khach hang:");
        System.out.printf("%10s%20s%10s%20s\n", "MaKH", "TenKH", "SDT", "Dia chi");
        this.khachHang.output();
        System.out.println("Thong tin my pham duoc mua: ");
        System.out.printf("%10s%20s%60s%5s%7s%10s%10s%10s\n", "MaMP", "tenMp", "moTa", "SL", "DG", "loaiMP", "nuouocSX", "ngayHH");
        for(MyPham mp: this.myPhamList){
            mp.output();
        }
        System.out.println("Tong tien: " + this.TongTien);
    }
}
