package com.lolin.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Entity
public class DetailTransaksi implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private int id_barang;
    private int id_user;
    private int hrg_bid;

//    @ManyToOne()
//    @JoinColumn()
//    private ItemTransaksi barang;
//
//    @ManyToOne()
//    @JoinColumn()
//    private UserLolin userLolin;

    public DetailTransaksi() {

    }

    public DetailTransaksi(int id_barang, int id_user, int hrg_bid) {
        this.id_barang = id_barang;
        this.id_user = id_user;
        this.hrg_bid = hrg_bid;
    }

    //    public DetailTransaksi(ItemTransaksi barang, UserLolin userLolin, int hrg_bid) {
//        this.barang = barang;
//        this.userLolin = userLolin;
//        this.hrg_bid = hrg_bid;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getHrg_bid() {
        return hrg_bid;
    }

    public void setHrg_bid(int hrg_bid) {
        this.hrg_bid = hrg_bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailTransaksi that = (DetailTransaksi) o;

        if (id != that.id) return false;
        if (id_barang != that.id_barang) return false;
        if (id_user != that.id_user) return false;
        return hrg_bid == that.hrg_bid;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + id_barang;
        result = 31 * result + id_user;
        result = 31 * result + hrg_bid;
        return result;
    }
}
