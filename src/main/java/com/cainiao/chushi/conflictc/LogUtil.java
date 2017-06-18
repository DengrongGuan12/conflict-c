package com.cainiao.chushi.conflictc;

/**
 * Created by dengrong on 2017/6/2.
 */

//import com.cainiao.alphabird.biz.sdk.service.BusinessService;
//import com.cainiao.alphabird.biz.sdk.service.BusinessServiceResultDTO;
//import com.cainiao.alphabird.biz.sdk.service.ExtTraceParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by dengrong on 2017/6/2.
 */
public class LogUtil{
    private LogUtil2 logUtil2;
    public void setLogUtil2(LogUtil2 logUtil2){
        this.logUtil2 = logUtil2;
    }

    private Logger logger = LoggerFactory.getLogger(LogUtil.class);

    public void init(){
        logUtil2.log();
        System.out.println("init");
    }

//    public BusinessServiceResultDTO execute(String s, Map map) {
//        // 记录error信息
//        System.out.println("--------------------------------");
//        logger.error("[info message]");
//        // 记录info，还可以传入参数
//        logger.info("[info message]{},{},{},{}", "abc", false, 123,
//                new LogUtil());
//        // 记录deubg信息
//        logger.debug("[debug message]");
//        logger.trace("[trace message]");
//        System.out.println(s);
//        System.out.println("---------------------------------");
//        return new BusinessServiceResultDTO();
//    }

    public String[] getServedBizIds() {
        return new String[0];
    }

    public int getServicePriority() {
        return 0;
    }

//    public ExtTraceParams getExtTraceParams(String s, Map map) {
//        return null;
//    }

    public String getRequestId(String s, Map map) {
        return null;
    }
}
