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
public class ReturnData {

    private String maphieu ;
    private String masv;
    private String manv ;
    private String masach;
    private String ngaymuon ;
    private String ngayhentra ;
    private String ngaytra;
    private String trangthai ;
    
    
   public ReturnData(){
       
   }
   public ReturnData(String maphieu,String masv,String manv,String masach,String ngaymuon,String ngayhentra,String ngaytra,String trangthai){
       this.maphieu = maphieu;
       this.masv = masv;
       this.manv = manv;
       this.masach = masach ;
       this.ngaymuon = ngaymuon ;
       this.ngayhentra = ngayhentra;
       this.ngaytra =ngaytra;
       this.trangthai = trangthai;
       
               
   }

    public String getNgayhentra() {
        return ngayhentra;
    }

    public void setNgayhentra(String ngayhentra) {
        this.ngayhentra = ngayhentra;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngayhentra) {
        this.ngaytra = ngayhentra;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }


   
}
