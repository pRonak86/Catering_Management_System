package com.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.bean.Booking;
import com.bean.BookingFood;
import com.bean.Customer;
import com.bean.Food;
import com.bean.Order;

public class CustomerDAO {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	// Save Customer Information
	@Transactional
	public void saveCustomer(Customer c) {
		hibernateTemplate.save(c);
	}
	// for Login Get data by Username and Password
	public List getCustomer(String username, String password) {
		String sql = "from Customer c where c.cuser=? and c.pass=?";
		List c = (List) hibernateTemplate.find(sql, username, password);
		return c;
	}
	// save Order data which come from Customer
	@Transactional
	public void saveOrder(Order o) {
		hibernateTemplate.save(o);
	}
	// get Order data by id from order class 
	public Order getOrderById(Long fid) {
		return hibernateTemplate.get(Order.class, fid);
	}

	// retrive all dat from Food and Show that on Customer side
	public List<Food> getAllFood() {
		return hibernateTemplate.loadAll(Food.class);
	}

	// Store all data in Booking Table
	@Transactional
	public void bookAllData(Booking o) {
		hibernateTemplate.save(o);
	}

	// find id of Booking
	public Booking getBookingId(Long b_id) {
		return hibernateTemplate.get(Booking.class, b_id);
	}

	// save Booking food
	@Transactional
	public void saveBookingFood(BookingFood b) {
		hibernateTemplate.save(b);
	}
}
/*
 * public Boolean findUser(String username,String password) { Boolean
 * flag=false; String sql="from Customer c where c.cuser=? and c.pass=?"; List
 * c=(List) hibernateTemplate.find(sql, username,password);
 * 
 * if(c!=null && c.size()>0) { flag=true; } else { flag=false; } return flag; }
 */