package com.zhidisoft.crm.vo;

import java.util.List;

public class PageVO<T> {

	private Integer pageSize;
	private Integer pageNum;
	private Long totalCount;
	private Long totalPage;
	private List<T> list;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalPage() {
		if (totalCount % pageSize == 0) {
			return totalCount / pageSize;
		} else {
			return totalCount / pageSize + 1;
		}
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public boolean isFirstPage() {
		return pageNum <= 1;
	}

	public boolean isLastPage() {
		return pageNum >= getTotalPage();
	}

	public Integer getPrevPage() {
		return pageNum - 1;
	}

	public Integer getNextPage() {
		return pageNum + 1;
	}
}
