package com.example.azkaar.response;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("latitude")
	private Object latitude;

	@SerializedName("longitude")
	private Object longitude;

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"latitude = '" + latitude + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}