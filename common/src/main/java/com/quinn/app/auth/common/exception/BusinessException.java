package com.quinn.app.auth.common.exception;


import com.quinn.app.auth.common.util.LogUtils;

public class BusinessException extends RuntimeException {

    public BusinessException(String code , String message){
        super(message);
        LogUtils.error(code,message);
    }
}
