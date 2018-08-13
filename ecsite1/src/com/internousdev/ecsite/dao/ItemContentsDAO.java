package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ItemContentsDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ItemContentsDAO {


	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


//	詳細
	public  ItemContentsDTO getItemContents(String itemId) throws SQLException{
		ItemContentsDTO dto = new ItemContentsDTO();
		String sql="SELECT id,item_name,item_price,item_stock,insert_date FROM item_info_transaction WHERE id = ? ORDER BY item_name ";

		try{
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemId);
			ResultSet resultSet = preparedStatement.executeQuery();


			if(resultSet.next()){
				dto.setItemId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsert_date(resultSet.getString("insert_date"));
			}

			System.out.println("ID:"+dto.getItemId());
			System.out.println("Name:"+dto.getItemName());
			System.out.println("Price:"+dto.getItemPrice());
			System.out.println("Stock:"+dto.getItemStock());
			System.out.println("date:"+dto.getInsert_date());

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return dto;

	}

	//削除
		public  int itemDelete(String itemId) throws SQLException{

			String sql="DELETE FROM item_info_transaction WHERE id=?";

			PreparedStatement preparedStatement = null;

			int result = 0;

			try{
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, itemId);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				connection.close();
			}
			return result;
		}
}
