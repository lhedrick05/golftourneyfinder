package com.lhedrick.golftourneyfinder.models.data;

import com.lhedrick.golftourneyfinder.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmailAddress(String emailAddress);

}
