package org.caoyang.rpc.common.exception;

import org.caoyang.rpc.common.constant.RpcStatusError;

public class RpcException extends RuntimeException {

    public RpcException(RpcStatusError error, String detail) {
        super(error.getMessage() + ": " + detail);
    }

    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcException(RpcStatusError error) {
        super(error.getMessage());
    }

}
