//This table store all the information regarding of Booking order done by Booking Client
// One to One Relationship with Booking 
// Comments:
// 1. Entity or model should be in entity or model package.
package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Booking_Order")
public class BookingFood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bo_id;
	private Long qauntity;
	private String foName;
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "bid")
	private Booking booking;
	
	public Long getBo_id() {
		return bo_id;
	}
	public void setBo_id(Long bo_id) {
		this.bo_id = bo_id;
	}
	public Long getQauntity() {
		return qauntity;
	}
	public void setQauntity(Long qauntity) {
		this.qauntity = qauntity;
	}
	public String getFoName() {
		return foName;
	}
	public void setFoName(String foName) {
		this.foName = foName;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
}
