package com.lmm.i18ntest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class I18nTestApplicationTests {

    @Test
    void contextLoads() {
        Long id = new Long(1476858947156692993L);
        System.out.println(id%10);
    }

}
