/**
 * 
 */
package com.consignment.consignment.application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Consignment {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consignmentId;
	private String consignmentCategory;
	private String deliveryPartner;
	private String consignmentStatus;
	public Integer getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(Integer consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getConsignmentCategory() {
		return consignmentCategory;
	}
	public void setConsignmentCategory(String consignmentCategory) {
		this.consignmentCategory = consignmentCategory;
	}
	public String getDeliveryPartner() {
		return deliveryPartner;
	}
	public void setDeliveryPartner(String deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}
	public String getConsignmentStatus() {
		return consignmentStatus;
	}
	public void setConsignmentStatus(String consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}
	public Consignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consignment(Integer consignmentId, String consignmentCategory, String deliveryPartner,
			String consignmentStatus) {
		super();
		this.consignmentId = consignmentId;
		this.consignmentCategory = consignmentCategory;
		this.deliveryPartner = deliveryPartner;
		this.consignmentStatus = consignmentStatus;
	}
	

}
