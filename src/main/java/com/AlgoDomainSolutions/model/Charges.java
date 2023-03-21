package com.AlgoDomainSolutions.model;

import javax.persistence.Entity;

@Entity
public class Charges {

	private double gst;
	private double delivery;
	private double finalPrice;

	public Charges() {
		super();
	}

	public Charges(double gst, double delivery, double finalPrice) {
		super();
		this.gst = gst;
		this.delivery = delivery;
		this.finalPrice = finalPrice;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getDelivery() {
		return delivery;
	}

	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "Charges [getGst()=" + getGst() + ", getDelivery()=" + getDelivery() + ", getFinalPrice()="
				+ getFinalPrice() + "]";
	}

}
