/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsql;

import database.BorrowData;
import database.ReturnData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ui.Main;
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

/**
 *
 * @author VTN
 */
public class BorrowSql {

    public static Connection mySqlConnectt() throws ClassNotFoundException, SQLException {

        String hostName = "localhost:3306/";
        String dbName = "librarydata";
        String userName = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        //jdbc:mysql://localhost:3306/simplehr
        String connectionUrl = "jdbc:mysql://" + hostName + dbName;
        Connection conn = DriverManager.getConnection(connectionUrl + "?useSSL=false", userName, password);

        return conn;
    }

    public static ArrayList<BorrowData> getUsersList() {
        ArrayList<BorrowData> usersList = new ArrayList<>();

        try {

            String sql1 = "SELECT  * FROM borrowbill ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            BorrowData data1;
            while (rs1.next()) {
                data1 = new BorrowData(rs1.getString("MAPHIEU"), rs1.getString("MASV"), rs1.getString("MANV"), rs1.getString("MASACH"), rs1.getString("NGAYMUON"), rs1.getString("NGAYHENTRA"), rs1.getString("TRANGTHAI"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersList;

    }

    public static String getMPhieu(String value) {
        String mp = null;
        try {

            String sql1 = "SELECT concat('MP', ID) as ID from borrowbill where MASV =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                mp = rs1.getString("ID");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mp;
    }

    public static void adInsert(String masv, String manv, String masach, String ngaymuon, String ngayhentra, String trangthai) {
        String maphieu;
        try {
            String sql = "INSERT INTO borrowbill (MASV,MANV,MASACH,NGAYMUON,NGAYHENTRA,TRANGTHAI) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps1, ps2, ps3;
            ResultSet rs1;
            String id = null ;
            ps1 = mySqlConnectt().prepareStatement(sql);
            ps1.setString(1, masv);
            ps1.setString(2, manv);
            ps1.setString(3, masach);
            ps1.setString(4, ngaymuon);
            ps1.setString(5, ngayhentra);
            ps1.setString(6, trangthai);
            ps1.execute();
            
            maphieu = getMPhieu(masv);
            String sql3 = "SELECT MAX(ID) AS ID FROM borrowbill";
            ps3 = mySqlConnectt().prepareStatement(sql3);         
            rs1 = ps3.executeQuery();
            if(rs1.next()){
                id=rs1.getString("ID");
            }
            String sql2 = "UPDATE borrowbill SET MAPHIEU=? where MASV=? AND ID=?";
            ps2 = mySqlConnectt().prepareStatement(sql2);
            ps2.setString(1, maphieu);
            ps2.setString(2, masv);
            ps2.setString(3, id);
            ps2.execute();
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    public static void adDelete(String maphieu, String masach) {
        try {
            String sql = "DELETE  FROM borrowbill WHERE MAPHIEU=? AND MASACH=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, maphieu);
            ps.setString(2, masach);
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adUpdate( String ngayhentra, String maphieu) {
        try {
            String sql = "UPDATE borrowbill SET NGAYHENTRA=? WHERE MAPHIEU=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);      
            ps.setString(1, ngayhentra);
            ps.setString(2, maphieu);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<BorrowData> ListUsers(String value, JTable list) {
        ArrayList<BorrowData> usersList = new ArrayList<>();
        PreparedStatement ps1;
        ResultSet rs1;
        try {
            BorrowData data1;
            String sql1 = "SELECT * FROM borrowbill WHERE CONCAT(MAPHIEU,MASV,MANV,MASACH,NGAYMUON,NGAYHENTRA,TRANGTHAI) LIKE '%" + value + "%'";
            ps1 = mySqlConnectt().prepareStatement(sql1);
//            ps1.setString(1, value + "%");
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                data1 = new BorrowData(rs1.getString("MAPHIEU"), rs1.getString("MASV"), rs1.getString("MANV"), rs1.getString("MASACH"), rs1.getString("NGAYMUON"), rs1.getString("NGAYHENTRA"), rs1.getString("TRANGTHAI"));
                usersList.add(data1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersList;

    }

    public static void Search(String value, JTable list) {
        ArrayList<BorrowData> users = ListUsers(value, list);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Mã Phiếu Mượn", "Mã Sinh Viên", "Mã Nhân Viên", "Mã Sách", "Ngày Mượn", "Ngày Hẹn Trả", "Trạng Thái"});
        Object[] row = new Object[7];
        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getMaphieu();
            row[1] = users.get(i).getMasv();
            row[2] = users.get(i).getManv();
            row[3] = users.get(i).getMasach();
            row[4] = users.get(i).getNgaymuon();
            row[5] = users.get(i).getNgayHentra();
            row[6] = users.get(i).getTrangthai();

            model.addRow(row);
        }
        list.setModel(model);

    }

    public static BorrowData getValue(String valueMsv, String valueMnv, String valueMs) {
        BorrowData brd = new BorrowData();
        try {

            String sql1 = "SELECT  * FROM student WHERE MASV =? ";
            String sql2 = "SELECT  * FROM staff WHERE MANV =? ";
            String sql3 = "SELECT  * FROM book WHERE MASACH =? ";
            PreparedStatement ps1, ps2, ps3;
            ResultSet rs1, rs2, rs3;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, valueMsv);
            rs1 = ps1.executeQuery();

            ps2 = mySqlConnectt().prepareStatement(sql2);
            ps2.setString(1, valueMnv);
            rs2 = ps2.executeQuery();

            ps3 = mySqlConnectt().prepareStatement(sql3);
            ps3.setString(1, valueMs);
            rs3 = ps3.executeQuery();

            while (rs1.next()) {
                String msv = rs1.getString("TENSV");
                brd.setMasv(msv);
            }
            while (rs2.next()) {
                String mnv = rs2.getString("TENNV");
                brd.setManv(mnv);
            }
            while (rs3.next()) {
                String ms = rs3.getString("TENSACH");
                brd.setMasach(ms);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BorrowSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return brd;
    }

    public static int getQualityBorr(String value) {

        int dem = 0;

        try {

            String sql1 = "SELECT * FROM borrowbill WHERE MASV =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                dem++;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dem;

    }

    public static void returnBInsert(String maphieu, String masv, String manv, String masach, String ngaymuon, String ngayhentra, String ngaytra, String trangthai) {
        try {
            PreparedStatement ps1;

            String sql1 = "INSERT INTO returnbill (MAPHIEU,MASV,MANV,MASACH,NGAYMUON,NGAYHENTRA,NGAYTRA,TRANGTHAI) VALUES(?,?,?,?,?,?,?,? )";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, maphieu);
            ps1.setString(2, masv);
            ps1.setString(3, manv);
            ps1.setString(4, masach);
            ps1.setString(5, ngaymuon);
            ps1.setString(6, ngayhentra);
            ps1.setString(7, ngaytra);
            ps1.setString(8, trangthai);
            ps1.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<ReturnData> getReturnList() {
        ArrayList<ReturnData> usersList = new ArrayList<>();

        try {

            String sql1 = "SELECT  * FROM returnbill     ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            ReturnData data1;
            while (rs1.next()) {
                data1 = new ReturnData(rs1.getString("MAPHIEU"), rs1.getString("MASV"), rs1.getString("MANV"), rs1.getString("MASACH"), rs1.getString("NGAYMUON"), rs1.getString("NGAYHENTRA"), rs1.getString("NGAYTRA"), rs1.getString("TRANGTHAI"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersList;
    }

        public static int checkQualityBorr(String value) {
        int dem = 0;
        try {

            String sql1 = "SELECT * FROM borrowbill WHERE MASV =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                long sl = Main.checkQualityLate(rs1.getString("NGAYHENTRA"));
                if (sl > 5) {
                    dem++;
                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dem;
    }

    public static BorrowData getValueLateBook() {
        BorrowData brd = new BorrowData();
        try {

            String sql1 = "SELECT * FROM borrowbill";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                long sl = Main.checkQualityLate(rs1.getString("NGAYHENTRA"));
                if (sl > 5) {
                    brd.setMaphieu(rs1.getString("MAPHIEU"));
                    brd.setMasv(rs1.getString("MASV"));
                    brd.setMasach(rs1.getString("MASACH"));
                    brd.setNgayHentra(rs1.getString("NGAYHENTRA"));
                    brd.setSongaytrehan((int) sl);
                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return brd;
    }

    public static void insertLateBook() {
        try {
             String sq2 = "DELETE  FROM latebill ";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sq2);        
            ps.execute();
            
            String sql = "SELECT * FROM borrowbill";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                long sl = Main.checkQualityLate(rs1.getString("NGAYHENTRA"));
                if (sl > 5) {
                    String sql1 = "INSERT INTO latebill (MAPHIEU,MASV,MASACH,NGAYHENTRA,SONGAYTREHAN) VALUES(?,?,?,?,? )";
                    ps1 = mySqlConnectt().prepareStatement(sql1);
                    ps1.setString(1, rs1.getString("MAPHIEU"));
                    ps1.setString(2, rs1.getString("MASV"));
                    ps1.setString(3, rs1.getString("MASACH"));
                    ps1.setString(4, rs1.getString("NGAYHENTRA"));
                    ps1.setLong(5, sl);
                    ps1.execute();
                }

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
