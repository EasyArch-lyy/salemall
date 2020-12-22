package com.jinxiu.mall.mallsearch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan({"com.jinxiu.mall.mallmbg.mapper","com.jinxiu.mall.mallsearch.dao"})
public class MyBatisConfig {
}
