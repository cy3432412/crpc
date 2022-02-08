package org.caoyang.rpc.server;

import org.caoyang.rpc.api.HelloService;
import org.caoyang.rpc.core.registry.DefaultServiceRegistry;
import org.caoyang.rpc.core.registry.ServiceRegistry;
import org.caoyang.rpc.core.server.RpcServer;

public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);

    }
}
