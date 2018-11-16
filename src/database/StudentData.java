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
public class StudentData {

    private String masv ;
    private String tensv;
    private String gioitinh ;
    private String ngaysinh ;
    private int cmnd ;
    private String sdt ;
    private String diachi ;
    private String ngaycapthe ;
    
   public StudentData(){
       
   }
   public StudentData(String masv ,String tensv ,String gioitinh,String ngaysinh,int cmnd,String sdt,String diachi,String ngaycapthe){
       this.masv = masv;
       this.tensv = tensv;
       this.gioitinh = gioitinh;
       this.ngaysinh = ngaysinh ;
       this.cmnd = cmnd;
       this.sdt = sdt;
       this.diachi = diachi;
       this.ngaycapthe = ngaycapthe;
               
   }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaycapthe() {
        return ngaycapthe;
    }

    public void setNgaycapthe(String ngaycapthe) {
        this.ngaycapthe = ngaycapthe;
    }

  
 
   
}
