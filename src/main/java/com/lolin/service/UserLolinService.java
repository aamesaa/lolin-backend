package com.lolin.service;

import com.lolin.domain.UserLolin;
import com.lolin.vo.UserLolinVo;

import java.util.List;
/**
 * Created by charolinesepta on 14/03/18.
 */
public interface UserLolinService {
    List<UserLolinVo> getAllUser();
    UserLolinVo getUserById (int id);
    UserLolin getUserByNama (String nama_user);
    UserLolin saveUser (UserLolinVo userLolinVo);
    UserLolin loginUser (String email, String password);
    boolean isEmailIsExists(String email);
}
