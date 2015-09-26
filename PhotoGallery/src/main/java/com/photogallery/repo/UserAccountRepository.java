package com.photogallery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photogallery.entity.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, String>{

}
