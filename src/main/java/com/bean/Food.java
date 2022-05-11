// Admin Can Add the Food.
// Comments:
// 1. Entity or model should be in entity or model package.
package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin_Food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long a_fid;
	private String a_foodName;
	private String a_foodDescrp;
	
	public Long getA_fid() {
		return a_fid;
	}
	public void setA_fid(Long a_fid) {
		this.a_fid = a_fid;
	}
	public String getA_foodName() {
		return a_foodName;
	}
	public void setA_foodName(String a_foodName) {
		this.a_foodName = a_foodName;
	}
	public String getA_foodDescrp() {
		return a_foodDescrp;
	}
	public void setA_foodDescrp(String a_foodDescrp) {
		this.a_foodDescrp = a_foodDescrp;
	}
	
}
