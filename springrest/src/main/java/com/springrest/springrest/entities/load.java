package com.springrest.springrest.entities;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "load")
public class load {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name ="loadId")
	private long loadId;
    
    @Column(name ="loadingPoint")
	private String loadingPoint;
    
    @Column(name ="unloadingPoint")
	private String unloadingPoint;
    
    @Column(name ="productType")
	private String productType;
    
    @Column(name ="truckType")
	private String truckType;
    
    @Column(name ="noOfTrucks")
	private long noOfTrucks;
    
    @Column(name ="weight")
	private long weight;
    
    @Column(name ="comment")
	private String comment;
    
    @Column(name ="shipperId")
	private long shipperId;
    
    @Column(name ="date")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String date;
	

	public load(long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			long noOfTrucks, long weight, String comment, long shipperId, String date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}


	public load() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getLoadId() {
		return loadId;
	}


	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}


	public String getLoadingPoint() {
		return loadingPoint;
	}


	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}


	public String getUnloadingPoint() {
		return unloadingPoint;
	}


	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getTruckType() {
		return truckType;
	}


	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}


	public long getNoOfTrucks() {
		return noOfTrucks;
	}


	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}


	public long getWeight() {
		return weight;
	}


	public void setWeight(long weight) {
		this.weight = weight;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public long getShipperId() {
		return shipperId;
	}


	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "load [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
