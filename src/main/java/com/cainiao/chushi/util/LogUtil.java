package com.cainiao.chushi.util;

/**
 * Created by dengrong on 2017/6/2.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by dengrong on 2017/6/2.
 */
public class LogUtil {
    static private Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public static void log(String name){
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
