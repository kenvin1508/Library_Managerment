    /*
 * Copyright(C) VTN from 2018 to Present
 *  All rights Reserved
 * 
 */
package dsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author votun
 */
public class StatisticsSql {
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
   public static int sumQualityBook(){
       int dem =0;
       
        try {

            String sql1 = "SELECT  SUM(SOLUONG)  FROM book     ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
   public static int sumQualityBorr(){
       int dem =0;
       
        try {

            String sql1 = "SELECT  COUNT(MAPHIEU)  FROM borrowbill    ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
   public static int sumQualityReturn(){
       int dem =0;
       
        try {

            String sql1 = "SELECT  COUNT(MAPHIEU)  FROM returnbill    ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
   public static int sumQualityStudent(){
       int dem =0;
       
        try {

            String sql1 = "SELECT  COUNT(MASV)  FROM student    ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
    public static int sumQualityLate(){
       int dem =0;
       
        try {

            String sql1 = "SELECT  COUNT(MAPHIEU)  FROM latebill    ";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);        
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
    
      public static int coutTypeBook(String theloai){
       int dem =0;
       
        try {

            String sql1 = "SELECT  COUNT(THELOAI)  FROM book WHERE THELOAI = ?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1,theloai);
            rs1 = ps1.executeQuery();
            while (rs1.next()) {
                dem = rs1.getInt(1);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
       return dem ;      
   }
      public static void main(String[] args) {
          System.out.println(coutTypeBook("Tin Học"));
    }
  
}
