package entity;

import javax.persistence.Entity;

@Entity
public class studententity {
	
private String name;
private String Address;
private String id;
private String city;


public studententity() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
	return "studententity [name=" + name + ", Address=" + Address + ", id=" + id + "]";
}
}
