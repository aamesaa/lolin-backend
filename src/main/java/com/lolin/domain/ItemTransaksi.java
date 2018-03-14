package com.lolin.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Entity
public class ItemTransaksi implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private int id_user;

//    @ManyToOne()
//    @JoinColumn()
//    private UserLolin userLolin;

    private String nama_barang;
    private int qty;
    private String jns_pengiriman;
    private String alamat;
    private int hrg_deal;
    private boolean status_barang;

//    id_user, nama_barang, qty,  alamat, jns_pengiriman, hrg_deal

    public ItemTransaksi(int id, int id_user, String nama_barang, int qty, String jns_pengiriman, String alamat, int hrg_deal, boolean status_barang) {
        this.id = id;
        this.id_user = id_user;
        this.nama_barang = nama_barang;
        this.qty = qty;
        this.jns_pengiriman = jns_pengiriman;
        this.alamat = alamat;
        this.hrg_deal = hrg_deal;
        this.status_barang = status_barang;
    }

    public ItemTransaksi(int id_user, String nama_barang, String alamat, int qty, int hrg_deal, String jns_pengiriman, boolean status_barang) {
        this.id_user = id_user;
        this.nama_barang = nama_barang;
        this.alamat = alamat;
        this.qty = qty;
        this.jns_pengiriman = jns_pengiriman;
        this.hrg_deal = hrg_deal;
        this.status_barang = status_barang;
    }

    public ItemTransaksi() {

    }

    //    @OneToMany(fetch = FetchType.LAZY,  mappedBy = "barang", cascade = CascadeType.ALL)
//    private Set<DetailTransaksi> detailTransaksis;

//    public ItemTransaksi() {
//
//    }
//
//    public ItemTransaksi(UserLolin userLolin, String nama_barang, int qty, String jns_pengiriman, String alamat, int hrg_deal, boolean status_barang, Set<DetailTransaksi> detailTransaksis) {
//        this.userLolin = userLolin;
//        this.nama_barang = nama_barang;
//        this.qty = qty;
//        this.jns_pengiriman = jns_pengiriman;
//        this.alamat = alamat;
//        this.hrg_deal = hrg_deal;
//        this.status_barang = status_barang;
//        this.detailTransaksis =  new HashSet<>();
//    }
//
//    public ItemTransaksi(int id, UserLolin userLolin, String nama_barang, int qty, String jns_pengiriman, String alamat, int hrg_deal, boolean status_barang, Set<DetailTransaksi> detailTransaksis) {
//        this.id = id;
//        this.userLolin = userLolin;
//        this.nama_barang = nama_barang;
//        this.qty = qty;
//        this.jns_pengiriman = jns_pengiriman;
//        this.alamat = alamat;
//        this.hrg_deal = hrg_deal;
//        this.status_barang = status_barang;
//        this.detailTransaksis =  new HashSet<>();
//    }
//
//    public ItemTransaksi(String nama_barang, int qty, String jns_pengiriman, String alamat, int hrg_deal, boolean status_barang, Set<DetailTransaksi> detailTransaksis) {
//        this.nama_barang = nama_barang;
//        this.qty = qty;
//        this.jns_pengiriman = jns_pengiriman;
//        this.alamat = alamat;
//        this.hrg_deal = hrg_deal;
//        this.status_barang = status_barang;
//        this.detailTransaksis =  new HashSet<>();
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
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

    public int getHrg_deal() {
        return hrg_deal;
    }

    public void setHrg_deal(int hrg_deal) {
        this.hrg_deal = hrg_deal;
    }

    public boolean isStatus_barang() {
        return status_barang;
    }

    public void setStatus_barang(boolean status_barang) {
        this.status_barang = status_barang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemTransaksi that = (ItemTransaksi) o;

        if (id != that.id) return false;
        if (id_user != that.id_user) return false;
        if (qty != that.qty) return false;
        if (hrg_deal != that.hrg_deal) return false;
        if (status_barang != that.status_barang) return false;
        if (nama_barang != null ? !nama_barang.equals(that.nama_barang) : that.nama_barang != null) return false;
        if (jns_pengiriman != null ? !jns_pengiriman.equals(that.jns_pengiriman) : that.jns_pengiriman != null)
            return false;
        return alamat != null ? alamat.equals(that.alamat) : that.alamat == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + id_user;
        result = 31 * result + (nama_barang != null ? nama_barang.hashCode() : 0);
        result = 31 * result + qty;
        result = 31 * result + (jns_pengiriman != null ? jns_pengiriman.hashCode() : 0);
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        result = 31 * result + hrg_deal;
        result = 31 * result + (status_barang ? 1 : 0);
        return result;
    }
}
