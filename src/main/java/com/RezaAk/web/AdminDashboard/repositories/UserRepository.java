package com.RezaAk.web.AdminDashboard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RezaAk.web.AdminDashboard.models.User;

@Repository 												
public interface UserRepository extends CrudRepository<User,Long>{
    User findByUsername(String username);
    List<User> findAll();
    
    User findById(Long id);
   
}

