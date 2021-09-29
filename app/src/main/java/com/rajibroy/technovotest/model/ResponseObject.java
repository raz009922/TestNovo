package com.rajibroy.technovotest.model;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseObject implements Serializable {

	@SerializedName("default_units")
	private int defaultUnits;

	@SerializedName("visible")
	private boolean visible;

	@SerializedName("skip_children_price")
	private boolean skipChildrenPrice;

	@SerializedName("average_rate")
	private double averageRate;

	@SerializedName("description")
	private String description;

	@SerializedName("language")
	private String language;

	@SerializedName("creation_date")
	private String creationDate;

	@SerializedName("creator_provider_uuid")
	private String creatorProviderUuid;

	@SerializedName("min_units")
	private int minUnits;

	@SerializedName("price_history")
	private List<PriceHistoryItem> priceHistory;

	@SerializedName("product_uuid")
	private String productUuid;

	@SerializedName("product_type")
	private String productType;

	@SerializedName("max_units")
	private int maxUnits;

	@SerializedName("price")
	private Price price;

	@SerializedName("last_update")
	private String lastUpdate;

	@Expose
	@SerializedName("files")
	private List<FilesItem> files;

	@SerializedName("short_name")
	private String shortName;

	@SerializedName("discountable")
	private boolean discountable;

	@SerializedName("properties")
	private Properties properties;

	@SerializedName("status")
	private String status;

	public void setDefaultUnits(int defaultUnits) {
		this.defaultUnits = defaultUnits;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public void setSkipChildrenPrice(boolean skipChildrenPrice) {
		this.skipChildrenPrice = skipChildrenPrice;
	}

	public void setAverageRate(double averageRate) {
		this.averageRate = averageRate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setCreatorProviderUuid(String creatorProviderUuid) {
		this.creatorProviderUuid = creatorProviderUuid;
	}

	public void setMinUnits(int minUnits) {
		this.minUnits = minUnits;
	}

	public void setPriceHistory(List<PriceHistoryItem> priceHistory) {
		this.priceHistory = priceHistory;
	}

	public void setProductUuid(String productUuid) {
		this.productUuid = productUuid;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setMaxUnits(int maxUnits) {
		this.maxUnits = maxUnits;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setFiles(List<FilesItem> files) {
		this.files = files;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setDiscountable(boolean discountable) {
		this.discountable = discountable;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDefaultUnits(){
		return defaultUnits;
	}

	public boolean isVisible(){
		return visible;
	}

	public boolean isSkipChildrenPrice(){
		return skipChildrenPrice;
	}

	public double getAverageRate(){
		return averageRate;
	}

	public String getDescription(){
		return description;
	}

	public String getLanguage(){
		return language;
	}

	public String getCreationDate(){
		return creationDate;
	}

	public String getCreatorProviderUuid(){
		return creatorProviderUuid;
	}

	public int getMinUnits(){
		return minUnits;
	}

	public List<PriceHistoryItem> getPriceHistory(){
		return priceHistory;
	}

	public String getProductUuid(){
		return productUuid;
	}

	public String getProductType(){
		return productType;
	}

	public int getMaxUnits(){
		return maxUnits;
	}

	public Price getPrice(){
		return price;
	}

	public String getLastUpdate(){
		return lastUpdate;
	}

	public List<FilesItem> getFiles(){
		return files;
	}

	public String getShortName(){
		return shortName;
	}

	public boolean isDiscountable(){
		return discountable;
	}

	public Properties getProperties(){
		return properties;
	}

	public String getStatus(){
		return status;
	}

	@Override
	public String toString() {
		return "ResponseObject{" +
				"defaultUnits=" + defaultUnits +
				", visible=" + visible +
				", skipChildrenPrice=" + skipChildrenPrice +
				", averageRate=" + averageRate +
				", description='" + description + '\'' +
				", language='" + language + '\'' +
				", creationDate='" + creationDate + '\'' +
				", creatorProviderUuid='" + creatorProviderUuid + '\'' +
				", minUnits=" + minUnits +
				", priceHistory=" + priceHistory +
				", productUuid='" + productUuid + '\'' +
				", productType='" + productType + '\'' +
				", maxUnits=" + maxUnits +
				", price=" + price +
				", lastUpdate='" + lastUpdate + '\'' +
				", files=" + files +
				", shortName='" + shortName + '\'' +
				", discountable=" + discountable +
				", properties=" + properties +
				", status='" + status + '\'' +
				'}';
	}
}