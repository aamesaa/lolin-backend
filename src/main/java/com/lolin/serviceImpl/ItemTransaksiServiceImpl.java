package com.lolin.serviceImpl;

import com.lolin.domain.ItemTransaksi;
import com.lolin.domain.UserLolin;
import com.lolin.repository.ItemTransaksiRepository;
import com.lolin.service.ItemTransaksiService;
import com.lolin.vo.ItemTransaksiVo;
import com.lolin.vo.UserLolinVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Service
public class ItemTransaksiServiceImpl implements ItemTransaksiService {

    private EntityManagerFactory entityManagerFactory;
    private ItemTransaksiRepository itemTransaksiRepository;

    @Autowired
    public void setItemTransaksiRepository(ItemTransaksiRepository itemTransaksiRepository) {
        this.itemTransaksiRepository = itemTransaksiRepository;
    }

    @Override
    public List<ItemTransaksiVo> getAllItem() {
        List<ItemTransaksiVo> listItem = new ArrayList<>();
        listItem = itemTransaksiRepository.findAllItem();
        if (listItem != null) {
            return listItem;
        }
        return null;
    }

    @Override
    public ItemTransaksi getItemByIdUser(String email) {
        return null;
    }

    @Override
    public ItemTransaksi getItemById(String nama_user) {
        return null;
    }

    @Override
    public ItemTransaksi saveTransaksi(ItemTransaksiVo itemTransaksiVo) {

//        ItemTransaksi itemTransaksi = new ItemTransaksi(itemTransaksiVo.getUser_lolin_id(), itemTransaksiVo.getNama_barang()
//                , itemTransaksiVo.getQty(), itemTransaksiVo.getHarga_deal(), itemTransaksiVo.getAlamat(),
//                itemTransaksiVo.getJns_pengiriman());
//        itemTransaksiRepository.save(itemTransaksi);
//        return  itemTransaksi;

    return null;


    }

    @Override
    public ItemTransaksi changeItem(int hrg_deal, boolean status) {
        return null;
    }
}
