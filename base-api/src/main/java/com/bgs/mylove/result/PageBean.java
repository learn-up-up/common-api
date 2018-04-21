package com.bgs.mylove.result;

import java.util.List;

/**
 * <pre>
 * *********************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * *********************************************
 *  Version       Date      Author    Desc
 *   v1.0     2018-04-19      wujianwen  ${添加描述}
 *
 * *********************************************
 * </pre>
 */
public class PageBean<T> {
	public int page = 0; 	//页码
	public int limit = 20;	//数量
	public long pageTotal = 0;//总页数
	public long amount = 0;	//总量

	public List<T> pageData;

	public PageBean(int page, int limit, long pageTotal, long amount, List<T> pageData) {
		super();
		this.page = page;
		this.limit = limit;
		this.pageTotal = pageTotal;
		this.amount = amount;
		this.pageData = pageData;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(long pageTotal) {
		this.pageTotal = pageTotal;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public List<T> getPageData() {
		return pageData;
	}

	public void setPageData(List<T> pageData) {
		this.pageData = pageData;
	}
}
