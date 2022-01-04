package com.lmm.i18ntest.config;

import com.lmm.i18ntest.handler.MessageInterceptor;
import com.lmm.i18ntest.handler.UserLanguageContextHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author minmin.liu
 * @version 1.0
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Bean
    public HandlerInterceptor userLanguageHandler() {
        return new MessageInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLanguageHandler()).addPathPatterns("/**");
    }
}
