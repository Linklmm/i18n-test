package com.lmm.i18ntest.handler;

/**
 * @author minmin.liu
 * @version 1.0
 */
public class UserLanguageContextHandler {
    public final static ThreadLocal<String> LANGUAGE_HANDLER = new InheritableThreadLocal<>();

    public final static void setLanguage(String language) {
        LANGUAGE_HANDLER.set(language);
    }

    public final static String getLanguage() {
        return LANGUAGE_HANDLER.get();
    }
}
