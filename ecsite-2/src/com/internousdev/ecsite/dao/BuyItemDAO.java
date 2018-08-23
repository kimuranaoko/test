package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
//
//	public BuyItemDTO getBuyItemInfo(){
//		String sql = "SELECT id,item_name,item_price FROM item_info_transaction";
//
//		try{
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			if(resultSet.next()){
//				buyItemDTO.setId(resultSet.getInt("id"));
//				buyItemDTO.setItemName(resultSet.getString("item_name"));
//				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//
//		return buyItemDTO;
//	}

	public ArrayList<BuyItemDTO> getBuyItemInfo() throws SQLException{

		ArrayList<BuyItemDTO> buyItemDTO = new ArrayList<BuyItemDTO>();

		String sql= "SELECT id,item_name,item_price FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				buyItemDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return buyItemDTO;
	}

	public String getBuyItemInfo(String itemName) throws SQLException{

		ArrayList<BuyItemDTO> buyItemDTO = new ArrayList<BuyItemDTO>();

		String sql= "SELECT item_price FROM item_info_transaction WHERE item_name=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				buyItemDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return "aaa";
	}

	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}
}
