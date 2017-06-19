package com.cainiao.chushi.conflictc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.Map;

/**
 * Created by dengrongguan on 2017/6/17.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:com/cainiao/chushi/conflictc/alphabird-biz.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("com/cainiao/chushi/conflictc/alphabird-biz.xml");
        LogUtil logUtil = (LogUtil) factory.getBean("logUtil");
//        Map<String,LogUtil> map = factory.getBeansOfType(LogUtil.class);
//        System.out.println(map.keySet());
    }
}
