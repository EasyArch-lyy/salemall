package com.jinxiu.mall.malladmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.jinxiu.mall.mallmbg.mapper","com.jinxiu.mall.mallmbg.dao"})
public class MyBatisConfig {
}
