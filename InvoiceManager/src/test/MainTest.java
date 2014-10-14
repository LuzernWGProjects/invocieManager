package test;

import ch.InvoiceManager.app.model.database.CustomerDao;
import ch.InvoiceManager.app.model.database.CustomerDaoImpl;
import ch.InvoiceManager.app.model.entities.Customer;

public class MainTest {


		public static void main(String[] args)
		{
			
					Customer c1 = new Customer();
					c1.setFirstName("Muster");
					c1.setSurName("hansi");
					
					CustomerDao cDao = new CustomerDaoImpl();
					
					cDao.persist(c1);
					
					
					System.out.println("hansi gespeichert!");
		}
}
