package com.rajibroy.technovotest.model;

import com.google.gson.annotations.SerializedName;

public class FilesItem{

	@SerializedName("key_name")
	private String keyName;

	@SerializedName("product_uuid")
	private String productUuid;

	@SerializedName("content_type")
	private String contentType;

	@SerializedName("file_uuid")
	private String fileUuid;

	@SerializedName("file_name")
	private String fileName;

	@SerializedName("scope")
	private String scope;

	@SerializedName("last_update")
	private String lastUpdate;

	@SerializedName("creation_date")
	private String creationDate;

	public String getKeyName(){
		return keyName;
	}

	public String getProductUuid(){
		return productUuid;
	}

	public String getContentType(){
		return contentType;
	}

	public String getFileUuid(){
		return fileUuid;
	}

	public String getFileName(){
		return fileName;
	}

	public String getScope(){
		return scope;
	}

	public String getLastUpdate(){
		return lastUpdate;
	}

	public String getCreationDate(){
		return creationDate;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public void setProductUuid(String productUuid) {
		this.productUuid = productUuid;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setFileUuid(String fileUuid) {
		this.fileUuid = fileUuid;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "FilesItem{" +
				"keyName='" + keyName + '\'' +
				", productUuid='" + productUuid + '\'' +
				", contentType='" + contentType + '\'' +
				", fileUuid='" + fileUuid + '\'' +
				", fileName='" + fileName + '\'' +
				", scope='" + scope + '\'' +
				", lastUpdate='" + lastUpdate + '\'' +
				", creationDate='" + creationDate + '\'' +
				'}';
	}
}