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
public class Bai2_KHNN extends Bai2_KH {
    String quocTich;

    public Bai2_KHNN() { }
    
    public Bai2_KHNN(String quocTich, String maKH, String hoTen, String ngayRaHoaDon, int soLuong, int donGia) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich; }
    public Scanner getSc() {
        return sc; }
    public String getMaKH() {
        return maKH; }
    public String getHoTen() {
        return hoTen; }
    public String getNgayRaHoaDon() {
        return ngayRaHoaDon; }
    public int getSoLuong() {
        return soLuong; }
    public int getDonGia() {
        return donGia; }
    
    double thanhTien() {
        double thanhTien = 0;
        thanhTien = soLuong * donGia;
        return thanhTien;
    }
    
    @Override
    void nhap() {
    System.out.println("Nhập mã khách hàng: "); maKH=sc.nextLine();
    System.out.println("Nhập họ tên: "); hoTen=sc.nextLine();
    System.out.println("Nhập ngày ra hóa đơn  (DD/MM/YYYY): "); ngayRaHoaDon=sc.nextLine();
    System.out.println("Nhập quốc tịch: "); quocTich=sc.nextLine();
    System.out.println("Nhập số lượng: "); soLuong=sc.nextInt();
    System.out.println("Nhập đơn giá: "); donGia=sc.nextInt();
    }
        
    @Override
    void xuat() {
        System.out.println(getMaKH()+"\t\t"+getHoTen()+"\t\t\t"+getNgayRaHoaDon()+"\t\t"+getQuocTich()+"\t\t"+getSoLuong()+"\t\t"+getDonGia()+"\t\t"+thanhTien());
    }
}
