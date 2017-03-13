package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
	
	
	private final String name;
	private final ArrayList<Address> addressess = new ArrayList<Address>();
	
	
	public Business (String name){
		this.name=name;
	}

	
	@Override
	public List<Address> getAddresses() {
		return addressess;
	}

	@Override
	public void addAddress(Address address) {
		addressess.add(address);
		
	}

	public String getName() {
		return name;
	}

	
}

