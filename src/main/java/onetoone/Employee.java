package onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int eid;
	private String name;

	private String Dname;
	@OneToOne(mappedBy="employee")
	private Address address;


	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", Dname=" + Dname + ", getEid()=" + getEid() + ", getName()="
				+ getName() + ", getDname()=" + getDname() + "]";
	}
}