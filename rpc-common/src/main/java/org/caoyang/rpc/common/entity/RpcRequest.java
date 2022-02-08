package org.caoyang.rpc.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author caoyang
 * @Description rpc调用的请求结构
 * @Date 2022/2/9
 **/
@Data
@Builder
public class RpcRequest implements Serializable {
    //接口名
    private String interfaceName;
    //方法名
    private String methodName;
    //参数列表
    private Object[] params;
    //参数类型
    private Class<?>[] paramTypes;
}
