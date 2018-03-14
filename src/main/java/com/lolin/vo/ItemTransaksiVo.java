package com.lolin.vo;

import java.io.Serializable;

/**
 * Created by charolinesepta on 14/03/18.
 */
public class ItemTransaksiVo implements Serializable{
    private static final long serialVersionUID = -5803908690580045466L;
    private int id;
    private int user_lolin_id;
    private String nama_barang;
    private int harga_deal;
    private int qty;
    private String jns_pengiriman;
    private String alamat;
    private Boolean status_barang;

    public ItemTransaksiVo(int id, int user_lolin_id, String nama_barang, int harga_deal, int qty, String jns_pengiriman, String alamat) {
        this.id = id;
        this.user_lolin_id = user_lolin_id;
        this.nama_barang = nama_barang;
        this.harga_deal = harga_deal;
        this.qty = qty;
        this.jns_pengiriman = jns_pengiriman;
        this.alamat = alamat;
    }

    public ItemTransaksiVo( int id, String nama_barang, int harga_deal, int qty,  String alamat, String jns_pengiriman, Boolean status_barang) {
        this.id = id;
        this.nama_barang = nama_barang;
        this.harga_deal = harga_deal;
        this.qty = qty;
        this.jns_pengiriman = jns_pengiriman;
        this.alamat = alamat;
        this.status_barang = status_barang;
    }

    public ItemTransaksiVo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_lolin_id() {
        return user_lolin_id;
    }

    public void setUser_lolin_id(int user_lolin_id) {
        this.user_lolin_id = user_lolin_id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga_deal() {
        return harga_deal;
    }

    public void setHarga_deal(int harga_deal) {
        this.harga_deal = harga_deal;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getJns_pengiriman() {
        return jns_pengiriman;
    }

    public void setJns_pengiriman(String jns_pengiriman) {
        this.jns_pengiriman = jns_pengiriman;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Boolean getStatus_barang() {
        return status_barang;
    }

    public void setStatus_barang(Boolean status_barang) {
        this.status_barang = status_barang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemTransaksiVo that = (ItemTransaksiVo) o;

        if (id != that.id) return false;
        if (user_lolin_id != that.user_lolin_id) return false;
        if (harga_deal != that.harga_deal) return false;
        if (qty != that.qty) return false;
        if (nama_barang != null ? !nama_barang.equals(that.nama_barang) : that.nama_barang != null) return false;
        if (jns_pengiriman != null ? !jns_pengiriman.equals(that.jns_pengiriman) : that.jns_pengiriman != null)
            return false;
        if (alamat != null ? !alamat.equals(that.alamat) : that.alamat != null) return false;
        return status_barang != null ? status_barang.equals(that.status_barang) : that.status_barang == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user_lolin_id;
        result = 31 * result + (nama_barang != null ? nama_barang.hashCode() : 0);
        result = 31 * result + harga_deal;
        result = 31 * result + qty;
        result = 31 * result + (jns_pengiriman != null ? jns_pengiriman.hashCode() : 0);
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        result = 31 * result + (status_barang != null ? status_barang.hashCode() : 0);
        return result;
    }
}
