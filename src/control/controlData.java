package control;

import Source.HoaDon;
import Source.KhachHang;
import Source.MyPham;
import Utils.FileIO;

import java.io.Serializable;
import java.util.*;

public class controlData implements Serializable {
    private List<MyPham> myPhamList;
    private List<HoaDon> hoaDonList;
    private List<KhachHang> khachHangList;
    private FileIO fileIO;

    public controlData(){
        this.khachHangList = new ArrayList<>();
        this.hoaDonList = new ArrayList<>();
        this.myPhamList = new ArrayList<>();
        this.fileIO = new FileIO("mypham.dat");
    }
    public void setMyPhamList(){
        System.out.print("So luong my pham can them: ");
        int sl = new Scanner(System.in).nextInt();
        for (int i = 0; i < sl; i++) {
            MyPham a = new MyPham();
            a.input();
            this.myPhamList.add(a);
        }
        System.out.println("Them thanh cong");
    }
    public void getMP() {
        System.out.println("Danh sach MP: ");
        System.out.printf("%10s%20s%60s%5s%7s%10s%10s%10s\n", "MaMP", "tenMp", "moTa", "SL", "DG", "loaiMP", "nuouocSX", "ngayHH");
        for (MyPham mp : this.myPhamList) {
            mp.output();

        }
    }
    public void getKH(){
        System.out.println("Danh sach khach hang da mua hang:");
        System.out.printf("%10s%20s%10s%20s\n", "MaKH", "TenKH", "SDT", "Dia chi");
        for (KhachHang khachHang : khachHangList){
            khachHang.output();
        }
    }
    public void addAHD(){
        HoaDon hd = new HoaDon();
        hd.input(this.myPhamList);
        this.khachHangList.add(hd.getKhachHang());
        this.hoaDonList.add(hd);
    }
    public void getListHoaDon(){
        System.out.println("Danh sach hoa don: ");
        for (HoaDon a: hoaDonList){
            a.output();
        }
    }
    public void getMyPhamTheoNuoc(){
        System.out.println("Nhap nuoc san xuat: ");
        String key = new Scanner(System.in).nextLine();
        for (MyPham myPham:myPhamList){
            if(myPham.getNuouocSX().equals(key)){
                System.out.printf("%10s%20s%60s%5s%7s%10s%10s%10s\n", "MaMP", "tenMp", "moTa", "SL", "DG", "loaiMP", "nuouocSX", "ngayHH");
                myPham.output();
            }
        }
    }
    public void sortMPL(){
        Collections.sort(this.myPhamList, Comparator.comparing(MyPham::getDonGia));
        System.out.println("Thanh cong");
    }
    public void fileI(){
        this.fileIO.fileI(this);
    }
}
