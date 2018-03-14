package com.lolin.service;

import com.lolin.domain.ItemTransaksi;
import com.lolin.domain.UserLolin;
import com.lolin.vo.ItemTransaksiVo;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
public interface ItemTransaksiService {
    List<ItemTransaksiVo> getAllItem();
    ItemTransaksi getItemByIdUser (String email);
    ItemTransaksi getItemById (String nama_user);
    ItemTransaksi saveTransaksi (ItemTransaksiVo itemTransaksiVo);
    ItemTransaksi changeItem (int hrg_deal, boolean status);
}
