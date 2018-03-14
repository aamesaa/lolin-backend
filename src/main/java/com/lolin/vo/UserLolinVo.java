package com.lolin.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by charolinesepta on 14/03/18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserLolinVo implements Serializable {
    private static final long serialVersionUID = -5803908690580045466L;
    private int id;
    private String email;
    private String password;
    private String nama_user;
    private String no_hp;
    private String alamat;

    public UserLolinVo(int id, String email, String password, String nama_user, String no_hp, String alamat) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama_user = nama_user;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    public UserLolinVo() {
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLolinVo that = (UserLolinVo) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nama_user != null ? !nama_user.equals(that.nama_user) : that.nama_user != null) return false;
        if (no_hp != null ? !no_hp.equals(that.no_hp) : that.no_hp != null) return false;
        return alamat != null ? alamat.equals(that.alamat) : that.alamat == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nama_user != null ? nama_user.hashCode() : 0);
        result = 31 * result + (no_hp != null ? no_hp.hashCode() : 0);
        result = 31 * result + (alamat != null ? alamat.hashCode() : 0);
        return result;
    }
}
