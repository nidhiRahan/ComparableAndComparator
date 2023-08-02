package ComparatorExample;

public class Emp1 {
private String name;
private int id;
private String phone;
public Emp1(String name, int id, String phone) {
	super();
	this.name = name;
	this.id = id;
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Emp1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", phone=" + phone + "]";
}


}
