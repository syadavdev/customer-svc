package com.sandi.customer.config;

import com.sandi.commonsvc.config.SwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CustomerSwaggerConfig extends SwaggerConfig {

    @Override
    protected String getControllerPackage() {
        return "com.sandi.customer.controller";
    }

    @Override
    protected String getTitle(){
        return "Customer Service";
    }

    @Override
    protected String getDescription(){
        return "Customer Api's";
    }

}