package com.lolin.service;

import com.lolin.domain.ItemTransaksi;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
public interface ItemTransaksiService {

    List<ItemTransaksi> getAllItem();
    List<ItemTransaksi> getItemByIdUser (int id_user);
    ItemTransaksi saveTransaksi (ItemTransaksi itemTransaksi);
    ItemTransaksi getItemById (int id);
    ItemTransaksi updateTransaksi (ItemTransaksi itemTransaksi);
//
//    ItemTransaksi changeItem (int hrg_deal, boolean status);
}
