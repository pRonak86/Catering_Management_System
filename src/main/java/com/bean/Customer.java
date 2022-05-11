//Customer Registration Table if He visit the Restaurant
// Comments:
// 1. Entity or model should be in entity or model package.
package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@NamedQueries(
@NamedQuery(name = "Customer.findByUserName",query = "Select c from Customer c where c.cuser=? ")
)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	private String cname;
	private Long ccontact;
	private String cemail;
	private String cuser;
	private String pass;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> order;
	
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getCcontact() {
		return ccontact;
	}
	public void setCcontact(Long ccontact) {
		this.ccontact = ccontact;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCuser() {
		return cuser;
	}
	public void setCuser(String cuser) {
		this.cuser = cuser;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	
	
}
