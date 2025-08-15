package com.tiv.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 业务响应封装类
 */
@Data
@AllArgsConstructor
public class BusinessResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    @Serial
    private static final long serialVersionUID = 1L;

}
