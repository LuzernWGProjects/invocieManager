/**
 * 
 */
package ch.InvoiceManager.app.model.entities;

import java.util.List;
/**
 * @author Oliver
 *
 */
public class Inovice {

	
	int id;
	List<Service> service;
	Customer customer;
	double amount;
	
	
	public List<Service> getService() {
		return service;
	}
	public void setService(List<Service> service) {
		this.service = service;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	
}
