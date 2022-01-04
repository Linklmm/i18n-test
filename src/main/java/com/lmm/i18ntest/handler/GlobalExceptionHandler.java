package com.lmm.i18ntest.handler;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * @author minmin.liu
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @Resource
    private MessageSource messageSource;

//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public void handleException(Exception e) {
//        if (e instanceof RuntimeException) {
//            String language = UserLanguageContextHandler.getLanguage();
//            Locale locale = Locale.CHINA;
//            if ("en_US".equals(language)) {
//                locale = Locale.ENGLISH;
//            } else if ("zh_CN".equals(language)) {
//                locale = Locale.CHINA;
//            }
//            String message = messageSource.getMessage(e.getMessage(), null, locale);
//            throw new RuntimeException(message);
//        }
//    }
}
