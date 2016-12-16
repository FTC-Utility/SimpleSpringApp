package com.simplespring.web.dao.IDao;

import com.simplespring.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Eyuel Tadesse on 12/15/2016.
 */
@Repository
public interface IUserDao extends JpaRepository<User, Long> {
    @Query("FROM User u WHERE u.id = :id ")
    User getUserById(@Param("id") String  id);

    @Query("SELECT u FROM User u WHERE u.email = :userEmail")
    User findUserByEmail(@Param("userEmail") String userEmail);
}
