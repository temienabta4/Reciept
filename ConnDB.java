/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reciept;

/**
 *
 * @author ege
 */
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnDB {
    Connection con=null;
    public static Connection ConnDB1(){
        try {
            String path =  new File(".").getAbsolutePath();
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:"+path+"\\kaldis.db");
          //System.out.println(path);
         return con;
        } catch (Exception e) {
//            System.out.println("conn failed");
JOptionPane.showMessageDialog(null, "Connection Failed , retry!!!");
        return null;
        }
       
    }
//       public static void main(String[] args) {  
//        ConnDB1();  
//    }  
}