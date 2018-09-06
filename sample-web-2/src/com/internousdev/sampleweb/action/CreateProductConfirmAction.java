package com.internousdev.sampleweb.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dto.MCategoryDTO;
import com.internousdev.sampleweb.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;


public class CreateProductConfirmAction extends ActionSupport implements SessionAware{
//	ふぁいるぱすはちょくで./images
//	カテゴリーはリスト
//	日付じゃないかも

	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int price;
	private String releaseDate;
	private String releaseCompany;
	private int categoryId;

	private File userImage;
	private String userImageContentType;
	private String userImageFileName;
	private String fileExtension;

	private String categoryName;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private Map<String,Object> session;

	public String execute(){
		String result = ERROR;

//		InputChecker全部むししてる

		session.put("productId",productId);
		session.put("productName",productName);
		session.put("productNameKana", productNameKana);
		session.put("price", price);
		session.put("categoryId", categoryId);
		session.put("releaseCompany", releaseCompany);
		session.put("releaseDate", releaseDate);
		session.put("productDescription", productDescription);

		System.out.println(userImageFileName);
		String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images/");
		System.out.println("Image Location:"+filePath);

		CommonUtility commonUtility = new CommonUtility();
		userImageFileName = commonUtility.getRamdomValue()+userImageFileName;

		File fileToCreate = new File(filePath,userImageFileName);
		try{
			FileUtils.copyFile(userImage, fileToCreate);
			session.put("imageFileName", userImageFileName);
			session.put("imageFilePath", "./images/"+userImageFileName);
			session.put("image_flg", userImageFileName);
		}catch(IOException e){
			e.printStackTrace();
		}



//		session.put("imageFileName", imageFileName);

//		カテゴリーIDから名前検索のはず・・・
//		System.out.println( Integer.parseInt(String.valueOf(session.get("categoryId"))));
//
//		int i = Integer.parseInt(String.valueOf(session.get("categoryId")))-1;
//
//		MCategoryDAO mCategoryDao = new MCategoryDAO();
//		mCategoryDtoList = mCategoryDao.getMCategoryList();
//		categoryName = mCategoryDtoList.get(i).getCategoryName();
//
//		session.put("categoryName",categoryName);
//		System.out.println(session.get("categoryName"));

//		ファイルパスから画像名だけ抽出してるつもりクロームできないかも
//
//		String imageFileName = session.get("imageFileName").toString();
//		String onlyImageFileName = imageFileName.substring(imageFileName.lastIndexOf("images")+7);
//		String onlyImageFileNameComplete = onlyImageFileName.substring(0,onlyImageFileName.length()-2);
//		System.out.println(imageFileName);
//		System.out.println("★"+onlyImageFileNameComplete);
//		session.put("imageFileName", onlyImageFileNameComplete);
//		imageFileName = onlyImageFileNameComplete;
		result = SUCCESS;
		return result;

	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

//	public String getImageFileName() {
//		return imageFileName;
//	}
//
//	public void setImageFileName(String imageFileName) {
//		this.imageFileName = imageFileName;
//	}

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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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