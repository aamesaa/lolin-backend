package com.lolin.controller;

import com.lolin.domain.ItemTransaksi;
import com.lolin.service.ItemTransaksiService;
import com.lolin.vo.ItemTransaksiVo;
import com.lolin.vo.UserLolinVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Controller
public class ItemsTransaksiController  {
    @Autowired
    ItemTransaksiService itemTransaksiService;

//    @GetMapping("/items")
//    public ResponseEntity<List<ItemTransaksiVo>> getAllItem() {
//        List<ItemTransaksiVo> getAllItem = itemTransaksiService.getAllItem();
//        if (getAllItem != null)
//        {
//            System.out.print(getAllItem.size());
//            return new ResponseEntity<List<ItemTransaksiVo>>(getAllItem, HttpStatus.OK);
//        }
//        return new ResponseEntity<List<ItemTransaksiVo>>(getAllItem, HttpStatus.OK);
//    }
//
    @GetMapping("/item")
    public ResponseEntity<List<ItemTransaksi>> getAll() {
        List<ItemTransaksi> getAll = itemTransaksiService.getAllItem();
        if (getAll != null)
        {
            System.out.print(getAll.size());
            return new ResponseEntity<List<ItemTransaksi>>(getAll, HttpStatus.OK);
        }
        return new ResponseEntity<List<ItemTransaksi>>(getAll, HttpStatus.OK);
    }
}
