package com.rajibroy.technovotest.model;

import com.google.gson.annotations.SerializedName;

public class Properties{

	@SerializedName("bundle_group")
	private String bundleGroup;

	@SerializedName("available_on")
	private String availableOn;

	@SerializedName("D")
	private String D;

	@SerializedName("sell_on_its_own")
	private String sellOnItsOwn;

	@SerializedName("G")
	private String G;

	@SerializedName("available")
	private String available;

	@SerializedName("print_order")
	private String printOrder;

	@SerializedName("print_item_component_order")
	private String printItemComponentOrder;

	@SerializedName("N")
	private String N;

	@SerializedName("spiced")
	private String spiced;

	@SerializedName("offer_price")
	private String offerPrice;

	@SerializedName("VE")
	private String vE;

	@SerializedName("offer")
	private String offer;

	@SerializedName("categories_epos")
	private String categoriesEpos;

	@SerializedName("V")
	private String V;

	@SerializedName("categories_key")
	private String categoriesKey;

	@SerializedName("review_enabled")
	private String reviewEnabled;

	@SerializedName("categories")
	private String categories;

	@SerializedName("sort_order")
	private String sortOrder;

	public String getBundleGroup(){
		return bundleGroup;
	}

	public String getAvailableOn(){
		return availableOn;
	}

	public String getD(){
		return D;
	}

	public String getSellOnItsOwn(){
		return sellOnItsOwn;
	}

	public String getG(){
		return G;
	}

	public String getAvailable(){
		return available;
	}

	public String getPrintOrder(){
		return printOrder;
	}

	public String getPrintItemComponentOrder(){
		return printItemComponentOrder;
	}

	public String getN(){
		return N;
	}

	public String getSpiced(){
		return spiced;
	}

	public String getOfferPrice(){
		return offerPrice;
	}

	public String getVE(){
		return vE;
	}

	public String getOffer(){
		return offer;
	}

	public String getCategoriesEpos(){
		return categoriesEpos;
	}

	public String getV(){
		return V;
	}

	public String getCategoriesKey(){
		return categoriesKey;
	}

	public String getReviewEnabled(){
		return reviewEnabled;
	}

	public String getCategories(){
		return categories;
	}

	public String getSortOrder(){
		return sortOrder;
	}

	public void setBundleGroup(String bundleGroup) {
		this.bundleGroup = bundleGroup;
	}

	public void setAvailableOn(String availableOn) {
		this.availableOn = availableOn;
	}

	public void setD(String d) {
		D = d;
	}

	public void setSellOnItsOwn(String sellOnItsOwn) {
		this.sellOnItsOwn = sellOnItsOwn;
	}

	public void setG(String g) {
		G = g;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public void setPrintOrder(String printOrder) {
		this.printOrder = printOrder;
	}

	public void setPrintItemComponentOrder(String printItemComponentOrder) {
		this.printItemComponentOrder = printItemComponentOrder;
	}

	public void setN(String n) {
		N = n;
	}

	public void setSpiced(String spiced) {
		this.spiced = spiced;
	}

	public void setOfferPrice(String offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void setvE(String vE) {
		this.vE = vE;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public void setCategoriesEpos(String categoriesEpos) {
		this.categoriesEpos = categoriesEpos;
	}

	public void setV(String v) {
		V = v;
	}

	public void setCategoriesKey(String categoriesKey) {
		this.categoriesKey = categoriesKey;
	}

	public void setReviewEnabled(String reviewEnabled) {
		this.reviewEnabled = reviewEnabled;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public String toString() {
		return "Properties{" +
				"bundleGroup='" + bundleGroup + '\'' +
				", availableOn='" + availableOn + '\'' +
				", D='" + D + '\'' +
				", sellOnItsOwn='" + sellOnItsOwn + '\'' +
				", G='" + G + '\'' +
				", available='" + available + '\'' +
				", printOrder='" + printOrder + '\'' +
				", printItemComponentOrder='" + printItemComponentOrder + '\'' +
				", N='" + N + '\'' +
				", spiced='" + spiced + '\'' +
				", offerPrice='" + offerPrice + '\'' +
				", vE='" + vE + '\'' +
				", offer='" + offer + '\'' +
				", categoriesEpos='" + categoriesEpos + '\'' +
				", V='" + V + '\'' +
				", categoriesKey='" + categoriesKey + '\'' +
				", reviewEnabled='" + reviewEnabled + '\'' +
				", categories='" + categories + '\'' +
				", sortOrder='" + sortOrder + '\'' +
				'}';
	}
}