package com.gov.train.common.utils;

/**
 * Created by liupei on 2017/8/1.
 */
public class ResponseEntity<T> {
    /**
     * response code
     */
    private int code;
    /**
     * response data
     */
    private T t;
    /**
     * response message
     */
    private String message;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ResponseEntity(int code, T t, String message) {
        this.code = code;
        this.t = t;
        this.message = message;
    }
}
