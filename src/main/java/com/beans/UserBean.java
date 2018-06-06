package com.beans;

public class UserBean {
	
	private Address address;
	
	private String _strName;
	private int _contactNo;
	//private String _strAddress;
	
	UserBean(){
		System.out.println("In Constructor");
	}
	public void init() 
	{
		System.out.println("In Init");
	}
	
	public String getName() {
		return _strName;
	}
	public void setName(String name) {
		this._strName = name;
	}
	public int getContactNo() {
		return _contactNo;
	}
	public void setContactNo(int contactNo) {
		this._contactNo = contactNo;
	}
	/*public String getAddress() {
		return _strAddress;
	}
	public void setAddress(String address) {
		this._strAddress = address;
	}*/
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address _strAddress) {
		this.address = _strAddress;
	}	
}
