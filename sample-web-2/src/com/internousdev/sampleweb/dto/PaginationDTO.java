package com.internousdev.sampleweb.dto;

import java.util.ArrayList;
import java.util.List;

public class PaginationDTO {

	private int totalPageSize;
	private int currentPageNo;
	private int totalRecordSize;
	private int startRecordNo;
	private int endRecordNo;
	private List<Integer> pageNumberList = new ArrayList<Integer>();
//	CURRENT＝現在の
	private List<ProductInfoDTO> currentProductInfoPage;
	private boolean hasNextPage;
//	Previous＝前の
	private boolean hasPreviousPage;
	private int nextPageNo;
	private int previousPageNo;

	public int getTotalPageSize(){
		return totalPageSize;
	}
	public void setTotalPageSize(int totalPageSize){
		this.totalPageSize = totalPageSize;
	}
	public int getCurrentPageNo(){
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo){
		this.currentPageNo = currentPageNo;
	}
	public int getTotalRecordSize(){
		return totalRecordSize;
	}
	public void setTotalRecordSize(int recordSize){
		this.totalRecordSize = recordSize;
	}
	public int getStartRecordNo(){
		return startRecordNo;
	}
	public void setStartRecordNo(int startRecordNo){
		this.startRecordNo = startRecordNo;
	}
	public int getEndRecordNo(){
		return endRecordNo;
	}
	public void setEndRecordNo(int endRecordNo){
		this.endRecordNo = endRecordNo;
	}
	public List<Integer> getPageNumberList(){
		return pageNumberList;
	}
	public void setPageNumberList(List<Integer> pageNumberList){
		this.pageNumberList = pageNumberList;
	}
	public List<ProductInfoDTO> getCurrentProductInfoPage(){
		return currentProductInfoPage;
	}
	public void setCurrentProductInfoPage(List<ProductInfoDTO> currentProductInfoPage){
		this.currentProductInfoPage = currentProductInfoPage;
	}
	public boolean hasNextPage(){
		return hasNextPage;
	}
	public void setNextPage(boolean hasNextPage){
		this.hasNextPage = hasNextPage;
	}
	public boolean hasPreviousPage(){
		return hasPreviousPage;
	}
	public void setPreviousPage(boolean hasPreviousPage){
		this.hasPreviousPage = hasPreviousPage;
	}
	public int getNextPageNo(){
		return nextPageNo;
	}
	public void setNextPageNo(int nextPageNo){
		this.nextPageNo = nextPageNo;
	}
	public int getPreviousPageNo(){
		return previousPageNo;
	}
	public void setPreviousPageNo(int previousPageNo){
		this.previousPageNo = previousPageNo;
	}

}
