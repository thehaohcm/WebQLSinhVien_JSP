/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thehaohcm
 */
public class SinhVien {
    private String masv;
    private String Ho;
    private String Ten;
    private String quequan;
    private String noisinh;

    public SinhVien() {
    }

    public SinhVien(String masv, String Ho, String Ten, String quequan, String noisinh) {
        this.masv = masv;
        this.Ho = Ho;
        this.Ten = Ten;
        this.quequan = quequan;
        this.noisinh = noisinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    
}
