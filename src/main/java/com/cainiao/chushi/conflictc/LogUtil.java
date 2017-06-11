package com.cainiao.chushi.conflictc;

/**
 * Created by dengrong on 2017/6/2.
 */

import com.cainiao.chushi.sdk.service.BusinessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dengrong on 2017/6/2.
 */
public class LogUtil implements BusinessService{
    private Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public void execute(String name){
        // 记录error信息
        System.out.println("--------------------------------");
        logger.error("[info message]");
        // 记录info，还可以传入参数
        logger.info("[info message]{},{},{},{}", "abc", false, 123,
                new LogUtil());
        // 记录deubg信息
        logger.debug("[debug message]");
        logger.trace("[trace message]");
        System.out.println(name);
        System.out.println("---------------------------------");
    }
}
