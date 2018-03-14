package com.lolin.repository;

import com.lolin.domain.DetailTransaksi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Repository
public interface DetailTransaksiRepository extends JpaRepository<DetailTransaksi, String> {
//    @Query(value = "SELECT new com.lolin.domain.DetailTransaksi(id, hrg_bid, barang_id, user_lolin_id) from DetailTransaksi where id=(?1)")
//    List<DetailTransaksi> findOneById(int id);
//
//    @Query(value = "SELECT new com.lolin.domain.DetailTransaksi(id, hrg_bid, barang_id, user_lolin_id) from DetailTransaksi where user_lolin_id=(?1)")
//    List<DetailTransaksi> findOneByIdUser(int user_lolin_id);

    List<DetailTransaksi> findAll();
}
