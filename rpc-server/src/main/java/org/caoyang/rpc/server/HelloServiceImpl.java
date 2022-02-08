package org.caoyang.rpc.server;

import org.caoyang.rpc.api.HelloObject;
import org.caoyang.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements HelloService{
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("[server:] recevice message  {} " ,object.getMessage());
        return "[server:] hello id=" + object.getId();
    }
}
