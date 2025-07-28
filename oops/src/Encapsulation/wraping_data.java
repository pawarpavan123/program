package Encapsulation;

public class wraping_data {
 private String name;
 private String address;
 private int id;
 private long Number;
 
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public long getNumber() {
	return Number;
}

public void setNumber(long number) {
	this.Number = number;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   wraping_data obj = new wraping_data();
   obj.setName("pavan pawar");
   obj.setAddress("at.post.takli");
   obj.setId(101);
   obj.setNumber(8308003861l);
   
      System.out.println(obj.getName());
      System.out.println(obj.getAddress());
      System.out.println(obj.getId());
      System.out.println(obj.getNumber());
	}

}
