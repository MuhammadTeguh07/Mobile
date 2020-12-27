package com.example.uts_mobile;

public class Model {
    private String mdokter1, mpasien1;
    private int mimg, mimgPasien;

    public String getDokter1() {
        return mdokter1;
    }

    public void setDokter1(String dokter1) {
        this.mdokter1 = dokter1;
    }

    public String getPasien1() {
        return mpasien1;
    }

    public void setPasien1(String pasien1) {
        this.mpasien1 = pasien1;
    }

    public int getImg() {
        return mimg;
    }

    public void setImg(int img) {
        this.mimg = img;
    }

    public int getImgPasien(){
        return mimgPasien;
    }

    public void setImgPasien(int imgPasien){
        this.mimgPasien = imgPasien;
    }
}
