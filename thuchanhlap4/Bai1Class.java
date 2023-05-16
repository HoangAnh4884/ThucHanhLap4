/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */

        //      Nguyễn Hoàng Anh    1050080002      CNTT1

        //  class GiaoDich
        //  class GiaoDichDat extends GiaoDich
        //  class GiaoDichNha extends GiaoDich
        //  class QuanLy

public class Bai1Class {
    Scanner sc = new Scanner(System.in);
    
    class GiaoDich {
        String maGiaoDich, ngayGiaoDich;
        double donGia,dienTich;

        public GiaoDich() {}

        public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
            this.maGiaoDich = maGiaoDich;
            this.ngayGiaoDich = ngayGiaoDich;
            this.donGia = donGia;
            this.dienTich = dienTich;
        }
        
        void nhap() {}
        void xuat() {}
    }
    
    class GiaoDichDat extends GiaoDich {
        String loaiDat;

        public GiaoDichDat() {}

        public GiaoDichDat(String loaiDat, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
            super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
            this.loaiDat = loaiDat;
        }

        public String getMaGiaoDich() {
            return maGiaoDich; }
        public String getLoaiDat() {
            return loaiDat; }
        public String getNgayGiaoDich() {
            return ngayGiaoDich; }
        public double getDonGia() {
            return donGia; }
        public double getDienTich() {
            return dienTich; }
        
        double thanhTien() {
            double thanhTien = 0;
            if(loaiDat=="A") { thanhTien = dienTich * donGia * 1.5; }
            if(loaiDat=="B" && loaiDat=="C") { thanhTien = dienTich * donGia; }
            return thanhTien;
        }
            
        @Override
        void nhap() {
        System.out.println("Nhập mã giao dịch: "); maGiaoDich=sc.nextLine();
        System.out.println("Nhập loại đất (A / B / C): "); loaiDat=sc.nextLine();
        System.out.println("Nhập ngày giao dịch  (DD/MM/YYYY): "); ngayGiaoDich=sc.nextLine();
        System.out.println("Nhập diện tích: "); dienTich=sc.nextDouble();
        }
        
        @Override
        void xuat() {
            System.out.println(getMaGiaoDich()+"\t\t"+getLoaiDat()+"\t\t"+getNgayGiaoDich()+"\t\t"+getDienTich()+"\t\t"+thanhTien());
        }
    }
    
    class GiaoDichNha extends GiaoDich {
        String loaiNha, diaChi;

        public GiaoDichNha() {}

        public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
            super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
            this.loaiNha = loaiNha;
            this.diaChi = diaChi;
        }

        public String getMaGiaoDich() {
            return maGiaoDich; }
        public String getNgayGiaoDich() {
            return ngayGiaoDich; }
        public String getLoaiNha() {
            return loaiNha; }
        public String getDiaChi() {
            return diaChi; }
        public double getDonGia() {
            return donGia; }
        public double getDienTich() {
            return dienTich; }
        
        double thanhTien() {
            double thanhTien = 0;
            if(loaiNha=="CC") { thanhTien = dienTich * donGia; }
            if(loaiNha=="T") { thanhTien = dienTich * donGia * 0.9; }
            return thanhTien;
        }
        
        @Override
        void nhap() {
        System.out.println("Nhập mã giao dịch: "); maGiaoDich=sc.nextLine();
        System.out.println("Nhập ngày giao dịch  (DD/MM/YYYY): "); ngayGiaoDich=sc.nextLine();
        System.out.println("Nhập loại nhà (CC / T): "); loaiNha=sc.nextLine();
        System.out.println("Nhập địa chỉ: "); diaChi=sc.nextLine();
        System.out.println("Nhập diện tích: "); dienTich=sc.nextDouble();
        }
        
        @Override
        void xuat() {
            System.out.println(getMaGiaoDich()+"\t\t"+getLoaiNha()+"\t\t"+getDiaChi()+"\t\t\t"+getNgayGiaoDich()+"\t\t"+getDienTich()+"\t\t"+thanhTien());
        }
    }
    class QuanLy {
        ArrayList<GiaoDichDat> gdd;
        ArrayList<GiaoDichNha> gdn;
    
        public QuanLy() {
            gdd = new ArrayList<>();    gdn = new ArrayList<>();
        }
    
        public void ThemDS_GDDat(GiaoDichDat d) {
            System.out.print("\nNhập số lượng cần thêm: ");
            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                System.out.print("\nLần nhập thứ " +(i+1)+ ": ");
                if(d instanceof GiaoDichDat) {
                    d=new GiaoDichDat();
                    d.nhap();
                }
                gdd.add(d);
            }
        }
        
        public void ThemDS_GDNha(GiaoDichNha n) {
            System.out.print("\nNhập số lượng cần thêm: ");
            int m = sc.nextInt();
            for(int i=0; i<m; i++) {
                System.out.print("\nLần nhập thứ " +(i+1)+ ": ");
                if(n instanceof GiaoDichNha) {
                    n=new GiaoDichNha();
                    n.nhap();
                }
                gdn.add(n);
            }
        }
        
        public void XuatDS_GDDat() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.println("Mã Giao Dịch\t\tLoại Đất\t\tĐịa chỉ\t\t\tNgày Giao Dịch\t\tDiện Tích\t\tThành Tiền");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            for(GiaoDichDat x: gdd) { x.xuat(); }
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
        
        public void XuatDS_GDNha() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.println("Mã Giao Dịch\t\tLoại Đất\t\tĐịa chỉ\t\t\tNgày Giao Dịch\t\tDiện Tích\t\tThành Tiền");
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            for(GiaoDichDat x: gdd) { x.xuat(); }
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
         
        void TongSL_DGDat() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            int tong =0;
            for(int i=0; i<gdd.size(); i++) {
                //if(loaiDat="A") { tong++; }
            }
            System.out.println("Tổng số lượng đất loại A: ");
            System.out.println("Tổng số lượng đất loại B: ");
            System.out.println("Tổng số lượng đất loại C: ");
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
        }
        
        void TongSL_DGNha() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            
            System.out.println("Tổng số lượng đất loại cao cấp (CC): ");
            System.out.println("Tổng số lượng đất loại thường (T): ");
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");        
        }
        
        void TBThanhTien_GDDat() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            double TBThanhTien = 0;
            for(int i=0; i<gdd.size(); i++) {
            TBThanhTien = TBThanhTien + gdd.get(i).thanhTien(); }
            System.out.printf("Trung bình thành tiền của giao dịch đất là: ", TBThanhTien/gdd.size());
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
        
        void XuatGDThang9_2013() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");    
            for(int i=0; i<gdd.size(); i++) {
            if(gdd.get(i).getNgayGiaoDich()=="/09/2013") {} }
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }
        
        void Menu() {
            System.out.println("\n________________Menu Chức Năng________________");
            System.out.println("1: Thêm DS giao dịch đất");
            System.out.println("2: Thêm DS giao dịch nhà");
            System.out.println("3: Xuất DS giao dịch đất");
            System.out.println("4: Xuất DS giao dịch nhà");
            System.out.println("5: Tính tổng số lượng loại đất");
            System.out.println("6: Tính tổng số lượng loại nhà");
            System.out.println("7: Tính trung bình thành tiền giao dịch đất");
            System.out.println("8: Xuất tất cả giao dịch của tháng 9/2013");
            System.out.println("9: Kết thúc chương trình");
            System.out.println("______________________________________________\n");
        }
    }
    
    
}
