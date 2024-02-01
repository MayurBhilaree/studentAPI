package student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sname;
	private int rollno;
	private String contactno;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", sname=" + sname + ", rollno=" + rollno + ", contactno=" + contactno
				+ ", address=" + address + "]";
	}
	public student(int id, String sname, int rollno, String contactno, String address) {
		super();
		this.id = id;
		this.sname = sname;
		this.rollno = rollno;
		this.contactno = contactno;
		this.address = address;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
