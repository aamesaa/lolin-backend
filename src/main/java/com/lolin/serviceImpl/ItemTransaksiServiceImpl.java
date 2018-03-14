package com.lolin.serviceImpl;

import com.lolin.domain.ItemTransaksi;
import com.lolin.repository.ItemTransaksiRepository;
import com.lolin.service.ItemTransaksiService;
import com.lolin.vo.ItemTransaksiVo;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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
    public List<ItemTransaksi> getAllItem() {
     List<ItemTransaksi> listItem = new ArrayList<>();
        listItem = itemTransaksiRepository.findAll();
        if (listItem != null) {
            return listItem;
        }
        return null;
    }

    @Override
    public ItemTransaksi getItemByIdUser(int id_user) {
        ItemTransaksi itemMapper = itemTransaksiRepository.findOneByIdUser(id_user);
        if(itemMapper == null)
        {
            return itemMapper;
        }
        return itemMapper;
    }

}
