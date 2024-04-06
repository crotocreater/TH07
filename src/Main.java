import Utils.FileIO;
import control.controlData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        controlData a = new controlData();
        a = new FileIO("mypham.dat").fileO();
        while (true){
            System.out.println("1. nhap danh sach my pham\n" +
                    "2. hien thi danh sach my pham\n" +
                               "3. hien thi danh sach khach hang\n" +
                                "4. nhap hoa don\n" +
                    "5. hien thi danh sach hoa don\n" +
                                "6. tim kiem theo nuoc sx\n" +
                                "7. sap xep theo gia tri tang dan\n" +
                                "8. thoat\n" );
            int key = new Scanner(System.in).nextInt();
            if(key == 1){
                a.setMyPhamList();
            } else if (key == 2) {
                a.getMP();
            }else if (key == 3){
                a.getKH();
            } else if (key == 4) {
                a.addAHD();
            } else if (key == 5) {
                a.getListHoaDon();
            } else if (key == 6) {
                a.getMyPhamTheoNuoc();
            } else if (key == 7) {
                a.sortMPL();
            } else if (key == 8) {
                a.fileI();
                return;
            }else {
                continue;
            }
        }
    }
}