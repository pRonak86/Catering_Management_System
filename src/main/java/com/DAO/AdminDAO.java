package com.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.bean.Booking;
import com.bean.BookingFood;
import com.bean.Customer;
import com.bean.Food;
import com.bean.Order;

public class AdminDAO {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	// Get All information of Customer 
	public List<Customer> getAllCustomer() {
		return hibernateTemplate.loadAll(Customer.class);
	}
	//get All customer information by id
	public Customer getACustomerById(Long cid) {
		return hibernateTemplate.get(Customer.class, cid);
	}
	//delete Customer by Id 
	@Transactional
	public void deleteCustomerById(Customer c)
	{
		hibernateTemplate.delete(c);
	}
	// save food Details
	@Transactional
	public void saveFood(Food f) {
		hibernateTemplate.saveOrUpdate(f);
	}
	// Get All information of food 
	public List<Food> getAllFood() {
		return hibernateTemplate.loadAll(Food.class);
	}

	// Get Food By id
	public Food getFoodById(Long a_fid) {
		return hibernateTemplate.get(Food.class, a_fid);
	}
	//Delete Food By Id
	@Transactional
	public void deleteFoodById(Food f)
	{
		hibernateTemplate.delete(f);
	}
	//Get all Booking Data
	public List<Booking> getAllBookingData()
	{
		return hibernateTemplate.loadAll(Booking.class);
	}
	//get Booking details by id
	public Booking getBookingbyId(Long bid)
	{
		return hibernateTemplate.get(Booking.class, bid);
	}
	//Delete Booking Id from Admin
	@Transactional
	public void deleteBookingById(Booking b)
	{
		hibernateTemplate.delete(b);
	}
	//get order based on id
	public BookingFood getBookingFoodById(Long bid)
	{
		return hibernateTemplate.get(BookingFood.class, bid);
	}
	//get All Order 
	public List<Order> getAllOrder()
	{
		return hibernateTemplate.loadAll(Order.class);
	}
	//get Order Details by Id 
	public Order getOrderDetailById(Long fid)
	{
		return hibernateTemplate.get(Order.class, fid);
	}
	//delete All Order by ID 
	@Transactional
	public void deleteOrderbyId(Order o)
	{
		hibernateTemplate.delete(o);
	}
	//delete Booking Details from Booking History
	@Transactional
	public void deletBookingOrderById(BookingFood b)
	{
		hibernateTemplate.delete(b);
	}
	// get Booking  Food Information by the Booking id 
	public BookingFood getBookingOrderFoodById(Long bo_id)
	{
		return hibernateTemplate.get(BookingFood.class, bo_id);
	}
}
