package com.lolin.service;

import com.lolin.domain.DetailTransaksi;
import com.lolin.domain.UserLolin;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
public interface DetailTransaksiService {
    List<DetailTransaksi> getAllDetail();
    DetailTransaksi getUserById(int Id);
    DetailTransaksi getUserByIdUser(int user_lolin_id);
    DetailTransaksi getUserByNama (String nama_user);
    DetailTransaksi saveDetail (DetailTransaksi detailTransaksi);
}
