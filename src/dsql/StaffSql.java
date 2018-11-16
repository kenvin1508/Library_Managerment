/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsql;

import database.StaffData;
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
public class StaffSql {

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

    public static void checkAcc(String user, String pass) {
        try {
            String sql = "SELECT * FROM staff WHERE TENDN=? AND MATKHAU=?";
            PreparedStatement ps;
            ResultSet rs;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                String userT = rs.getString("TENDN");
                String passT = rs.getString("MATKHAU");
                if (userT.equals("admin") && passT.equals("admin")) {
                    Main main = new Main();
                    main.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, " USER LOGIN");
                }
            } else {
                JOptionPane.showMessageDialog(null, " Username or Password Incorrect");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static StaffData getValue(String value) {

        StaffData sfd = new StaffData();

        try {

            String sql1 = "SELECT * FROM staff WHERE TENNV =? OR MANV=?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            ps1.setString(2, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                sfd.setManv(rs1.getString("MANV"));
                sfd.setTennv(rs1.getString("TENNV"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sfd;

    }

    public static ArrayList<StaffData> getUsersList() {
        ArrayList<StaffData> usersList = new ArrayList<>();

        try {

            String sql1 = "SELECT  * FROM staff     ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            StaffData data1;
            while (rs1.next()) {
                data1 = new StaffData(rs1.getString("MANV"), rs1.getString("TENNV"), rs1.getString("GIOITINH"), rs1.getString("NGAYSINH"), rs1.getInt("CMND"), rs1.getString("SDT"), rs1.getString("DIACHI"), rs1.getString("TENDN"), rs1.getString("MATKHAU"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersList;
    }

    public static String getMNVien(String value) {
        String mp = null;
        try {

            String sql1 = "SELECT concat('NV', ID) as ID from staff where TENNV =?";
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

    public static void adInsert(String tennv, String gioitinh, String ngaysinh, int cmnd, String sdt, String diachi, String tendn, String matkhau) {
        String manv;
        try {

            PreparedStatement ps1, ps2, ps3;
            ResultSet rs1;
            String id = null;
            String sql1 = "INSERT INTO staff (TENNV,GIOITINH,NGAYSINH,CMND,SDT,DIACHI,TENDN,MATKHAU,TYPE) VALUES(?,?,?,?,?,?,?,?,?)";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, tennv);
            ps1.setString(2, gioitinh);
            ps1.setString(3, ngaysinh);
            ps1.setInt(4, cmnd);
            ps1.setString(5, sdt);
            ps1.setString(6, diachi);
            ps1.setString(7, tendn);
            ps1.setString(8, matkhau);
            ps1.setString(9, "Staff");
            ps1.execute();
            manv = getMNVien(tennv);

            String sql3 = "SELECT MAX(ID) AS ID FROM staff";
            ps3 = mySqlConnectt().prepareStatement(sql3);
            rs1 = ps3.executeQuery();
            if (rs1.next()) {
                id = rs1.getString("ID");
            }
             
            String sql2 = "UPDATE staff SET MANV=? where TENNV=? AND ID=?";
            ps2 = mySqlConnectt().prepareStatement(sql2);
            ps2.setString(1, manv);
            ps2.setString(2, tennv);
            ps2.setString(3, id);
            ps2.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adDelete(String value) {
        try {
            String sql = "DELETE FROM staff WHERE MANV = ?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, value);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adUpdate(String manv, String tennv, String gioitinh, String ngaysinh, int cmnd, String sdt, String diachi, String tendn, String matkhau) {
        try {

            String sql = "UPDATE staff SET TENNV=?,GIOITINH=?,NGAYSINH=?,CMND=?,SDT=?,DIACHI=?,TENDN=?,MATKHAU=? WHERE MANV=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, tennv);
            ps.setString(2, gioitinh);
            ps.setString(3, ngaysinh);
            ps.setInt(4, cmnd);
            ps.setString(5, sdt);
            ps.setString(6, diachi);
            ps.setString(7, tendn);
            ps.setString(8, matkhau);
            ps.setString(9, manv);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<StaffData> ListUsers(String value, JTable list) {
        ArrayList<StaffData> usersList = new ArrayList<>();
        PreparedStatement ps1;
        ResultSet rs1;
        try {
            StaffData data1;
            String sql1 = "SELECT * FROM staff WHERE CONCAT(MANV,TENNV,GIOITINH,NGAYSINH,CMND,SDT,DIACHI,TENDN,MATKHAU) LIKE '%" + value + "%'";
            ps1 = mySqlConnectt().prepareStatement(sql1);
//            ps1.setString(1, value + "%");
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                data1 = new StaffData(rs1.getString("MANV"), rs1.getString("TENNV"), rs1.getString("GIOITINH"), rs1.getString("NGAYSINH"), rs1.getInt("CMND"), rs1.getString("SDT"), rs1.getString("DIACHI"), rs1.getString("TENDN"), rs1.getString("MATKHAU"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return usersList;

    }

    public static void Search(String value, JTable list) {
        ArrayList<StaffData> users = ListUsers(value, list);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Ngày Sinh", "CMND", "SDT", "Địa Chỉ", "Tên Đăng Nhập", "Mật Khẩu"});
        Object[] row = new Object[9];
        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getManv();
            row[1] = users.get(i).getTennv();
            row[2] = users.get(i).getGioitinh();
            row[3] = users.get(i).getNgaysinh();
            row[4] = users.get(i).getCmnd();
            row[5] = users.get(i).getSdt();
            row[6] = users.get(i).getDiachi();
            row[7] = users.get(i).getTendn();
            row[8] = users.get(i).getMatkhau();

            model.addRow(row);
        }
        list.setModel(model);

    }

    public static void main(String[] args) {
        System.out.println(getMNVien("Nguyễn Thị Thanh Thảo"));
    }
}
