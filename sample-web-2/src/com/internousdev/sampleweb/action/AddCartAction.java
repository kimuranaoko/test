package com.internousdev.sampleweb.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dao.CartInfoDAO;
import com.internousdev.sampleweb.dto.CartInfoDTO;
import com.internousdev.sampleweb.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{

	private int productId;
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private int price;
	private String productCount;
	private String releaseCompany;
	private Date releaseDate;
	private String productDescription;
	
	private String vategoryId;
	
	private Map<String,Object> session;
	
	public Map<String,Object> session;
	public String execute(){
		String result = ERROR;
		String userId = null;
		String tempUserId = null;
//		もしログインしてなければ検証用のにランダムで数字入れて
		if(!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))){
			CommonUtility commonUtility = new CommonUtility();
			session.put("tempUserId", commonUtility.getRamdomValue());
		}
		if(session.containsKey("loginId")){
			userId = String.valueOf(session.get("loginId"));
		}
		if(!(session.containsKey("loginId")) && session.containsKey("tempUserId")){
			userId = String.valueOf(session.get("tempUserId"));
			tempUserId = String.valueOf(session.get("tempUserId"));
		}
		productCount = String.valueOf((productCount.split(" ," , 0))[0]);
		
		CartInfoDAO cartInfoDao = new CartInfoDAO();
//		新しく作成してINSERT
		int count = cartInfoDao.regist(userId, tempUserId, productId, productCount, price);
		if(count > 0){
			result = SUCCESS;
		}
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();
		if
		
		
	}
}
