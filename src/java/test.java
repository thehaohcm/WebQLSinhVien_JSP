
import dao.SinhVienDAO;
import dao.SinhVienDAOImpl;
import java.util.ArrayList;
import model.SinhVien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thehaohcm
 */
public class test {
    public static void main(String arg[]){
        ArrayList<SinhVien> arr=new ArrayList();
        SinhVienDAO svd=new SinhVienDAOImpl();
        if(svd.RemoveSV("N13DCCN002")==true)
           System.out.println("Đã xóa ra khỏi danh sách");
        else
           System.out.println("Không thể xóa ra khỏi danh sách");
    }
}
