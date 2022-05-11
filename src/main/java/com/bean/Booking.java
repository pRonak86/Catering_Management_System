// Booking Table ( Which store all the data for Booking , with date and Time)
// Comments:
// 1. Entity or model should be in entity or model package.
package com.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	private String b_custName;
	private Long b_contact;
	private String b_email;
	@Temporal(TemporalType.DATE)
	private Date bdate;
	@Temporal(TemporalType.TIME)
	private Date btime;
	private Long bpeoples;
	private String session;

	public String getB_custName() {
		return b_custName;
	}

	public void setB_custName(String b_custName) {
		this.b_custName = b_custName;
	}

	public Long getB_contact() {
		return b_contact;
	}

	public void setB_contact(Long b_contact) {
		this.b_contact = b_contact;
	}

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Long getBpeoples() {
		return bpeoples;
	}

	public void setBpeoples(Long bpeoples) {
		this.bpeoples = bpeoples;
	}

	public Date getBtime() {
		return btime;
	}

	public void setBtime(Date btime) {
		this.btime = btime;
	}

	public String getB_email() {
		return b_email;
	}

	public void setB_email(String b_email) {
		this.b_email = b_email;
	}

}
