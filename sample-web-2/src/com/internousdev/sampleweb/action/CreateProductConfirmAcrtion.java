package com.internousdev.sampleweb.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class CreateProductConfirmAcrtion extends ActionSupport implements SessionAware{
//	ふぁいるぱすはちょくで./images
//	カテゴリーはリスト
//	日付じゃないかも
	private String productName;
	private String imageFileName;
	private Map<String,Object> session;

	public String execute(){

		System.out.println("aaaaaaaaaa12"+productName);
		System.out.println("aaaaaaaaaa12"+imageFileName);
		return SUCCESS;
	}

	public String getProductName() {
		return productName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
