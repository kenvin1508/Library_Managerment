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
public class StaffData {

    private String manv ;
    private String tennv;
    private String gioitinh ;
    private String ngaysinh ;
    private int cmnd ;
    private String sdt ;
    private String diachi ;
    private String tendn ;
    private String matkhau;
    
   public StaffData(){
       
   }
   public StaffData(String manv ,String tennv ,String gioitinh,String ngaysinh,int cmnd,String sdt,String diachi,String tendn,String matkhau){
       this.manv = manv;
       this.tennv = tennv;
       this.gioitinh = gioitinh;
       this.ngaysinh = ngaysinh ;
       this.cmnd = cmnd;
       this.sdt = sdt;
       this.diachi = diachi;
       this.tendn = tendn;
       this.matkhau = matkhau;           
   }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
  
   
}
