package com.lolin.controller;

import com.lolin.domain.UserLolin;
import com.lolin.vo.UserLolinVo;
import com.lolin.service.UserLolinService;
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
public class UserLolinController {
    @Autowired UserLolinService userLolinService;

    @PostMapping("/signup")
    public ResponseEntity<String> saveUser(@RequestBody UserLolinVo userLolinMapperVo) {
        UserLolin userLolin = userLolinService.saveUser(userLolinMapperVo);
        if (userLolin != null) {
            return new ResponseEntity<String>("User Saved", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("User Not Saved", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserLolinVo>> getAllUser() {
        List<UserLolinVo> getAllUser = userLolinService.getAllUser();
        if (getAllUser != null)
        {
            System.out.print(getAllUser.size());
            return new ResponseEntity<List<UserLolinVo>>(getAllUser, HttpStatus.OK);
        }
       return new ResponseEntity<List<UserLolinVo>>(getAllUser, HttpStatus.OK);

    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserLolinVo> getUserById(@PathVariable int id) {
        UserLolinVo getUser = userLolinService.getUserById(id);
        return new ResponseEntity<UserLolinVo>(getUser, HttpStatus.OK);

    }
}
