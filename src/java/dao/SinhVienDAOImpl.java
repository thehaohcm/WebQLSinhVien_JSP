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
import java.util.ArrayList;
import model.SinhVien;


public class SinhVienDAOImpl implements SinhVienDAO {

    @Override
    public boolean AddSV(String masv, String ho, String ten, String quequan, String noisinh) {
        try{
            Connection connect=DBConnect.getConnection();
            String sql="INSERT INTO `qlsv`.`sinhvien` (`masv`, `Ho`, `Ten`, `quequan`, `noisinh`) VALUES ('"+masv+"', '"+ho+"', '"+ten+"', '"+quequan+"', '"+noisinh+"');";
            PreparedStatement pr=connect.prepareStatement(sql);
            boolean rs=pr.execute();
            connect.close();
            return true;
        }
        catch(SQLException ex){
            
        }
        return false;
    }

    @Override
    public ArrayList<SinhVien> getListSV() {
        Connection connect=DBConnect.getConnection();
        String sql="SELECT * FROM qlsv.sinhvien;";
        ArrayList<SinhVien> arr=new ArrayList();
        try{
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next()){
                SinhVien sv=new SinhVien();
                sv.setMasv(rs.getString("masv"));
                sv.setHo(rs.getString("Ho"));
                sv.setTen(rs.getString("Ten"));
                sv.setQuequan(rs.getString("quequan"));
                sv.setNoisinh(rs.getString("noisinh"));
                
                arr.add(sv);
            }
            connect.close();
        }
        catch(SQLException ex){
            
        }
        return arr;
    }

    @Override
    public boolean RemoveSV(String masv) {
        try{
            Connection connect=DBConnect.getConnection();
            String sql="DELETE FROM `qlsv`.`sinhvien` WHERE `masv`='"+masv+"';";
            PreparedStatement pr=connect.prepareStatement(sql);
            boolean rs=pr.execute();
            connect.close();
            return true;
        }
        catch(SQLException ex){
            
        }
        return false;
    }
    
    public boolean UpdateSV(String masv_cu,String masv,String ho,String ten,String quequan,String noisinh){
        try{
            Connection connect=DBConnect.getConnection();
            String sql="UPDATE `qlsv`.`sinhvien` SET `masv`='"+masv+"', `Ho`='"+ho+"', `Ten`='"+ten+"', `quequan`='"+quequan+"', `noisinh`='"+noisinh+"' WHERE `masv`='"+masv_cu+"';";
            PreparedStatement pr=connect.prepareStatement(sql);
            int rs=pr.executeUpdate();
            connect.close();
            return true;
        }
        catch(SQLException ex){
            
        }
        return false;
    }
    
    public ArrayList<SinhVien> getSVbyTen(String Ten){
        try{
            Connection connect=DBConnect.getConnection();
            String sql="SELECT * FROM `qlsv`.`sinhvien` WHERE `Ten`='"+Ten+"';";
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            
            ArrayList<SinhVien> arr = new ArrayList();
            while(rs.next()){
                SinhVien sv=new SinhVien();
                sv.setMasv(rs.getString("masv"));
                sv.setHo(rs.getString("ho"));
                sv.setTen(rs.getString("ten"));
                sv.setNoisinh(rs.getString("noisinh"));
                sv.setQuequan(rs.getString("quequan"));
                
                arr.add(sv);
            }
            connect.close();
            return arr;
        }
        catch(SQLException ex){
            
        }
        return null;
    }
    
    public ArrayList<SinhVien> getSVbyMasv(String masv){
        Connection connect=DBConnect.getConnection();
        String sql="SELECT * FROM `qlsv`.`sinhvien` WHERE `masv` LIKE '%"+masv+"%';";
       
        ArrayList<SinhVien> arr=new ArrayList();
        try{
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            while(rs.next()){
                 SinhVien sv=new SinhVien();
                sv.setMasv(rs.getString("masv"));
                sv.setHo(rs.getString("Ho"));
                sv.setTen(rs.getString("Ten"));
                sv.setQuequan(rs.getString("quequan"));
                sv.setNoisinh(rs.getString("noisinh"));
                arr.add(sv);
            }
            connect.close();
            return arr;
        }
        catch(SQLException ex){
            
        }
        return arr;
    }
    
    public SinhVien _getSVbyMasv(String masv){
        Connection connect=DBConnect.getConnection();
        String sql="SELECT * FROM `qlsv`.`sinhvien` WHERE `masv` LIKE '%"+masv+"%';";
        SinhVien sv=new SinhVien();
        try{
            PreparedStatement pr=connect.prepareStatement(sql);
            ResultSet rs=pr.executeQuery();
            if(rs.next()){
                 
                sv.setMasv(rs.getString("masv"));
                sv.setHo(rs.getString("Ho"));
                sv.setTen(rs.getString("Ten"));
                sv.setQuequan(rs.getString("quequan"));
                sv.setNoisinh(rs.getString("noisinh"));
            }
            connect.close();
            return sv;
        }
        catch(SQLException ex){
            
        }
        return null;
    }
    
}
