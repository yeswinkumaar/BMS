package com.bms.authserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.authserver.models.AccountDetail;

@Repository
public interface AccountDetailRePository extends JpaRepository<AccountDetail,Long> {

}
