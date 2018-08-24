package com.internousdev.sampleweb.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.sampleweb.dto.PaginationDTO;
import com.internousdev.sampleweb.dto.ProductInfoDTO;

public class Pagination {
//	商品ページのページ数設定ってことしかわからん！
	public PaginationDTO initialize(List<ProductInfoDTO> list,int pageSize){

		PaginationDTO paginationDTO = new PaginationDTO();
		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		paginationDTO.setCurrentPageNo(1);
		paginationDTO.setTotalRecordSize(list.size() - 1);
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() -1));
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize -1));

//		１ページから全部のページ数までページNOをリストにいれる
		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize();pageNumber++){
			pageNumberList.add(pageNumber);
		}
//		テスト用のやつみたい。後でわかるといいなぁ。謎
		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		for(int pageNumberOffset =paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO.getEndRecordNo();pageNumberOffset++){
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		if((paginationDTO.getStartRecordNo() - 1)<=0){
			paginationDTO.setPreviousPage(false);
		}else{
			paginationDTO.setPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() -1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()){
			paginationDTO.setNextPage(false);
		}else{
			paginationDTO.setNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}
		return paginationDTO;
	}

	public PaginationDTO getPage(List<ProductInfoDTO> list,int pageSize,String pageNo){
		PaginationDTO paginationDTO = new PaginationDTO();
		paginationDTO.setTotalPageSize((int)(Math.ceil(list.size() / pageSize)));
		paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));
		paginationDTO.setTotalRecordSize(list.size() -1);
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() - 1));
//		paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for(int pageNumber = 1;pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++){
			pageNumberList.add(pageNumber);
		}

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		for(int pageNumberOffset = paginationDTO.getStartRecordNo();pageNumberOffset <= paginationDTO.getEndRecordNo(); pageNumberOffset++){
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductInfoPage(productInfoPages);

		if((paginationDTO.getStartRecordNo() - 1) <=0){
			paginationDTO.setPreviousPage(false);
		}else{
			paginationDTO.setPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if(paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()){
			paginationDTO.setNextPage(false);
		}else{
			paginationDTO.setNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}

		return paginationDTO;

	}

}
