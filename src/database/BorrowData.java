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
public class BorrowData {

    private String id;
    private String maphieu;
    private String masv;
    private String manv;
    private String masach;
    private String ngaymuon;
    private String ngayhentra;
    private String trangthai;
    private long songaytrehan;

    public BorrowData() {

    }

    public BorrowData(String maphieu, String masv, String manv, String masach, String ngaymuon, String ngayhentra, String trangthai) {

        this.maphieu = maphieu;
        this.masv = masv;
        this.manv = manv;
        this.masach = masach;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        this.trangthai = trangthai;

    }

    public long getSongaytrehan() {
        return songaytrehan;
    }

    public void setSongaytrehan(int songaytrehan) {
        this.songaytrehan = songaytrehan;
    }

    public BorrowData(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNgayHentra() {
        return ngayhentra;
    }

    public void setNgayHentra(String ngayhentra) {
        this.ngayhentra = ngayhentra;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

}
