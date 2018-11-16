/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsql;

import database.BookData;
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
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

/**
 *
 * @author VTN
 */
public class BookSql {

    public static Connection mySqlConnectt() throws ClassNotFoundException, SQLException {

        String hostName = "localhost:3306/";
        String dbName = "librarydata";
        String userName = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://" + hostName + dbName;
        Connection conn = DriverManager.getConnection(connectionUrl + "?useSSL=false", userName, password);

        return conn;
    }

    public static int checkAcc(String user, String pass) {
        try {
            String sql = "SELECT * FROM account WHERE Username=? AND Password=?";
            PreparedStatement ps;
            ResultSet rs;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                return 1;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public static BookData getValue(String value) {

        BookData bd = new BookData();

        try {

            String sql1 = "SELECT * FROM book WHERE MASACH =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                bd.setMasach(rs1.getString("MASACH"));
                bd.setTensach(rs1.getString("TENSACH"));
                bd.setTheloai(rs1.getString("THELOAI"));
                bd.setTacgia(rs1.getString("TACGIA"));
                bd.setNhaxb(rs1.getString("NHAXB"));
                bd.setNhaxb(rs1.getString("NAMXB"));
                bd.setGiatien(rs1.getString("GIATIEN"));
                bd.setSoluong(rs1.getInt("SOLUONG"));
                bd.setLinkanh(rs1.getString("LINKANH"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bd;

    }

    public static ArrayList<BookData> getUsersList() {
        ArrayList<BookData> usersList = new ArrayList<>();

        try {

            String sql1 = "SELECT  * FROM book     ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            BookData data1;
            while (rs1.next()) {
                data1 = new BookData(rs1.getString("MASACH"), rs1.getString("TENSACH"), rs1.getString("THELOAI"), rs1.getString("TACGIA"), rs1.getString("NHAXB"), rs1.getString("NAMXB"), rs1.getString("GIATIEN"), rs1.getInt("SOLUONG"), rs1.getString("LINKANH"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersList;
    }

    public static String getMSach(String value) {
        String mp = null;
        try {

            String sql1 = "SELECT concat('S', ID) as ID from book where TENSACH =?";
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

    public static void adInsert(String tensach, String theloai, String tacgia, String nhaxb, String namxb, String giatien, int soluong, String linkanh) {
        String masach;
        try {
            PreparedStatement ps1, ps2, ps3;
            ResultSet rs1;
            String id = null;
            String sql1 = "INSERT INTO book (TENSACH,THELOAI,TACGIA,NHAXB,NAMXB,GIATIEN,SOLUONG,LINKANH) VALUES(?,?,?,?,?,?,?,?)";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, tensach);
            ps1.setString(2, theloai);
            ps1.setString(3, tacgia);
            ps1.setString(4, nhaxb);
            ps1.setString(5, namxb);
            ps1.setString(6, giatien);
            ps1.setInt(7, soluong);
            ps1.setString(8, linkanh);
            ps1.execute();
            masach = getMSach(tensach);
            
            String sql3 = "SELECT MAX(ID) AS ID FROM book";
            ps3 = mySqlConnectt().prepareStatement(sql3);
            rs1 = ps3.executeQuery();
            if (rs1.next()) {
                id = rs1.getString("ID");
            }

            String sql2 = "UPDATE book SET MASACH=? where TENSACH=? AND ID=?";
            ps2 = mySqlConnectt().prepareStatement(sql2);
            ps2.setString(1, masach);
            ps2.setString(2, tensach);
            ps2.setString(3, id);
            ps2.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adDelete(String value) {
        try {
            String sql = "DELETE FROM book WHERE MASACH = ?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, value);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adUpdate(String masach, String tensach, String theloai, String tacgia, String nhaxb, String namxb, String giatien, int soluong, String linkanh) {
        try {
            String sql = "UPDATE book SET TENSACH=?,THELOAI=?,TACGIA=?,NHAXB=?,NAMXB=?,GIATIEN=?,SOLUONG=?,LINKANH=? WHERE MASACH=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, tensach);
            ps.setString(2, theloai);
            ps.setString(3, tacgia);
            ps.setString(4, nhaxb);
            ps.setString(5, namxb);
            ps.setString(6, giatien);
            ps.setInt(7, soluong);
            ps.setString(8, linkanh);
            ps.setString(9, masach);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<BookData> ListUsers(String value, JTable list) {
        ArrayList<BookData> usersList = new ArrayList<>();
        PreparedStatement ps1;
        ResultSet rs1;
        try {

            BookData data1;
            String sql1 = "SELECT * FROM book WHERE CONCAT(MASACH,TENSACH,THELOAI,TACGIA,NHAXB,NAMXB,GIATIEN,SOLUONG) LIKE '%" + value + "%'";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                data1 = new BookData(rs1.getString("MASACH"), rs1.getString("TENSACH"), rs1.getString("THELOAI"), rs1.getString("TACGIA"), rs1.getString("NHAXB"), rs1.getString("NAMXB"), rs1.getString("GIATIEN"), rs1.getInt("SOLUONG"), rs1.getString("LINKANH"));
                usersList.add(data1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersList;

    }

    public static void Search(String value, JTable list) {
        ArrayList<BookData> users = ListUsers(value, list);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Mã Sách", "Tên Sách", "Thể Loại", "Tác Giả", "Nhà Xuất Bản", "Năm Xuất Bản", "Giá Tiền", "Số Lượng", "Link Ảnh"});
        Object[] row = new Object[9];

        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getMasach();
            row[1] = users.get(i).getTensach();
            row[2] = users.get(i).getTheloai();
            row[3] = users.get(i).getTacgia();
            row[4] = users.get(i).getNhaxb();
            row[5] = users.get(i).getNamxb();
            row[6] = users.get(i).getGiatien();
            row[7] = users.get(i).getSoluong();
            row[8] = users.get(i).getLinkanh();

            model.addRow(row);
        }
        list.setModel(model);

    }

    public static void updateQualitySub(String masach) {
        try {
            String sql = "UPDATE book SET SOLUONG = SOLUONG - 1 WHERE MASACH=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, masach);
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateQualityPlus(String masach) {
        try {
            String sql = "UPDATE book SET SOLUONG = SOLUONG + 1 WHERE MASACH=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, masach);
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
