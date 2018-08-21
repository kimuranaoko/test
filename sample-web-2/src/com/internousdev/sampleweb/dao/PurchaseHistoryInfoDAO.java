package com.internousdev.sampleweb.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.internousdev.sampleweb.dto.PurchaseHistoryInfoDTO;
//import com.internousdev.sampleweb.util.DBConnector;
//
public class PurchaseHistoryInfoDAO {
//
//	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryList(String loginId){
//		DBConnector dbConnector = new DBConnector();
//		Connection connection = dbConnector.getConnection();
//		List<PurchaseHistoryInfoDTO> purchaseHistroryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();
//		String sql = "SELECT"
//				+ "phi.id as id,"
//				+ "phi.user_id as user_id,"
//				+ "phi.product_count as product_count,"
//				+ "pi.product_id as product_id,"
//				+ "pi.product_name as product_name,"
//				+ "pi.product_name_kana as product_name_kana,"
//				+ "pi.product_description as product_description,"
//				+ "pi.category_id as category_id,"
//				+ "pi.price,"
//				+ "pi.image_file_name as image_file_name,"
//				+ "pi.image_file_path as image_file_path,"
//				+ "pi.release_company,"
//				+ "pi.release_date,"
//				+ "phi.price as price,"
//				+ "phi.regist_date as regist_date,"
//				+ "phi.update_date as update_date,"
//				+ "di.family_name as family_name,"
//				+ "di.first_name as first_name,"
//				+ "di.family_name_kana as family_name_kana,"
//				+ "di.first_name_kana as first_name_kana,"
//				+ "di.email as email,"
//				+ "di.tel_number as tel_number,"
//				+ "di.user_address as user_address,"
//				+ "FROM purchase_history as phi"   /*購入履歴と*/
//				+ "LEFT JOIN product_info as pi"  /*商品情報と*/
//				+ "ON phi.product_id = pi.product_id"
//				+ "LEFT JOIN destination_info as di"  /*宛先情報をドッキング*/
//				+ "ON phi.destination_id = di.id"
//				+ "WHERE phi.user_id= ?"	/*ユーザーIDで検索*/
//				+ "ORDER BY regist_date DESC"; /*登録日付が若い順*/
//
//		try{
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, loginId);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while(resultSet.next()){
//				PurchaseHistoryInfoDto.
//			}
//		}
//
//	}
//
}
