/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author thehaohcm
 */
public interface SinhVienDAO {
    public boolean AddSV(String masv,String ho,String ten,String quequan,String noisinh);
    public ArrayList<SinhVien> getListSV();
    public boolean RemoveSV(String masv);
    public boolean UpdateSV(String masv_cu,String masv,String ho,String ten,String quequan,String noisinh);
    public ArrayList<SinhVien> getSVbyTen(String Ten);
    public ArrayList<SinhVien> getSVbyMasv(String masv);
    public SinhVien _getSVbyMasv(String masv);
}
