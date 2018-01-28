/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thehaohcm
 */
public class TaiKhoanDAOImpl implements TaiKhoanDAO {

    @Override
    public String getPassword(String username) {
        Connection connect=DBConnect.getConnection();
        String sql="SELECT `password` FROM `qlsv`.`TaiKhoan` WHERE `username`='"+username+"';";
        String password = null;
        try{
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            if(rs.next())
            {
                password=rs.getString("password");
            }
            connect.close();
        }
        catch(SQLException ex){
            
        }
        return password;
        
    }

    @Override
    public boolean checkAccount(String username,String password) {
        Connection connect=DBConnect.getConnection();
        String sql="SELECT * FROM `qlsv`.`TaiKhoan` WHERE `username`='"+username+"';";
        try{
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            if(rs.next()){
                if(rs.getString("username").equals(username)&& rs.getString("password").equals(password)){
                    connect.close();
                    return true;
                }
                else{
                    connect.close();
                    return false;
                }
            }
        }
        catch(SQLException ex){
            
        }
        return false;
    }
    
}
