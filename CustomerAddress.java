package com.bms.authserver.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;



@Entity
@Table(name="customer_address")
public class CustomerAddress extends Auditable<String> {

	
	
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	private Long addressId;
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private CustomerDetail cId;
	
	
	@Column(name="address")
	@Size(max=50)
	private String address;
	
	
	@Column(name="city")
	@Size(max=20)
	private String city;
	
	
	@Column(name="state")
	@Size(max=20)
	private String state;
	
	
	@Column(name="pincode")
	@Size(max=6)
	private String pincode;
	
	@Column(name="country")
	@Size(max=20)
	private String country;
	
	@Column(name="is_active")
	//@Type(type="yes_no")
	private String isActive;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public CustomerDetail getcId() {
		return cId;
	}

	public void setcId(CustomerDetail cId) {
		this.cId = cId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public CustomerAddress( CustomerDetail cId,String address,  String city,
			String state, String pincode,  String country,
			String isActive) {
		super();
		this.cId = cId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.isActive = isActive;
	}
	
	public CustomerAddress() {}
	
}
