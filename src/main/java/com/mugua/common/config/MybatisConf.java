package com.mugua.common.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;
@Configuration 
public class MybatisConf {

	 @Bean  
     public PageHelper pageHelper() {  
       // System.out.println("MyBatisConfiguration.pageHelper()");  
         PageHelper pageHelper = new PageHelper();  
         Properties p = new Properties();  
         p.setProperty("offsetAsPageNum", "true");  
         p.setProperty("rowBoundsWithCount", "true");  
         p.setProperty("reasonable", "false");  //是否开启合理化
         pageHelper.setProperties(p);  
         return pageHelper;  
     }  
}
