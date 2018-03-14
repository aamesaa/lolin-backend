package com.lolin.serviceImpl;

import com.lolin.domain.DetailTransaksi;
import com.lolin.repository.DetailTransaksiRepository;
import com.lolin.service.DetailTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Service
public class DetailTransaksiServiceImpl implements DetailTransaksiService {
    private EntityManagerFactory entityManagerFactory;
    private DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    public void setDetailTransaksiRepository(DetailTransaksiRepository detailTransaksiRepository) {
        this.detailTransaksiRepository = detailTransaksiRepository;
    }

    @Override
    public List<DetailTransaksi> getAllDetail() {
        List<DetailTransaksi> listDetail = new ArrayList<>();
        listDetail = detailTransaksiRepository.findAll();
        if (listDetail != null) {
            return listDetail;
        }
        return null;
    }

    @Override
    public DetailTransaksi getUserById(int Id) {
        return null;
    }

    @Override
    public DetailTransaksi getDetailByIdUser(int id_user) {
        DetailTransaksi itemDetail = detailTransaksiRepository.findOneByIdUser(id_user);
        if(itemDetail == null)
        {
            return itemDetail;
        }
        return itemDetail;
    }

    @Override
    public DetailTransaksi getDetailByIdBarang(int id_barang) {
        DetailTransaksi itemDetail = detailTransaksiRepository.findOneByIdBarang(id_barang);
        if(itemDetail == null)
        {
            return itemDetail;
        }
        return itemDetail;
    }

    @Override
    public DetailTransaksi saveDetail(DetailTransaksi detailTransaksi) {
        return null;
    }
}
