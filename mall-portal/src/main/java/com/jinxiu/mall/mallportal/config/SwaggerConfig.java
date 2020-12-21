package com.jinxiu.mall.mallportal.config;

import com.jinxiu.mall.mallcommon.config.BaseSwaggerConfig;
import com.jinxiu.mall.mallcommon.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.portal.controller")
                .title("mall前台系统")
                .description("mall前台相关接口文档")
                .contactName("jinxiu")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
