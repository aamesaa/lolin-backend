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

    @ManyToOne()
    @JoinColumn()
    private ItemTransaksi barang;

    @ManyToOne()
    @JoinColumn()
    private UserLolin userLolin;

    private int hrg_bid;

    public DetailTransaksi() {

    }

    public DetailTransaksi(ItemTransaksi barang, UserLolin userLolin, int hrg_bid) {
        this.barang = barang;
        this.userLolin = userLolin;
        this.hrg_bid = hrg_bid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemTransaksi getBarang() {
        return barang;
    }

    public void setBarang(ItemTransaksi barang) {
        this.barang = barang;
    }

    public UserLolin getUserLolin() {
        return userLolin;
    }

    public void setUserLolin(UserLolin userLolin) {
        this.userLolin = userLolin;
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
        if (hrg_bid != that.hrg_bid) return false;
        if (barang != null ? !barang.equals(that.barang) : that.barang != null) return false;
        return userLolin != null ? userLolin.equals(that.userLolin) : that.userLolin == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (barang != null ? barang.hashCode() : 0);
        result = 31 * result + (userLolin != null ? userLolin.hashCode() : 0);
        result = 31 * result + hrg_bid;
        return result;
    }
}
