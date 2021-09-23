/*
Xây dựng class: HinhChuNhat
+Thuộc tính (attributs): chiều dài, chiều rộng
+Phương thức (methods):
 -Nhập chiều dài, chiều rộng
 -Tính chu vi, diện tích
 -In kết quả
 */
package oop_ex1;

import java.util.Scanner;

public class HinhChuNhat {
    // thuoc tinh (attributes)
    private float chieuDai;
    private float chieuRong;
    
    // constructor
    public HinhChuNhat(){
    }
    public HinhChuNhat(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    //phuong thuc (methods)
    // phuong thuc set, get
    public void SetChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }
    public float GetChieuDai(){
        return chieuDai;
    }
    public void SetChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }
    public float GetChieuRong(){
        return chieuRong;
    }
    // nhap
    public void Nhap(){
        Scanner inp = new Scanner(System.in);
        System.out.print("\n Nhap 2 canh cua hinh chu nhat: ");
        System.out.print("\n + Chieu dai: ");
        chieuDai = inp.nextFloat();
        System.out.print("\n + Chieu rong: ");
        chieuRong = inp.nextFloat();
    }
    // tinh chu vi
    private float TinhChuVi(){
        return 2*(chieuDai+chieuRong);
    }
    // tinh dien tich
    private float TinhDienTich(){
        return chieuDai*chieuRong;
    }
    // in ket qua
    public void InKetQua(){
        System.out.println("\n In ket qua: \n"
                                    + " + Chu vi: "+TinhChuVi()+"\n"
                                    + " + Dien tich: "+TinhDienTich());
    }
    // to string
    public String ToString(){
        String str = "\n In ket qua: \n"
                            + " + Chu vi: "+TinhChuVi()+"\n"
                            + " + Dien tich: "+TinhDienTich();
        return str;
    }
    
}
