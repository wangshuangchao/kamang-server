package com.mugua.qichacha.pojo;

public class Paging {

	private int PageSize;//每页显示数据数默认10
	private int PageIndex;//页码 默认1
	private int TotalRecords;//查询到的总记录数
	public Paging() {
		super();
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	public int getPageIndex() {
		return PageIndex;
	}
	public void setPageIndex(int pageIndex) {
		PageIndex = pageIndex;
	}
	public int getTotalRecords() {
		return TotalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		TotalRecords = totalRecords;
	}
	@Override
	public String toString() {
		return "Paging [PageSize=" + PageSize + ", PageIndex=" + PageIndex + ", TotalRecords=" + TotalRecords + "]";
	}
	
}
