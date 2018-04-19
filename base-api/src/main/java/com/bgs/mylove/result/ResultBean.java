package com.bgs.mylove.result;

import java.io.Serializable;

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
public class ResultBean<T> implements Serializable {

	public static final int SUCCESS = 0;
	public static final int FAIL = 1;
	public static final int NO_PEMISSION= 2;

	private String msg = "success";
	private int	code = SUCCESS;

	private T data;

	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.data = data;
	}

	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}

}
