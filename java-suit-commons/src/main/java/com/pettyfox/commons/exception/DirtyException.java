package com.pettyfox.commons.exception;


/**
 * 脏数据异常，不需要捕获，在任何代码都能抛出，有全局异常统一处理
 *
 * @author Petty Fox
 */
public class DirtyException extends RuntimeException {

    public DirtyException(String message) {
        super(message);
    }

}
