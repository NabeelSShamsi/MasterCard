package com.nshamsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CityConnection {
	@Id
	@GeneratedValue
	private int connectionId;
	private String city1;
	private String city2;
	
	public int getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	@Override
	public String toString() {
		return "CityConnection [connectionId=" + connectionId + ", city1=" + city1 + ", city2=" + city2 + "]";
	}

}
