package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="addid")

	private int AddId;
	@Column(name="city")
	private String city1;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee; 

	public int getAddId() {
		return AddId;
	}
	
	public void setAddId(int addId) {
		AddId = addId;
	}

	public String getCity1() {
		return city1;
	}
	
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	@Override
	public String toString() {
		return "Address [AddId=" + AddId + ", city1=" + city1 + ", employee=" + employee + ", getAddId()=" + getAddId()
				+ ", getCity1()=" + getCity1() + ", getEmployee()=" + getEmployee() + "]";
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
