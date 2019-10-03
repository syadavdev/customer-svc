package com.sandi.customer.config;

import com.sandi.commonsvc.config.OAuthResourceServerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class CustomerOAuthResourceServerConfig extends OAuthResourceServerConfig {
}
