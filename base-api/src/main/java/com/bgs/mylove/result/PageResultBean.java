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
public class PageResultBean<T> extends ResultBean<T> {
	public int page = 0; 	//页码
	public int limit = 20;	//数量
	public long pageTotal = 0;//总页数
	public long amount = 0;	//总量

	public List<T> pageData;

	public PageResultBean(int page, int limit, long pageTotal, long amount, List<T> pageData) {
		super();
	}
}
