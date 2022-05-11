//Admin Controller handle all the request which comes for Admin Panel
// Comments:
// 1. Use http method type (POST, GET, PUT, DELETE, etc.) in all APIs.
// 2. Use service layer to call any DAO. Controller must call service to process or fetch data and return to user. Service calls dao to fetch or process data 
// in db.
// 3. Always use constants if same attribute or key used twice or more than twice.
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DAO.AdminDAO;
import com.bean.Booking;
import com.bean.BookingFood;
import com.bean.Customer;
import com.bean.Food;
import com.bean.Order;

@Controller
public class AdminController {

	@Autowired
	AdminDAO adao;

	// Admin Page Called
	@RequestMapping("/adminPage")
	public String admincall() {
		return "admin";
	}

	// Get All the information of Customer and Send it to adminCustomerDetails.jsp
	// Page
	// Use http method type (POST, GET, PUT, DELETE, etc.)
	@RequestMapping(value = "/acustdetails")
	public String getCustAll(Model m) {
		List<Customer> customers = adao.getAllCustomer();
		m.addAttribute("customers", customers);
		return "adminCustomerDetails";
	}

	// View individual Customer detail and show that on adminCustomerView.jsp Page
	@RequestMapping("/viewCustomer")
	public String getCustomerDetails(@RequestParam("cid") Long cid, Model m) {
		Customer c = adao.getACustomerById(cid);
		m.addAttribute("c", c);
		return "adminCustomerView";
	}

	// All Order Details Which is Given by the Customer
	@RequestMapping("/adminOrderDetails")
	public String getAllOrderDetails(Model m) {
		List<Order> o = adao.getAllOrder();
		m.addAttribute("m", o);
		return "adminAllOrder";
	}

	// Delete order of Customer
	@RequestMapping("/deleteOrder")
	public String deleteOrderByID(@RequestParam("fid") Long fid, Model m) {
		Order f = adao.getOrderDetailById(fid);
		adao.deleteOrderbyId(f);
		List<Order> o = adao.getAllOrder();
		m.addAttribute("m", o);
		return "adminAllOrder";
	}

	// Call add Food Page
	@RequestMapping("/adminFood")
	public String addFood() {
		return "adminFood";
	}

	// save food added By the Admin
	@RequestMapping("/saveFood")
	public String saveFood(@ModelAttribute("food") Food food) {
		adao.saveFood(food);
		return "redirect:/showFood";
	}

	// show all food on showFood Page
	@RequestMapping("/showFood")
	public String showFood(Model m) {
		List<Food> l = adao.getAllFood();
		m.addAttribute("food", l);
		return "adminFoodShow";
	}

	// Fetch Food based On id
	@RequestMapping("/editFood")
	public String getFoodforEdit(@RequestParam("a_fid") Long a_fid, Model m) {
		Food f = adao.getFoodById(a_fid);
		m.addAttribute("f", f);
		return "adminFoodEdit";
	}

	// Update Food with Existing id
	@RequestMapping(value = "/UpdateFood", method = RequestMethod.POST)
	public String updateFood(@ModelAttribute("f") Food f, Model m) {
		adao.saveFood(f);
		List<Food> l = adao.getAllFood();
		m.addAttribute("food", l);
		return "adminFoodShow";
	}

	// Delete Food Operations.
	@RequestMapping("/deleteFood/{a_fid}")
	public String deleteFoodById(@PathVariable("a_fid") Long a_fid, Model m) {
		Food f = adao.getFoodById(a_fid);
		adao.deleteFoodById(f);
		List<Food> l = adao.getAllFood();
		m.addAttribute("food", l);
		return "adminFoodShow";

	}

	// Show all the Booking Details
	@RequestMapping("/adminBooking")
	public String getBookingHistory(Model m) {
		List<Booking> l = adao.getAllBookingData();
		m.addAttribute("booking", l);
		return "adminBooking";
	}

	// Delete Booking with their Id
	@RequestMapping("/deleteBooking")
	public String deleteBookingbyID(@RequestParam("bid") Long bid, Model m) {
		Booking b = adao.getBookingbyId(bid);
		adao.deleteBookingById(b);
		List<Booking> l = adao.getAllBookingData();
		m.addAttribute("booking", l);
		return "adminBooking";
	}

	// Show Order which is given by the Booking Person
	@RequestMapping("/viewBooking")
	public String getBookingDetails(@RequestParam("bid") Long bid, Model m) {
		BookingFood bf = adao.getBookingFoodById(bid);
		m.addAttribute("bf", bf);
		return "viewOrderAdminSide";
	}

	// Approve Page
	@RequestMapping("/approve")
	public String approveOrder() {
		return "redirect:/adminBooking";
	}

	// Delete Booking Order form Booking Histrory
	@RequestMapping("/deletBookingOrder")
	public String deleteBookingOrderByid(@RequestParam("bo_id") Long bo_id, Model m) {
		BookingFood b = adao.getBookingOrderFoodById(bo_id);
		adao.deletBookingOrderById(b);
		List<Booking> l = adao.getAllBookingData();
		m.addAttribute("booking", l);
		return "adminBooking";
	}
}

/*
 * @RequestMapping("/deleteCustomer") public String
 * DeleteCustomer(@RequestParam("cid") Long cid, Model m) { Customer c =
 * adao.getACustomerById(cid); adao.deleteCustomerById(c); m.addAttribute("c",
 * c); // return "adminCustomerView"; return "adminCustomerView"; }
 */