package com.bms.authserver.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.bms.authserver.dao.CustomerAddressRepository;
import com.bms.authserver.dao.CustomerCredentialsRepository;
import com.bms.authserver.dao.CustomerDetailRepository;
import com.bms.authserver.models.CustomerAddress;
import com.bms.authserver.models.CustomerCredentials;
import com.bms.authserver.models.CustomerDetail;

@Component
public class TestService {

	private final PasswordEncoder passwordEncoder;
	private final CustomerCredentialsRepository repository;
	private final CustomerDetailRepository customerDetail;
	private final CustomerAddressRepository customerAddress;
	
	public TestService(PasswordEncoder passwordEncoder, CustomerCredentialsRepository repository, CustomerDetailRepository customerDetail,CustomerAddressRepository customerAddress) {
		super();
		this.passwordEncoder = passwordEncoder;
		this.repository = repository;
		this.customerDetail=customerDetail;
		this.customerAddress=customerAddress;
	}

	
	@PostConstruct
	public void postConstruct() {
		
		CustomerCredentials credentials = new CustomerCredentials("xyz", passwordEncoder.encode("pass"));
		CustomerDetail cusdetail=new CustomerDetail();
		
		cusdetail.setFirstName("x");
		cusdetail.setLastName("Y");
		cusdetail.setId(credentials);
		
//		
		CustomerAddress cusAddress=new CustomerAddress();
		cusAddress.setAddress("qeer");
		cusAddress.setCity("erd");
		
		//cusAddress.setIsActive("true");
		
		cusAddress.setcId(cusdetail);
		
		repository.save(credentials);
		customerDetail.save(cusdetail);
		customerAddress.save(cusAddress);
	}
	
	
	
}
