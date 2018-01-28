/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thehaohcm
 */
public class DBConnect {
    
    public static java.sql.Connection getConnection(){
        
        java.sql.Connection cons=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv?useUnicode=true&characterEncoding=UTF-8","root","root");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        return cons;
    }
    
    public static void main(String[] args){
       System.out.println(getConnection());
   }
}
