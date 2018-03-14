package com.lolin.controller;

import com.lolin.domain.DetailTransaksi;
import com.lolin.service.DetailTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Controller
public class DetailTransaksiController {
    @Autowired
    DetailTransaksiService detailTransaksiService;

    @GetMapping("/items/detail")
    public ResponseEntity<List<DetailTransaksi>> getAll() {
        List<DetailTransaksi> getAll = detailTransaksiService.getAllDetail();
        if (getAll != null)
        {
            System.out.print(getAll.size());
            return new ResponseEntity<List<DetailTransaksi>>(getAll, HttpStatus.OK);
        }
        return new ResponseEntity<List<DetailTransaksi>>(getAll, HttpStatus.OK);
    }

    @GetMapping("/item/detail/user/{id_user}")
    public ResponseEntity<DetailTransaksi> getDetailByUser(@PathVariable int id_user) {
        return new ResponseEntity<DetailTransaksi>(this.detailTransaksiService.getDetailByIdUser(id_user), HttpStatus.OK);

    }

    @GetMapping("/item/detail/transaksi/{id_barang}")
    public ResponseEntity<DetailTransaksi> getDetailByBarang(@PathVariable int id_barang) {
        return new ResponseEntity<DetailTransaksi>(this.detailTransaksiService.getDetailByIdBarang(id_barang), HttpStatus.OK);

    }
}
