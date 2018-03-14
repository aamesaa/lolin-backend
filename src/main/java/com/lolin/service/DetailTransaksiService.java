package com.lolin.service;

import com.lolin.domain.DetailTransaksi;
import com.lolin.domain.ItemTransaksi;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
public interface DetailTransaksiService {
    List<DetailTransaksi> getAllDetail();
    DetailTransaksi getDetailById(int id);
    List<DetailTransaksi> getDetailByIdUser(int id_user);
    List<DetailTransaksi> getDetailByIdBarang(int id_barang);
    DetailTransaksi saveDetail (DetailTransaksi detailTransaksi);
}
