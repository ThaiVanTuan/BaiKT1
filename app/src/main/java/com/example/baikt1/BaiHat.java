package com.example.baikt1;


public class BaiHat {
    private String Ten;
    private String Noicongtac;
    private String Sosao;
    private String MoTa;
    private int Hinh;

    public BaiHat(String ten, String moTa, int hinh, String noicongtac, String sosao) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
        Noicongtac = noicongtac;
        Sosao = sosao;
    }


    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getNoicongtac() {
        return Noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        Noicongtac = noicongtac;
    }

    public String getSosao() {
        return Sosao;
    }

    public void setSosao(String sosao) {
        Sosao = sosao;
    }

}
