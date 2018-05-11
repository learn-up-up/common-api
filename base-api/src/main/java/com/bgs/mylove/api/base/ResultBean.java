package com.bgs.mylove.api.base;

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
	private static final long serialVersionUID = -3569025123926482883L;

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
	//不加getter会让数据返回转换异常
	public static int getSUCCESS() {
		return SUCCESS;
	}

	public static int getFAIL() {
		return FAIL;
	}

	public static int getNoPemission() {
		return NO_PEMISSION;
	}

	public String getMsg() {
		return msg;
	}

	public int getCode() {
		return code;
	}

	public T getData() {
		return data;
	}
}
