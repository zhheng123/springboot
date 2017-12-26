package com.soda.exception;

import com.soda.enums.ResultEnum;

public class CommonException extends RuntimeException{

	 private Integer code;

	    public CommonException(ResultEnum resultEnum) {
	        super(resultEnum.getMsg());
	        this.code = resultEnum.getCode();
	    }

	    public Integer getCode() {
	        return code;
	    }

	    public void setCode(Integer code) {
	        this.code = code;
	    }

}
