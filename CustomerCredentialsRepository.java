package com.bms.authserver.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.authserver.models.CustomerCredentials;

@Repository
public interface CustomerCredentialsRepository extends JpaRepository<CustomerCredentials,Long>{

}
