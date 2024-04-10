package com.egg.news.repositories;

import com.egg.news.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, String>{
    
    /*@Query("SELECT u FROM AppUser u WHERE u.email = :email")*/
    public AppUser findByEmail(String email);
    
}
