package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	
	public static void main(String args[])
	{
		Main.create();
		Main.updateEmployee();
	}
	
	public static void create()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetooneMain");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
	
		Employee emp=new Employee();
		emp.setName("Raman");
		emp.setDname("Banking");

		Address add=new Address();
		add.setCity1("delhi");

		add.setEmployee(emp);
		
		em.persist(emp);
		em.persist(add);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public static void updateEmployee() 
	{
	 // Update Employee
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetooneMain");
	    EntityManager em = emf.createEntityManager();
	    System.out.println("Starting Updating on Employee");
		em.getTransaction().begin();
		
		String hql = "update Employee e set e.Dname=:dept where eid=1";
		Query query = em.createQuery(hql);
		query.setParameter("dept","IT");
		query.executeUpdate(); 
			
		//em.persist(status);
		em.getTransaction().commit();
        em.close();
			
		emf.close();
	}
}