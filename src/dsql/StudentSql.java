/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsql;

import database.StudentData;
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
public class StudentSql {

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

    public static ArrayList<StudentData> getUsersList() {
        ArrayList<StudentData> usersList = new ArrayList<>();

        try {

            String sql1 = "SELECT  * FROM student     ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            StudentData data1;
            while (rs1.next()) {
                data1 = new StudentData(rs1.getString("MASV"), rs1.getString("TENSV"), rs1.getString("GIOITINH"), rs1.getString("NGAYSINH"), rs1.getInt("CMND"), rs1.getString("SDT"), rs1.getString("DIACHI"), rs1.getString("NGAYCAPTHE"));
                usersList.add(data1);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usersList;
    }

    public static StudentData getValue(String value) {

        StudentData sd = new StudentData();

        try {

            String sql1 = "SELECT * FROM student WHERE MASV =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                sd.setTensv(rs1.getString("TENSV"));
                sd.setGioitinh(rs1.getString("GIOITINH"));
                sd.setNgaycapthe(rs1.getString("NGAYCAPTHE"));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sd;

    }

    public static String getMSVien(String value) {
        String mp = null;
        try {

            String sql1 = "SELECT concat('SV', ID) as ID from student where TENSV =?";
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

    public static void adInsert(String tensv, String gioitinh, String ngaysinh, int cmnd, String sdt, String diachi, String ngaycapthe) {
        String masv;
        try {
            PreparedStatement ps1, ps2, ps3;
            ResultSet rs1;
            String id = null;
            String sql1 = "INSERT INTO student (TENSV,GIOITINH,NGAYSINH,CMND,SDT,DIACHI,NGAYCAPTHE) VALUES(?,?,?,?,?,?,?)";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, tensv);
            ps1.setString(2, gioitinh);
            ps1.setString(3, ngaysinh);
            ps1.setInt(4, cmnd);
            ps1.setString(5, sdt);
            ps1.setString(6, diachi);
            ps1.setString(7, ngaycapthe);
            ps1.execute();
            masv = getMSVien(tensv);
            
            
            String sql3 = "SELECT MAX(ID) AS ID FROM student";
            ps3 = mySqlConnectt().prepareStatement(sql3);
            rs1 = ps3.executeQuery();
            if (rs1.next()) {
                id = rs1.getString("ID");
            }
            
            String sql2 = "UPDATE student SET MASV=? where TENSV=? AND ID=?";
            ps2 = mySqlConnectt().prepareStatement(sql2);
            ps2.setString(1, masv);
            ps2.setString(2, tensv);
            ps2.setString(3, id);
            ps2.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adDelete(String value) {
        try {
            String sql = "DELETE FROM student WHERE MASV = ?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, value);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void adUpdate(String masv, String tensv, String gioitinh, String ngaysinh, int cmnd, String sdt, String diachi, String ngaycapthe) {
        try {

            String sql = "UPDATE student SET TENSV=?,GIOITINH=?,NGAYSINH=?,CMND=?,SDT=?,DIACHI=?,NGAYCAPTHE=? WHERE MASV=?";
            PreparedStatement ps;
            ps = mySqlConnectt().prepareStatement(sql);
            ps.setString(1, tensv);
            ps.setString(2, gioitinh);
            ps.setString(3, ngaysinh);
            ps.setInt(4, cmnd);
            ps.setString(5, sdt);
            ps.setString(6, diachi);
            ps.setString(7, ngaycapthe);
            ps.setString(8, masv);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Success !!!!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<StudentData> ListUsers(String value, JTable list) {
        ArrayList<StudentData> usersList = new ArrayList<>();
        PreparedStatement ps1;
        ResultSet rs1;
        try {
            StudentData data1;
            String sql1 = "SELECT * FROM student WHERE CONCAT(MASV,TENSV,GIOITINH,NGAYSINH,CMND,SDT,DIACHI,NGAYCAPTHE) LIKE '%" + value + "%'";
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                data1 = new StudentData(rs1.getString("MASV"), rs1.getString("TENSV"), rs1.getString("GIOITINH"), rs1.getString("NGAYSINH"), rs1.getInt("CMND"), rs1.getString("SDT"), rs1.getString("DIACHI"), rs1.getString("NGAYCAPTHE"));
                usersList.add(data1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersList;

    }

    public static void Search(String value, JTable list) {
        ArrayList<StudentData> users = ListUsers(value, list);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Mã Sinh Viên", "Tên Sinh Viên", "Giới Tính", "Ngày Sinh", "CMND", "SDT", "Địa Chỉ", "Ngày Cấp Thẻ"});
        Object[] row = new Object[9];
        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getMasv();
            row[1] = users.get(i).getTensv();
            row[2] = users.get(i).getGioitinh();
            row[3] = users.get(i).getNgaysinh();
            row[4] = users.get(i).getCmnd();
            row[5] = users.get(i).getSdt();
            row[6] = users.get(i).getDiachi();
            row[7] = users.get(i).getNgaycapthe();

            model.addRow(row);
        }
        list.setModel(model);

    }

    public static void main(String[] args) {
        System.out.println(getMSVien("Nguyễn Huỳnh Xuân Vi"));
    }
}
