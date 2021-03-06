package com.internousdev.sampleweb.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dao.MCategoryDAO;
import com.internousdev.sampleweb.dto.MCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateProductAction extends ActionSupport implements SessionAware{

	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription; //詳細
	private int price;
	private String imageFileName;
	private String releaseDate;
	private String releaseCompany;

	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();

	private Map<String,Object> session;
	public String execute(){
		String result = ERROR;
//		★★エラー処理してない★★
//いらなくない？次でいれるし空白だし・・・と思ったけどエラーで戻ってきたときに消えないようだった
		session.put("productId",productId);
		session.put("productName",productName);
		session.put("productNameKana",productNameKana);
		session.put("productDescription",productDescription);
		session.put("price", price);
		session.put("imageFileName", imageFileName);
		session.put("releaseDate", releaseDate);
		session.put("releaseCompany", releaseCompany);

		if(!session.containsKey("mCategoryDtoList")){
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		result = SUCCESS;
		return result;

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}
