package com.lolin.serviceImpl;

import com.lolin.domain.UserLolin;
import com.lolin.vo.UserLolinVo;
import com.lolin.service.UserLolinService;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

import com.lolin.repository.UserLolinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by charolinesepta on 14/03/18.
 */
@Service
public class UserLolinServiceImpl implements UserLolinService {

    // private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(UserLolinServiceImpl.class);
    private EntityManagerFactory entityManagerFactory;
    private UserLolinRepository userLolinRepository;

//    @Autowired
//    public void setEntityManagerFactory(EntityManagerFactory eentityManagerFactory) {
//        this.entityManagerFactory = eentityManagerFactory;
//    }

    @Autowired
    public void setUserLolinRepository(UserLolinRepository userLolinRepository) {
        this.userLolinRepository = userLolinRepository;
    }

    @Override
    public List<UserLolinVo> getAllUser() {
        List<UserLolinVo> listUser = new ArrayList<>();
        listUser = userLolinRepository.findAllUser();
        if (listUser != null) {
            return listUser;
        }
        return null;
    }

    @Override
    public UserLolinVo getUserById(int id)  {
        UserLolin userLolin = userLolinRepository.findOneById(id);
        if(userLolin == null)
        {
            return null;
        }
        UserLolinVo userLolinVo = new UserLolinVo(userLolin.getId(), userLolin.getNama_user(), userLolin.getEmail(), userLolin.getPassword(), userLolin.getAlamat(), userLolin.getNo_hp());
        return userLolinVo;
    }

    @Override
    public UserLolin getUserByNama(String nama_user) {
        return null;
    }

    @Override
    public UserLolin saveUser(UserLolinVo userLolinVo) {
       UserLolin userLolin = new UserLolin(userLolinVo.getEmail(), userLolinVo.getPassword(), userLolinVo.getNama_user(),
               userLolinVo.getAlamat(), userLolinVo.getNo_hp());
       userLolinRepository.save(userLolin);
       return  userLolin;
    }

    @Override
    public UserLolin loginUser(String email, String password) {
        return null;
    }

    @Override
    public boolean isEmailIsExists(String email) {
        return false;
    }
}
