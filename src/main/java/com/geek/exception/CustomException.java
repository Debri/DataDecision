package com.geek.exception;

/**
 * Created by Liuqi
 * Date: 2016/10/24.
 */
public class CustomException extends  Exception {
    private static final long serialVersionUID = 1L;
    // 异常信息
    public String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
