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
	private List<ProductInfoDTO> currentProductInfoPage;
	private boolean hasNextPage;
	private boolean hasPreviousPage;
	private int nextPageNo;
	private int previousPageNo;

	public int getTotalPageSize(){
		return totalPageSize;
	}
	public void setTotalPageSize(int totalPageSize){
		this.totalPageSize = totalPageSize;
	}



}
