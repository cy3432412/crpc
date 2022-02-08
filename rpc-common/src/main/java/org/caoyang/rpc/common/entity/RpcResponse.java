package org.caoyang.rpc.common.entity;

import lombok.Data;
import org.caoyang.rpc.common.constant.RpcStatusCode;

import java.io.Serializable;

@Data
public class RpcResponse<T> implements Serializable {
    //状态码
    private Integer statusCode;

    //信息
    private String message;

    //数据
    private T data;

    public static <T> RpcResponse<T> success(T data) {
        RpcResponse<T> response = new RpcResponse<>();
        response.setStatusCode(RpcStatusCode.SUCCESS.getCode());
        response.setData(data);
        return response;
    }

    public static <T> RpcResponse<T> fail(RpcStatusCode code) {
        RpcResponse<T> response = new RpcResponse<>();
        response.setStatusCode(code.getCode());
        response.setMessage(code.getMessage());
        return response;
    }

}
