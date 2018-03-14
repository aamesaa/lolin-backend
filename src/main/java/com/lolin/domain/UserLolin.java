package com.lolin.domain;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Entity
public class UserLolin implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String nama_user;
    private String no_hp;

    public UserLolin(String email, String password, String nama_user, String no_hp) {
        this.email = email;
        this.password = password;
        this.nama_user = nama_user;
        this.no_hp = no_hp;
    }

    public UserLolin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLolin userLolin = (UserLolin) o;

        if (id != userLolin.id) return false;
        if (email != null ? !email.equals(userLolin.email) : userLolin.email != null) return false;
        if (password != null ? !password.equals(userLolin.password) : userLolin.password != null) return false;
        if (nama_user != null ? !nama_user.equals(userLolin.nama_user) : userLolin.nama_user != null) return false;
        return no_hp != null ? no_hp.equals(userLolin.no_hp) : userLolin.no_hp == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nama_user != null ? nama_user.hashCode() : 0);
        result = 31 * result + (no_hp != null ? no_hp.hashCode() : 0);
        return result;
    }

    //    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userLolin", cascade = CascadeType.ALL)
//    private Set<ItemTransaksi> itemTransaksis;
//
//    @OneToMany(fetch = FetchType.LAZY,  mappedBy = "userLolin", cascade = CascadeType.ALL)
//    private Set<DetailTransaksi> detailTransaksis;

//    public UserLolin(String email, String password, String nama_user, String no_hp, String alamat, Set<ItemTransaksi> itemTransaksis, Set<DetailTransaksi> detailTransaksis) {
//        this.email = email;
//        this.password = password;
//        this.nama_user = nama_user;
//        this.no_hp = no_hp;
//        this.alamat = alamat;
//        this.itemTransaksis = new HashSet<> ();
//        this.detailTransaksis = new HashSet<>();
//    }
//
//    public UserLolin(int id, String email, String password, String nama_user, String no_hp, String alamat) {
//        this.id = id;
//        this.email = email;
//        this.password = password;
//        this.nama_user = nama_user;
//        this.no_hp = no_hp;
//        this.alamat = alamat;
//    }
//
//    public UserLolin(String email, String password, String nama_user, String no_hp, String alamat) {
//        this.email = email;
//        this.password = password;
//        this.nama_user = nama_user;
//        this.no_hp = no_hp;
//        this.alamat = alamat;
//    }

//    public UserLolin(String email, String password, String nama_user, String no_hp, String alamat) {
//        this.email = email;
//        this.password = password;
//        this.nama_user = nama_user;
//        this.no_hp = no_hp;
//        this.alamat = alamat;
//    }

//    public UserLolin(String email, String alamat, String nama_user, String no_hp) {
//        this.email = email;
//        this.nama_user = nama_user;
//        this.no_hp = no_hp;
//        this.alamat = alamat;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getNama_user() {
//        return nama_user;
//    }
//
//    public void setNama_user(String nama_user) {
//        this.nama_user = nama_user;
//    }
//
//    public String getNo_hp() {
//        return no_hp;
//    }
//
//    public void setNo_hp(String no_hp) {
//        this.no_hp = no_hp;
//    }
//
//    public String getAlamat() {
//        return alamat;
//    }
//
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
//
//    public Set<ItemTransaksi> getItemTransaksis() {
//        return itemTransaksis;
//    }
//
//    public void setItemTransaksis(Set<ItemTransaksi> itemTransaksis) {
//        this.itemTransaksis = itemTransaksis;
//    }
//
//    public Set<DetailTransaksi> getDetailTransaksis() {
//        return detailTransaksis;
//    }
//
//    public void setDetailTransaksis(Set<DetailTransaksi> detailTransaksis) {
//        this.detailTransaksis = detailTransaksis;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        UserLolin userLolin = (UserLolin) o;
//
//        if (id != userLolin.id) return false;
//        if (email != null ? !email.equals(userLolin.email) : userLolin.email != null) return false;
//        if (password != null ? !password.equals(userLolin.password) : userLolin.password != null) return false;
//        if (nama_user != null ? !nama_user.equals(userLolin.nama_user) : userLolin.nama_user != null) return false;
//        if (no_hp != null ? !no_hp.equals(userLolin.no_hp) : userLolin.no_hp != null) return false;
//        if (alamat != null ? !alamat.equals(userLolin.alamat) : userLolin.alamat != null) return false;
//        if (itemTransaksis != null ? !itemTransaksis.equals(userLolin.itemTransaksis) : userLolin.itemTransaksis != null)
//            return false;
//        return detailTransaksis != null ? detailTransaksis.equals(userLolin.detailTransaksis) : userLolin.detailTransaksis == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (nama_user != null ? nama_user.hashCode() : 0);
//        result = 31 * result + (no_hp != null ? no_hp.hashCode() : 0);
//        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
//        result = 31 * result + (itemTransaksis != null ? itemTransaksis.hashCode() : 0);
//        result = 31 * result + (detailTransaksis != null ? detailTransaksis.hashCode() : 0);
//        return result;
}
