package com.lmm.i18ntest.handler;

import org.springframework.context.MessageSource;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author minmin.liu
 * @version 1.0
 */
public class MessageInterceptor implements HandlerInterceptor {
    @Resource
    private MessageSource messageSource;

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        UserLanguageContextHandler.setLanguage(request.getHeader("UserLanguage"));
//        return true;
//    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof RuntimeException) {
            String language = request.getHeader("UserLanguage");
            Locale locale = request.getLocale();
            if (!StringUtils.hasText(language)) {
                locale = request.getLocale();
            } else if ("en_US".equals(language)) {
                locale = Locale.ENGLISH;
            } else if ("zh_CN".equals(language)) {
                locale = Locale.CHINA;
            }
            String message = messageSource.getMessage(ex.getMessage(), null, locale);
            throw new RuntimeException(message);
        }
        response.getTrailerFields();
    }
}
