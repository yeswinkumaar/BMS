package com.bms.authserver.models;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;


@Entity
@Table(name="customer_detail")
public class CustomerDetail extends Auditable<String> {
	



	


	@Id
	@Column(name = "Customer_id ")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	private Long customer_id;
	
	@OneToOne
    @JoinColumn(name = "C_ID")
    private  CustomerCredentials id;
	

	@Column(name="first_name")
	@NotNull
	@Size(max=25)
	private  String firstName;
	
	@Column(name="last_name")
	@NotNull
	@Size(max=25)
	private  String lastName;

	
	@Column(name="email_id")
	@NotNull
	@Size(max=25)
	private  String emailId;
	
	@Column(name="Gender")
	@NotNull
	
	private  String gender;
	
	@Column(name="DOB")
	@NotNull
	@Size(max=25)
	private  String dob;
	
	@Column(name="contact_no")
	@NotNull
	@Size(max=10)
	private  String contactNo;
	
	
	@Column(name="PAN")
	@NotNull
	@Size(max=10)
	private  String pan;


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}


	public CustomerCredentials getId() {
		return id;
	}


	public void setId(CustomerCredentials id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getContactNo() {
		return contactNo;
	}


	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}

	public CustomerDetail() {}

	public CustomerDetail( CustomerCredentials id,  String firstName,
			 String lastName,  String emailId, String gender,  String dob,
			 String contactNo,  String pan) {
		super();
		this.id = id;
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.gender = gender;
		this.dob = dob;
		this.contactNo = contactNo;
		this.pan = pan;
	}


	
	
}
