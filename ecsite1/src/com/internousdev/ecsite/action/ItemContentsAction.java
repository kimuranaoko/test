package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemContentsDAO;
import com.internousdev.ecsite.dto.ItemContentsDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemContentsAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private ItemContentsDAO itemContentsDAO = new ItemContentsDAO();
	private String itemId;
	private String deleteFlg;
	private String message;



	public String execute() throws SQLException{

		System.out.println(deleteFlg);
		if(deleteFlg == null){

		ItemContentsDTO dto = itemContentsDAO.getItemContents(itemId);

		session.put("AItemId",dto.getItemId());
		session.put("AItemName",dto.getItemName());
		session.put("AItemPrice", dto.getItemPrice());
		session.put("AItemStock", dto.getItemStock());
		session.put("Ainsert_date",dto.getInsert_date());

		}else if(deleteFlg.equals("1")){
			delete();
		}


		String result = SUCCESS;
		return result;


	}

	public void delete() throws SQLException{

		int res = itemContentsDAO.itemDelete(itemId);

		if(res>0){
			setMessage("商品情報を正しく削除しました。");

		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}


	}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getItemId(){
		return itemId;
	}

	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	public Map<String, Object> getSession() {
		return session;
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
