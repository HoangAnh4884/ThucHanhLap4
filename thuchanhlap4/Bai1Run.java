/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap4;

import java.util.Scanner;

/**
 *
 * @author HOME
 */

        //      Nguyễn Hoàng Anh    1050080002      CNTT1

public class Bai1Run {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Bai1Class.GiaoDichDat gdd = new Bai1Class.GiaoDichDat();
        Bai1Class.GiaoDichNha gdn = new Bai1Class.GiaoDichNha();
        Bai1Class.QuanLy ql = new Bai1Class.QuanLy();      //???
        
    int Chon;
    do {
        ql.Menu();
        System.out.print("Chọn chức năng: ");
        Chon=sc.nextInt();
        
        switch(Chon) {
            case 1: { ql.ThemDS_GDDat(gdd);            break; }
            case 2: { ql.ThemDS_GDNha(gdn);            break; }
            case 3: { ql.XuatDS_GDDat();                 break; }
            case 4: { ql.XuatDS_GDNha();                 break; }
            case 5: { ql.TongSL_DGDat();                 break; }
            case 6: { ql.TongSL_DGNha();                 break; }
            case 7: { ql.TBThanhTien_GDDat();            break; }
            case 8: { ql.XuatGDThang9_2013();            break; }
            case 9: { System.out.println("Kết thúc chương trình");       break; }
            default: System.out.println("\nKhông có lựa chọn này\n");    break; }
    }
    while(Chon!=9);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}