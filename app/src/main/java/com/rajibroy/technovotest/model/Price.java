package com.rajibroy.technovotest.model;

import com.google.gson.annotations.SerializedName;

public class Price{

	@SerializedName("price")
	private double price;

	@SerializedName("currency")
	private String currency;

	@SerializedName("price_uuid")
	private String priceUuid;

	@SerializedName("start_date")
	private String startDate;

	public double getPrice(){
		return price;
	}

	public String getCurrency(){
		return currency;
	}

	public String getPriceUuid(){
		return priceUuid;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setPriceUuid(String priceUuid) {
		this.priceUuid = priceUuid;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Price{" +
				"price=" + price +
				", currency='" + currency + '\'' +
				", priceUuid='" + priceUuid + '\'' +
				", startDate='" + startDate + '\'' +
				'}';
	}
}