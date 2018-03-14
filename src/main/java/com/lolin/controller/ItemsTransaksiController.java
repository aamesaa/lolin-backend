package com.lolin.controller;

import com.lolin.domain.DetailTransaksi;
import com.lolin.domain.ItemTransaksi;
import com.lolin.domain.UserLolin;
import com.lolin.service.ItemTransaksiService;
import com.lolin.vo.ItemTransaksiVo;
import com.lolin.vo.UserLolinVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Controller
public class ItemsTransaksiController  {
    @Autowired
    ItemTransaksiService itemTransaksiService;

    @GetMapping("/items")
    public ResponseEntity<List<ItemTransaksi>> getAll() {
        List<ItemTransaksi> getAll = itemTransaksiService.getAllItem();
        if (getAll != null)
        {
            System.out.print(getAll.size());
            return new ResponseEntity<List<ItemTransaksi>>(getAll, HttpStatus.OK);
        }
        return new ResponseEntity<List<ItemTransaksi>>(getAll, HttpStatus.OK);
    }

    @GetMapping("/item/user/{id_user}")
    public ResponseEntity<List<ItemTransaksi>> getItemByUser(@PathVariable int id_user) {
        List<ItemTransaksi> getItemByUserPnwr = itemTransaksiService.getItemByIdUser(id_user);
        return new ResponseEntity<List<ItemTransaksi>>(getItemByUserPnwr, HttpStatus.OK);

    }

    @GetMapping("/item/{id}")
    public ResponseEntity<ItemTransaksi> getItemById(@PathVariable int id) {
        return new ResponseEntity<ItemTransaksi>(this.itemTransaksiService.getItemById(id), HttpStatus.OK);

    }

    @PostMapping("/items")
    public ResponseEntity<String> saveItem(@RequestBody ItemTransaksi itemTransaksiMapper) {
        ItemTransaksi itemTransaksi = itemTransaksiService.saveTransaksi(itemTransaksiMapper);
        if (itemTransaksi != null) {
            return new ResponseEntity<String>("Transaksi Saved", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Transaksi Not Saved", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping ("/items/{id}")
    public ResponseEntity<String> updateItem(@PathVariable int id , @RequestBody ItemTransaksi itemTransaksiMapper) {
        ItemTransaksi updatedTransaksi = itemTransaksiService.updateTransaksi(itemTransaksiMapper);
        return new ResponseEntity<String>("Transaksi Updated", HttpStatus.OK);
    }
}
