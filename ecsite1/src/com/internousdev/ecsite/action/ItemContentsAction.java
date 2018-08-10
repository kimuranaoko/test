package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemContentsDAO;
import com.internousdev.ecsite.dto.ItemContentsDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemContentsAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private ItemContentsDAO itemContentsDAO = new ItemContentsDAO();


	public String execute() throws SQLException{

		String itemName = "あいうえお";
		System.out.println("1");
		ItemContentsDTO dto = itemContentsDAO.getItemContents(itemName);

		session.put("AItemName",dto.getItemName());
		session.put("AItemPrice", dto.getItemPrice());
		session.put("AItemStock", dto.getItemStock());
		session.put("Ainsert_date",dto.getInsert_date());

		System.out.println(session.get("AItemName"));

		System.out.println("4");

		String result = SUCCESS;
		return result;


	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}


	public ItemContentsDAO getItemContentsDAO() {
		return itemContentsDAO;
	}

	public void setItemContentsDAO(ItemContentsDAO itemContentsDAO) {
		this.itemContentsDAO = itemContentsDAO;
	}

}
