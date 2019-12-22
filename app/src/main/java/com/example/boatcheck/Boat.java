package com.example.boatcheck;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Boat {

    @SerializedName("IDUser")
    @Expose
    private String iDUser;
    @SerializedName("TenTau")
    @Expose
    private String tenTau;
    @SerializedName("ChieuCao")
    @Expose
    private String chieuCao;
    @SerializedName("ChieuRong")
    @Expose
    private String chieuRong;
    @SerializedName("CanNangKhongTai")
    @Expose
    private String canNangKhongTai;
    @SerializedName("HinhDangDayTau")
    @Expose
    private String hinhDangDayTau;
    @SerializedName("ViTriX")
    @Expose
    private String viTriX;
    @SerializedName("ViTriY")
    @Expose
    private String viTriY;
    @SerializedName("TrangThai")
    @Expose
    private String trangThai;

    /**
     * No args constructor for use in serialization
     *
     */
    public Boat() {
    }

    public Boat(String iDUser, String tenTau, String chieuCao, String chieuRong, String canNangKhongTai , String hinhDangDayTau) {
        this.iDUser = iDUser;
        this.tenTau = tenTau;
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
        this.canNangKhongTai = canNangKhongTai;
        this.hinhDangDayTau=hinhDangDayTau;
    }

    /**
     *
     * @param chieuCao
     * @param iDUser
     * @param canNangKhongTai
     * @param trangThai
     * @param chieuRong
     * @param viTriY
     * @param viTriX
     * @param hinhDangDayTau
     * @param tenTau
     */


    public Boat(String iDUser, String tenTau, String chieuCao, String chieuRong, String canNangKhongTai, String hinhDangDayTau, String viTriX, String viTriY, String trangThai) {
        super();
        this.iDUser = iDUser;
        this.tenTau = tenTau;
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
        this.canNangKhongTai = canNangKhongTai;
        this.hinhDangDayTau = hinhDangDayTau;
        this.viTriX = viTriX;
        this.viTriY = viTriY;
        this.trangThai = trangThai;
    }

    public String getIDUser() {
        return iDUser;
    }

    public void setIDUser(String iDUser) {
        this.iDUser = iDUser;
    }

    public String getTenTau() {
        return tenTau;
    }

    public void setTenTau(String tenTau) {
        this.tenTau = tenTau;
    }

    public String getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(String chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(String chieuRong) {
        this.chieuRong = chieuRong;
    }

    public String getCanNangKhongTai() {
        return canNangKhongTai;
    }

    public void setCanNangKhongTai(String canNangKhongTai) {
        this.canNangKhongTai = canNangKhongTai;
    }

    public String getHinhDangDayTau() {
        return hinhDangDayTau;
    }

    public void setHinhDangDayTau(String hinhDangDayTau) {
        this.hinhDangDayTau = hinhDangDayTau;
    }

    public String getViTriX() {
        return viTriX;
    }

    public void setViTriX(String viTriX) {
        this.viTriX = viTriX;
    }

    public String getViTriY() {
        return viTriY;
    }

    public void setViTriY(String viTriY) {
        this.viTriY = viTriY;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}