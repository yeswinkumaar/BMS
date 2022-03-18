package com.bms.authserver.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name="account_details")
public class AccountDetail extends Auditable<String> {

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	private Long id;
	
	
	//ManytoOne
	
	
	@Column(name="account_number",unique = true,nullable = false)
	@Size(max=13)
	private String accountNumber;

	@Column(name="account_type")
	@Size(max=50)
	private String accountType;

}
