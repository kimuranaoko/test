package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private int count;
	private String pay;
	private String itemPriceFlg;
	private String itemName;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();


	public String execute(){
		String result = SUCCESS;

//		if(itemPriceFlg.equals("1")){
//			result ="PRICE";
//		}else{
			session.put("count",count);

			try {
				String price=buyItemDAO.getBuyItemInfo(itemName);
				session.put("buyItem_price",price);
			} catch (SQLException e) {
				e.printStackTrace();
			}


			int intCount = Integer.parseInt(session.get("count").toString());
			int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
			session.put("total_price",intCount * intPrice);
			String payment;
			if(pay.equals("1")){
				payment="現金払い";
				session.put("pay",payment);
			}else{
				payment="クレジットカード";
				session.put("pay", payment);
			}
//		}
		return result;
	}

	public String getItemPriceFlg() {
		return itemPriceFlg;
	}

	public void setItemPriceFlg(String itemPriceFlg) {
		this.itemPriceFlg = itemPriceFlg;
	}

	public void setCount(int count){
		this.count = count;
	}

	public void setPay(String pay){
		this.pay = pay;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}
