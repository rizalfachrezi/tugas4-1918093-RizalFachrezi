package com.example.bab4;

public class marketplace {
    private String namaproduk,idproduk,namaid;
    private int produk;
    public marketplace(String namaproduk, String idproduk, String namaid, int produk){
        this.namaproduk = namaproduk;
        this.idproduk = idproduk;
        this.namaid = namaid;
        this.produk= produk ;
    }
    public String getNamaproduk(){
        return namaproduk;
    }
    public void setNamaproduk(String namaproduk){
        this.namaproduk = namaproduk;
    }
    public String getIdproduk(){
        return idproduk;
    }
    public void setIdproduk(String idproduk){
        this.idproduk = idproduk;
    }
    public String getNamaid(){
        return namaid;
    }
    public void setNamaid(String namaid){
        this.namaid = namaid;
    }
    public int getProduk(){
        return produk;
    }
    public void setProduk(int produk){
        this.produk = produk;
    }
}
