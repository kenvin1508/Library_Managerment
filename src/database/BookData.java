/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author votun
 */
public class BookData {

    private String masach ;
    private String tensach;
    private String theloai ;
    private String tacgia ;
    private String nhaxb ;
    private String namxb ;
    private String giatien ;
    private int soluong ;
    private String linkanh;
    
   public BookData(){
       
   }
   public BookData(String masach ,String tensach ,String theloai,String tacgia,String nhaxb,String namxb,String giatien,int soluong,String linkanh){
       this.masach = masach;
       this.tensach = tensach;
       this.theloai = theloai;
       this.tacgia = tacgia ;
       this.nhaxb = nhaxb;
       this.namxb = namxb;
       this.giatien = giatien;
       this.soluong = soluong;
       this.linkanh = linkanh;           
   }
   public String getMasach() {
        return masach;
    }

    public String getTensach() {
        return tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public String getNamxb() {
        return namxb;
    }

    public String getGiatien() {
        return giatien;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getLinkanh() {
        return linkanh;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public void setNamxb(String namxb) {
        this.namxb = namxb;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setLinkanh(String linkanh) {
        this.linkanh = linkanh;
    }
   
}
