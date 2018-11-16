
import dsql.BookSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Copyright(C) VTN from 2018 to Present
 *  All rights Reserved
 * 
 */
/**
 *
 * @author votun
 */
public class testConcat {

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

    public static String getValue(String value) {
        String a = null ;
        try {

            String sql1 = "SELECT concat('LHPL', id) as id, name from so where gioitinh =?";
            PreparedStatement ps1;
            ResultSet rs1;
            ps1 = mySqlConnectt().prepareStatement(sql1);
            ps1.setString(1, value);
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                a=rs1.getString("id");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    public static void adInsert(){
        try {
            PreparedStatement ps1,ps2;
            ResultSet rs1;
                String sql1 = "INSERT INTO so (gioitinh) VALUES(?)";
                ps1 = mySqlConnectt().prepareStatement(sql1);
                ps1.setString(1, "be1"); 
                ps1.execute();
                
               String a=getValue("be1");
               
               String sql2 = "UPDATE so SET name=? where gioitinh=?";
                ps2= mySqlConnectt().prepareStatement(sql2);
                ps2.setString(2, "be1");
                ps2.setString(1, a); 
                ps2.execute();
                
                
                
                    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BookSql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public static void main(String[] args) {      
          adInsert();
    }    

}
