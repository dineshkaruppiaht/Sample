package com.sample.util;

public class ResponseData<T> {

	private int resposnsecode;
	private String description;
	private T data;
	public int getResposnsecode() {
		return resposnsecode;
	}
	public void setResposnsecode(int resposnsecode) {
		this.resposnsecode = resposnsecode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	

}
