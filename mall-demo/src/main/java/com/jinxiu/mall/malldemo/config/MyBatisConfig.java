package com.jinxiu.mall.malldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan("com.jinxiu.mall.mallmbg.mapper")
public class MyBatisConfig {
}
