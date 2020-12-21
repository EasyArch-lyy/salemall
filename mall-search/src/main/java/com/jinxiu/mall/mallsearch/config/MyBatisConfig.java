package com.jinxiu.mall.mallsearch.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan({"com.jinxiu.mall.mapper","com.macro.mall.search.dao"})
public class MyBatisConfig {
}
