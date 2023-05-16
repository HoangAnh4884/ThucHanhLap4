/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap4;

/**
 *
 * @author HOME
 */
public class Bai2_KHVN extends Bai2_KH {
    String doiTuongKH;
    int dinhMuc;

    public Bai2_KHVN() {
    }

    public Bai2_KHVN(String doiTuongKH, int dinhMuc, String maKH, String hoTen, String ngayRaHoaDon, int soLuong, int donGia) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKH() {
        return doiTuongKH; }
    public int getDinhMuc() {
        return dinhMuc; }
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
        if(soLuong<=dinhMuc) { thanhTien = soLuong * donGia; }
        else { thanhTien = (soLuong*donGia*dinhMuc) + ((soLuong-dinhMuc)*donGia*2.5); }
        return thanhTien;
    }
    
    @Override
    void nhap() {
    System.out.println("Nhập mã khách hàng: "); maKH=sc.nextLine();
    System.out.println("Nhập họ tên: "); hoTen=sc.nextLine();
    System.out.println("Nhập ngày ra hóa đơn  (DD/MM/YYYY): "); ngayRaHoaDon=sc.nextLine();
    System.out.println("Nhập đối tượng khách hàng: "); doiTuongKH=sc.nextLine();
    System.out.println("Nhập số lượng: "); soLuong=sc.nextInt();
    System.out.println("Nhập đơn giá: "); donGia=sc.nextInt();
    System.out.println("Nhập định mức: "); dinhMuc =sc.nextInt();
    }
        
    @Override
    void xuat() {
        System.out.println(getMaKH()+"\t\t"+getHoTen()+"\t\t\t"+getNgayRaHoaDon()+"\t\t"+getDoiTuongKH()+"\t\t"+getSoLuong()+"\t\t"+getDonGia()+"\t\t"+getDinhMuc()+"\t\t"+thanhTien());
    }
}
