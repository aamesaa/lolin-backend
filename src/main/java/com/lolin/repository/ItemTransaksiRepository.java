package com.lolin.repository;

import com.lolin.domain.ItemTransaksi;
import com.lolin.vo.ItemTransaksiVo;
import com.lolin.vo.UserLolinVo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Repository
public interface ItemTransaksiRepository extends JpaRepository<ItemTransaksi, String>{
//    @Query(value = "SELECT new com.lolin.domain.ItemTransaksi(id, nama_barang, qty,  alamat, jns_pengiriman, hrg_deal)FROM item_transaksi where id=(?1)")
//    List<ItemTransaksi> findOneById(int id);
//
//    @Query(value = "SELECT new com.lolin.domain.ItemTransaksi(id, nama_barang, qty,  alamat, jns_pengiriman, hrg_deal)FROM item_transaksi where user_lolin_id=(?1)")
//    List<ItemTransaksi> findOneByIdUser(int user_lolin_id);

//    List<ItemTransaksi> findAll();

    @Query(value = "SELECT new com.lolin.vo.ItemTransaksiVo(id, nama_barang, hrg_deal, qty, alamat, jns_pengiriman, status_barang) from ItemTransaksi")
    List<ItemTransaksiVo> findAllItem();
}
