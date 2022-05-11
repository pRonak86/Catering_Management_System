//all the request from the Customer side follow this controller
// Comments:
// 1. Use http method type (POST, GET, PUT, DELETE, etc.) in all APIs.
// 2. Use service layer to call any DAO. Controller must call service to process or fetch data and return to user. Service calls dao to fetch or process data 
// in db.
// 3. Always use constants if same attribute or key used twice or more than twice.
package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.CustomerDAO;
import com.bean.Booking;
import com.bean.BookingFood;
import com.bean.Customer;
import com.bean.Food;
import com.bean.Order;

@Controller
public class CateringController {

	@Autowired
	CustomerDAO cdao;

	// Call Menu Page on Customer side
	@RequestMapping("/menu")
	public String menu(Model m) {

		return "menu";
	}

	// Call the Contact Page
	@RequestMapping("/contact")
	public String contactUs(Model m) {

		return "contact";
	}

	// Call Booking Page (add detail with date and Time)
	@RequestMapping("/booking")
	public String getBooking() {
		return "Booking";
	}

	// Call the register page of Customer
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	// call the Login Page
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login";
	}

	// call the blog Page
	@RequestMapping("/blog")
	public String blogPageCalled() {
		return "blog";
	}

	// Save all the Information of Customer in custome.java page
	// and pass the request to login page
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRecord(@ModelAttribute("customer") Customer customer) {
		cdao.saveCustomer(customer);
		return "login";
	}

	// Check the Login Data and as per the request it transmit request to Customer
	// or Administrator
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("user") String user, @RequestParam("cuser") String cuser,
			@RequestParam("pass") String pass, Model m) {
		String msg = " ";
		ModelAndView view = null;
		if (user.equals("Administrator")) {
			if (cuser.equals("administrator") && pass.equals("Admin")) {
				view = new ModelAndView("admin");
			} else {
				msg = "Invalid Credentidals";
				view = new ModelAndView("login", "msg", msg);
			}
		} else if (user.equals("Customer")) {
			List c = cdao.getCustomer(cuser, pass);
			if (c != null && c.size() > 0) {
				Customer cid = (Customer) c.get(0);
				List<Food> l = cdao.getAllFood();
				m.addAttribute("food", l);

				view = new ModelAndView("menu", "cid", cid);
			} else {
				view = new ModelAndView("login", "msg", msg);
			}
		}
		return view;

	}

	// Store the Order which is done the Customer 
	@RequestMapping("/order")
	public String getOrder(@RequestParam("cid") Long id, @RequestParam("foodName") String foodName, Model m) {
		Order o = new Order();
		o.setFoodName(foodName);
		Customer c = new Customer();
		c.setCid(id);
		o.setCustomer(c);
		cdao.saveOrder(o);
		Long fid = o.getFid();
		Order o1 = cdao.getOrderById(fid);
		m.addAttribute("fid", o1.getFid());
		m.addAttribute("foodName", o1.getFoodName());
		return "FinalOrder";
	}
	// Confirm Order and and pass that on ConfirmOrder Page with Message
	@RequestMapping("/confirm")
	public String getConfirm() {
		return "ConfirmOrder";
	}

	// Save Booking Data
	@RequestMapping("/saveBooking")
	public String saveBooking(@RequestParam("b_custName") String b_custName, @RequestParam("b_contact") Long b_contact,
			@RequestParam("b_email") String b_email,
			@RequestParam("bdate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date bdate,
			@RequestParam("btime") @DateTimeFormat(pattern = "HH:ss") Date btime,
			@RequestParam("bpeoples") Long bpeoples, @RequestParam("session") String session, Model m) {

		Booking booking = new Booking();
		booking.setB_custName(b_custName);
		booking.setB_contact(b_contact);
		booking.setB_email(b_email);
		booking.setBdate(bdate);
		booking.setBtime(btime);
		booking.setBpeoples(bpeoples);
		booking.setSession(session);
		cdao.bookAllData(booking); // Book details in table
		Long b_id = booking.getBid(); // get last update id by getBid() because same trascation is happen
		Booking b = cdao.getBookingId(b_id);
		List<Food> l = cdao.getAllFood();
		m.addAttribute("b_id", b.getBid());
		m.addAttribute("food", l);
		return "menuBooking";
	}
	//Store Booking Food After Booking Register
	@RequestMapping("/bookingSuccess")
	public String FinalBooking(@RequestParam("b_id") Long b_id, @RequestParam("foName") String foName,
			@RequestParam("qauntity") Long qauntity, Model m) {
		Booking b = new Booking();
		b.setBid(b_id);
		BookingFood bf = new BookingFood();
		bf.setFoName(foName);
		bf.setQauntity(qauntity);
		bf.setBooking(b);
		cdao.saveBookingFood(bf);
		m.addAttribute("b_id", b_id);
		return "bookingSuccess";
	}

}
