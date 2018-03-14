package com.lolin.controller;

import com.lolin.domain.DetailTransaksi;
import com.lolin.domain.ItemTransaksi;
import com.lolin.service.DetailTransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public ResponseEntity<List<DetailTransaksi>> getDetailByUser(@PathVariable int id_user) {
        List<DetailTransaksi> getDetailByUser = detailTransaksiService.getDetailByIdUser(id_user);
        return new ResponseEntity <List<DetailTransaksi>>(getDetailByUser, HttpStatus.OK);
    }

    @GetMapping("/item/detail/transaksi/{id_barang}")
    public ResponseEntity<List<DetailTransaksi>> getDetailByBarang(@PathVariable int id_barang) {
        List<DetailTransaksi> getDetailByBarang = detailTransaksiService.getDetailByIdBarang(id_barang);
        return new ResponseEntity<List<DetailTransaksi>>(getDetailByBarang, HttpStatus.OK);

    }

    @GetMapping("/item/detail/{id}")
    public ResponseEntity<DetailTransaksi> getDetailById(@PathVariable int id) {
        return new ResponseEntity<DetailTransaksi>(this.detailTransaksiService.getDetailById(id), HttpStatus.OK);
    }

    @PostMapping("/items/detail")
    public ResponseEntity<String> saveDetail(@RequestBody DetailTransaksi detailTransaksiMapper) {
        DetailTransaksi detailTransaksi = detailTransaksiService.saveDetail(detailTransaksiMapper);
        if (detailTransaksi != null) {
            return new ResponseEntity<String>("Detail Transaksi Saved", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>(" Detail Transaksi Not Saved", HttpStatus.BAD_REQUEST);
        }
    }
}
