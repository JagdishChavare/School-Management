package school_management;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String sname;
private String stream ;
private double fees;
public int getId() {
	return id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public void setId(int id) {
	this.id = id;
}

public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
}
