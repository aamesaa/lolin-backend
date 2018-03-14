package com.lolin.repository;

import com.lolin.domain.UserLolin;
import com.lolin.vo.UserLolinVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by charolinesepta on 14/03/18.
 */
@Repository
public interface UserLolinRepository extends JpaRepository<UserLolin, String>{

    //@Query(value = "SELECT new com.lolin.domain.UserLolin(email, nama_user, alamat, no_hp) from UserLolin where id=(?1)")

//    //@Query(value = "SELECT new com.lolin.domain.UserLolin(email, nama_user, alamat, no_hp) from UserLolin where nama_user=(?1)")
//    UserLolin findOneByUname(String nama_user);
//
//    //@Query(value = "SELECT new com.lolin.domain.UserLolin(email, nama_user, alamat, no_hp) from UserLolin where email=(?1)")
//    UserLolin findOneByEmail(String email);

//    List<UserLolinVo> findAll();
    List<UserLolin> findAll();

    UserLolin findOneById(int id);
//
//    @Query(value = "SELECT new com.lolin.vo.UserLolinVo(id, email, password, nama_user, alamat, no_hp) from UserLolin")
//    List<UserLolinVo> findAllUser();
}
