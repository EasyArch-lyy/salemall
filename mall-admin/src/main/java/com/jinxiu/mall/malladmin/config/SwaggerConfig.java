package com.jinxiu.mall.malladmin.config;

import com.jinxiu.mall.mallcommon.config.BaseSwaggerConfig;
import com.jinxiu.mall.mallcommon.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.jinxiu.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("jinxiu")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
